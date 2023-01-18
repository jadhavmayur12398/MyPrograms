package com.program.filehandling2.datainfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFile {
	public static void main(String[] args) {
		File file = new File("ByteStream.txt");
		if (file.exists()) {
			System.out.println("File exists...");
		} else {
			try {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("New file created...");
				
				FileOutputStream outputStream = new FileOutputStream(file);
				outputStream.write(45);
				System.out.println("content writen to file...");
				outputStream.close();
				
				FileInputStream inputStream = new FileInputStream(file);
				System.out.println(inputStream.read());
				System.out.println("data read from file");
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
