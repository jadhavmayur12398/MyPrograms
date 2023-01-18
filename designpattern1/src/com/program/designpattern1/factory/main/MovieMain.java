package com.program.designpattern1.factory.main;

import java.util.Scanner;

import com.program.designpattern1.factory.inter.Movie;
import com.program.designpattern1.factory.movies.KGF2;
import com.program.designpattern1.factory.movies.Kantara;
import com.program.designpattern1.factory.movies.Pushpa;
import com.program.designpattern1.factory.movies.Vikram;

public class MovieMain {
	static boolean loop = true;
	static Movie movie;
	public static void main(String[] args) {
		while (loop) {
			try {
				((Movie) movieFacoty()).nowPlaying();
			} catch (NullPointerException e) {
				System.out.println("No movie selected");
			}
		}
	}
	public static Object movieFacoty() {
		System.out.println("Select a movie to watch:\n" + "1. KGF chapter 2\n"
				+ "2. Vikram\n"
				+ "3. Pushpa\n"
				+ "4. Kantara");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			movie = new KGF2();
			loop = false;
			return movie;
			
		case 2:
			movie = new Vikram();
			loop = false;
			return movie;
			
		case 3:
			movie = new Pushpa();
			loop = false;
			return movie;
			
		case 4:
			movie = new Kantara();
			loop = false;
			return movie;

		default:
			System.out.println("Invalid Choise");
			loop = false;
			return movie;
		}
		
	}
}
