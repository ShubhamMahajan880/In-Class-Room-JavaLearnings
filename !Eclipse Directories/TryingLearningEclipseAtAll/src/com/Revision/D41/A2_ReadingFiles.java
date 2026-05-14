package com.Revision.D41;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A2_ReadingFiles {

	public void fileReading() {
		String location = "E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\TryingLearningEclipseAtAll\\src\\com\\Revision\\D41\\Customer_Info.txt";

		try {
			BufferedReader bR = new BufferedReader(new FileReader(location));
			String line;

			while ((line = bR.readLine()) != null) {
				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Pune")) {
					System.out.println(line + "\n");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		A2_ReadingFiles fR = new A2_ReadingFiles();
		fR.fileReading();
	}

}
