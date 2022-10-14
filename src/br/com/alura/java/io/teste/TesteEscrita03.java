package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita03 {
	
	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
		/*
		OutputStream fos = new FileOutputStream("loremJava02.txt");
		Writer osw = new OutputStreamWriter(fos);	 
		BufferedWriter bw = new BufferedWriter(osw);
		*/
		
		PrintStream ps = new PrintStream("loremJava05.txt");
		
		
		ps.println("reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla");

		ps.println("nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in ");
		
			
		ps.close();
		
	}

}
