package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		//fluxo de entrada com um arquivo
		
		OutputStream fos = new FileOutputStream("loremJava02.txt");
		
		Writer osw = new OutputStreamWriter(fos);
		 
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut");
		bw.newLine();	
		bw.write("reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla");
			
		bw.close();
		
	}

}
