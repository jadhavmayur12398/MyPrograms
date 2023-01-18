package com.program.filehandling.files;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("D:DemoFile.txt");
		try {
			file.createNewFile();
			System.out.println("File Created Successfuly...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
