package com.program.filehandling2.datainfile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterFile {
	public static void main(String[] args) {
		File file = new File("CharacterStream.txt");
		try {
			if (file.exists()) {
				System.out.println("file exists");
			} else {
				file.setReadable(true);
				file.setWritable(true);
				file.createNewFile();
				System.out.println("file created");
			}
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("this is the data sent to the file");
			fileWriter.close();
			
			FileReader fileReader = new FileReader(file);
			System.out.println(fileReader.read());
			System.out.println("content read from file");
			fileReader.close();
			
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
