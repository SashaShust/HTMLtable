package com.epam.htmltable.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLTableGenerator {
	public StringBuilder buildHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>").append("<html>").append("<head>").append("<title>HTML GENERATOR</title>")
				.append("</head>").append("<body>").append("<table border='1'>");
		for (int i = 0; i < 7; i++) {
			sb.append("<tr><td> 1</td><td> 2</td></tr>");
		}
		sb.append("</table>").append("</body>").append("</html>");
		return sb;
	}

	public void generateHTMLFile(String mp3) throws IOException {
		File file = new File("C:\\Test\\mp3List.html");
		file.createNewFile();
		System.out.println("File created! ");
		FileWriter writer = new FileWriter(file);
		try {
			writer.write(mp3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
}
