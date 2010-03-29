# If the MIND_ROOT variable is defined, look for 'mindc' in this directory
# otherwise, expect that 'mindc' is in the PATH.
ifdef MIND_ROOT
  # If MIND_ROOT contains '\', replace them by '/' (for Windows)
  MINDC = $(subst \,/, $(MIND_ROOT)/bin/mindc)
else 
  MINDC = mindc
endif

MIND_SRC = D:\Mind\Eclipse\Workspace35\Mind\test_20-01-2010\src


all: build
ifdef MIND_COMPONENTS
	if test_20-01-2010 ! -x $(MINDC); \
        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \
    	else $(MINDC) -src-path=$(MIND_SRC) -o=build $(MIND_COMPONENTS) ;\
    fi
else
	echo "no application defined"
endif

build:
	mkdir -p build

clean:
	rm -Rf build

.PHONY: all clean build
