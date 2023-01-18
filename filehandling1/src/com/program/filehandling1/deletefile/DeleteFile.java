package com.program.filehandling1.deletefile;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("DeleteD:\\New folder\\DemoFile.txt");
		file.delete();
		System.out.println("File deleted...");
	}
}
