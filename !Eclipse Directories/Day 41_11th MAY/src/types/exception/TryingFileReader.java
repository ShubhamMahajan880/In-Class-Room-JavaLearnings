package types.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {
		FileReader fR = new FileReader();
		fR.readFile();

	}


	public void readFile() {
		String fileName = "E:\\51 _Shagun\\Java This Side\\In Class Room\\!Eclipse Directories\\Day 41_11th MAY\\src\\types\\exception\\sales_data.txt";
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader(fileName)); // FileNotFoundException - it pop ups if the directory didn't given and only file name mentioned just.
			String line;

			while ((line = br.readLine()) != null) {
				String lineArr[] = line.split(",");
				String city = lineArr[3];
				if (city.equals("Pune")) {
					System.out.println(line+"\n");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



}
