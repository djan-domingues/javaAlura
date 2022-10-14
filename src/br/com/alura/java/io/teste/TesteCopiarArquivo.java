package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
	
	public static void main(String[] args) throws IOException {
		
	
		//entrada
		InputStream fis = new FileInputStream("loremJava.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		//saida
		OutputStream fos = new FileOutputStream("loremJava03.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		//passando a primeira linha para uma variavel
		String linha = br.readLine();
		
		//laço para enquanto a linha não for nula, escrever o conteudo da linha e setar a variavel com a proxima linha
		while(linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();		
		}
		
		//fechando o outputs e inputs
		br.close();
		bw.close();
	}

}
