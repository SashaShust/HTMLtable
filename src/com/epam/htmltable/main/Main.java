package com.epam.htmltable.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		HTMLTableGenerator htmlGenerator = new HTMLTableGenerator();
		StringBuilder sbResult = htmlGenerator.buildHTML();
		String str = sbResult.toString();

		htmlGenerator.generateHTMLFile(str);
		/*
		 * File file = new File("C:\\Test\\table.html");
		 * 
		 * if (file.exists()) { System.out.println("File already exists! "); }
		 * else {
		 * 
		 * 
		 * file.createNewFile(); System.out.println("File created! "); // }
		 * FileWriter writer = new FileWriter(file); try { writer.write(str); }
		 * catch (IOException e) { e.printStackTrace(); } finally {
		 * writer.close(); }
		 */
	}
}
