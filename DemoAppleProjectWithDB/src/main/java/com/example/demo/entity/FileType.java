package com.example.demo.entity;

public class FileType {

	
	private String textFile;
	private String image;
	private String pdfFiles;
	public String getTextFile() {
		return textFile;
	}
	public void setTextFile(String textFile) {
		this.textFile = textFile;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPdfFiles() {
		return pdfFiles;
	}
	public void setPdfFiles(String pdfFiles) {
		this.pdfFiles = pdfFiles;
	}
	@Override
	public String toString() {
		return "FileType [textFile=" + textFile + ", image=" + image + ", pdfFiles=" + pdfFiles + ", getTextFile()="
				+ getTextFile() + ", getImage()=" + getImage() + ", getPdfFiles()=" + getPdfFiles() + "]";
	}
	
	
}
