Mind Documentation Generator ${project.version}

Installing Mindoc
==================

  The following instructions show how to install Mindoc:

  1) Unpack the archive where you would like to store the binaries, eg:

# tar zxvf mindoc-${project.version}-bin.tar.gz

  2) A directory called "mindoc-${project.version}" will be created.

  3) Add the bin sub-directory to your PATH, eg:
  
# export PATH=/usr/local/mindoc-${project.version}/bin:$PATH

  4) Make sure JAVA_HOME is set to the location of your JRE or JDK

  5) Run "mindoc" to verify that it is correctly installed.

Running Mindoc
==================

  The mindoc generates HTML documentation for a set of ADL and IDL source files.
  It is used with the following command-line arguments:

# mindoc [OPTIONS] (sourcepath)+

  where sourcepath contains the ADL, IDL and implementation file to be documented.

Available options are :
 -d <arg>         The path where the documentation is generated. (default is './target/doc').
 -doctitle <arg>  Specifies the title that will be used in the the overview page.
 -overview <arg>  Specifies the file that contains the overview documentation. This document
                  will be inserted in the overview page with the list of all packages. HTML tags
                  can be used in this document, as well as Mindoc tags (documented below).
 -h,--help        Print this message and exit.
 -v               Verbose output.

Document ADL
============

Mindoc generates html documentation from ADL files. The documentation for each component 
or type definition is generated in a  HTML page which contains a list of sub-components,
interfaces, attributes, implementations and bindings. Moreover, Mindoc parses comments 
to document each of these elements. To add a comment to an entity the comment must precede 
the entity in the adl file and be enclosed by "/**" and "*/". Finally, one can document 
packages by adding named 'package.html' in the package directory.

Tags can be used in comments, in package documentations and in the overview page to add links
and images. The tags currently supported are:

+ @component to add a link to a component or a type definition and its sub-components, interfaces or attributes.
The syntaxe is as follow:
  
  @component <packageName>.<definition>: link to the documentation page of a definition. Must be
  a fully qualified name.
  
  @component <scope>#components#<subComponentName>: a link to the section 
  documenting a subcomponent of a composite component definition.
  
  @component <scope>#interfaces#<subComponentName>: a link to the section 
  documenting an interface of a component definition or a type definition.

  @component <scope>#attributes#<subComponentName>: a link to the section 
  documenting an attribute of a primitive component definition.
  
  @component <scope>#(attributes | interfaces | components): a link to the 
  summary section listing all the attributes, interfaces or components of 
  a component definition.

  <scope> is either a fully qualified name of a definition or 'this' to denote
  the current definition (invalid for package documentation).
  
+ @interface to add a link to an interface definition and its methods and type definitions.
The syntax is as follow:

  @interface <scope>#methods#<subComponentName>: a link to the section
  documenting a method of an interface.

  @interface <scope>#typedefs#<subComponentName>: a link to the section
  documenting a typedef.

  @interface <scope>#structs#<subComponentName>:  a link to the section
  documenting a struct.
  
  @interface <scope>#unions#<subComponentName>: a link to the section
  documenting a union.

  @interface <scope>#enums#<subComponentName>: a link to the section
  documenting an enum.

  @component <scope>#(methods | types): a link to the summary section
  listing all the methods or types of an interface definition.
  
+ @figure <path> [width=<width>px | height=<height>px] to include a figure in the documentation. 
  <path> must be a relative path to an image file (png, jpg or gif). Images must be stored in 
  the 'doc-files' sub-directory of the package they are used in and are copied in the destination
  directory. The path used in the tag is relative to this sub-directory. (e.g. "@link my_image.png"
  refers to doc-files/my_image.png).
  <width> or <height> are facultative options used to resize the image. The value is in pixels and
  only one option can be used. E.g. "@link image.gif width=100px" 

HTML tags are permitted in comments and package documentation.

The 'doc-files' sub-directories are copied as is in the target directory. They contain files 
referenced by the documentation (figures, binary files, ...).