package com.program.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) {
		File file = new File("D:\\New folder\\DemoFile.txt");
		try {
			if (file.exists()) {
				System.out.println("File already exist...");
			} else {
				file.createNewFile();
				System.out.println("File created successfuly...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
