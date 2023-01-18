package com.program.filehandling1.createfileinfo;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("D:\\New folder\\DemoFile.txt");
		if (file.canRead()) {
			System.out.println("File is readable...");
		} else {
			System.out.println("File is not readable...");
		}
		if (file.canWrite()) {
			System.out.println("File can writable...");
		} else {
			System.out.println("File is not writable...");
		}
		if (file.canExecute()) {
			System.out.println("File is exicutable...");
		} else {
			System.out.println("File is not exicutable");
		}
		System.out.println(file.length());
	}
}
