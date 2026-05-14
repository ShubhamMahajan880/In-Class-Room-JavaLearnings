package com.Revision.D42;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A5_FinallyKeywordWorkingUnderstanding {

	public static void main(String[] args) throws IOException {

		BufferedReader br = null;

		try {
			System.out.println("try - START");

			br = new BufferedReader(new FileReader(
					"E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\TryingLearningEclipseAtAll\\src\\com\\Revision\\D42\\cutomerDetails.txt"));

			String laptopName = null;
			System.out.println(laptopName.length());

			System.out.println("try - END");

		} catch (FileNotFoundException e) {
			System.out.println("Working for file only");
			e.printStackTrace();

		} catch (NullPointerException e) {
			System.out.println("Null pOinter ");
			e.printStackTrace();

		} finally {
			br.close();
			System.out.println("I am here to exucute alwasy");

		}

	}

}
