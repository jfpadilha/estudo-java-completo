package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

		// Classes dos tipos primitivos
		Byte b = 100;
		Short s = 1000;

		Integer i = 1000;
		Long l = 100000L;

		String si = i.toString();
		System.out.println(" String int " + si);

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		String sf = f.toString();
		System.out.println("Float string " + sf);

		Boolean bo = Boolean.parseBoolean("true");
		String sbo = bo.toString().toUpperCase();
		System.out.println("String boolean " + sbo);

		Character c = '#';	//Correpondente ao CHAR
		String sc = c.toString();
		System.out.println("String char " + sc);
	}

}
