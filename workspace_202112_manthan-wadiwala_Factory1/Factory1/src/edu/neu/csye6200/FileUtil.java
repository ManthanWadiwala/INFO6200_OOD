package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	// Read from file
	public static List<String> read(String fileName) {
		String line = null;
		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

	// Write to file
	public static void write(String fileName, List<String> content) {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
			for (String line : content) {
				out.write(line);
				out.newLine();
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
