package com.mohit.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncodingDecodingTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		basicEncoding();
		final String textData= "Java8Base64 Encoding";
		
		String encodeToString = Base64.getUrlEncoder().encodeToString(textData.getBytes("UTF-8"));
		
		System.out.println(encodeToString);
		
		byte[] decode = Base64.getUrlDecoder().decode(encodeToString);
		String decodedString = new String(decode, "UTF-8");
		System.out.println(decodedString);
		//Same for MIME encoding and decoding good for sending data over network
		
		
	}

	private static void basicEncoding() throws UnsupportedEncodingException {
		final String textData= "Java8Base64 Encoding";
		
		String encodeToString = Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
		
		System.out.println(encodeToString);
		
		byte[] decode = Base64.getDecoder().decode(encodeToString);
		String decodedString = new String(decode, "UTF-8");
		System.out.println(decodedString);
	}

}
