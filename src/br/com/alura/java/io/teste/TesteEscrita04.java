package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscrita04 {
	
	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
		/*
		OutputStream fos = new FileOutputStream("loremJava02.txt");
		Writer osw = new OutputStreamWriter(fos);	 
		BufferedWriter bw = new BufferedWriter(osw);
		*/
		
		
		PrintWriter pw = new PrintWriter("loremJava06.txt");
		
		
		pw.println("reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla");

		pw.println("nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in ");
		
			
		pw.close();
		
	}

}
