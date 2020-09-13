package com.khubla.hsopenapi;

/**
 * @author Tom Everett
 *         <p>
 *         Copyright (C) 2020,tom@khubla.com
 *         </p>
 */
public class Main {
	public static void main(String... args) {
		System.out.println("HomeSeer OpenAPI Server");
		try {
			Configuration.getInstance();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}