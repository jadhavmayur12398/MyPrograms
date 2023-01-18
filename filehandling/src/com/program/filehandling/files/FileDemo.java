package com.program.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File created successfuly...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
