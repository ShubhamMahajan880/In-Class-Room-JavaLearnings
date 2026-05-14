package com.Revision.D43;

import java.io.BufferedReader;

import java.io.FileReader;

public class A1_TrywithResourcesTrying {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\TryingLearningEclipseAtAll\\src\\com\\Revision\\D43\\sales_data.txt"));) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
