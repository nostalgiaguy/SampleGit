//**************************************************Exceptions in Constructors***************************
package com.nostalgiaguy.coreconceptpage3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInConstructor {
	public static void main(String[] args) {
		try {
			InputFile inputFile = new InputFile("Cleanup.java");
			String string;
			int i = 1;
			while ((string = inputFile.getLine()) != null)
				; // Perform line-by-line processing here...
			inputFile.dispose();
		} catch (Exception e) {
			System.err.println("Caught Exception in main");
			e.printStackTrace();
		}
	}
}
class InputFile {
	private BufferedReader input;
	public InputFile(String fileName) throws Exception {
		try {
			input = new BufferedReader(new FileReader(fileName));
			// Other code that might throw exceptions
		} catch (FileNotFoundException e) {
			System.err.println("Could not open " + fileName);
		// Wasn't open, so don't close it
			throw e;
		} catch (Exception e) {
			// All other exceptions must close it
			try {
				input.close();
			} catch (IOException e2) {
				System.err.println("in.close() unsuccessful");
			}
			throw e; // Rethrow
		} finally {
			// Don't close it here!!!
		}
	}
	public String getLine() {
		String s;
		try {
			s = input.readLine();
		} catch (IOException e) {
			throw new RuntimeException("readLine() failed");
		}
		return s;
	}
	public void dispose() {
		try {
			input.close();
			System.out.println("dispose() successful");
		} catch (IOException e2) {
			throw new RuntimeException("in.close() failed");
		}
	}
}