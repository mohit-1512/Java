package com.mohit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("inp.txt");
		try (Stream<String> lines = Files.lines(path,Charset.forName("UTF-8"))){
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
