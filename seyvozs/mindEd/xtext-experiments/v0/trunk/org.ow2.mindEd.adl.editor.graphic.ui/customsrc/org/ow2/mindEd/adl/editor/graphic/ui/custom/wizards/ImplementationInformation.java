package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

public class ImplementationInformation {

	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getInlineText() {
		return inlineText;
	}
	public void setInlineText(String inlineText) {
		this.inlineText = inlineText;
	}
	public boolean isFile() {
		return file;
	}
	public void setFile(boolean file) {
		this.file = file;
	}
	public boolean isInline() {
		return inline;
	}
	public void setInline(boolean inline) {
		this.inline = inline;
	}
	String filePath;
	String inlineText;
	boolean file;
	boolean inline;
	
}
