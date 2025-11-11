package com.ariel.datetime;

public class Immutability {

	public static int max = 0;
	public final int id;
	{
		id = ++max;
	}

	
}
