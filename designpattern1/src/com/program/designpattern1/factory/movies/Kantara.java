package com.program.designpattern1.factory.movies;

import com.program.designpattern1.factory.inter.Movie;

public class Kantara implements Movie{

	@Override
	public void nowPlaying() {

		System.out.println("Now playing Kantara");
		
	}

}
