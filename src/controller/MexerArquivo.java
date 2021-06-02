package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MexerArquivo implements InterfaceArquivo { 
	@Override
	public void lerArquivo (String caminho, String nome) throws IOException{
		File arquivo = new File (caminho, nome);
		if (arquivo.exists()&& arquivo.isFile()) {
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha!= null) {
				if(linha.contains("Fruits")) {
					String[]s;
					s = linha.split(",");
					for(String fruta: s) {
						if(fruta!= s[2]) {
							System.out.print(fruta+"\t");
						}
					}
			System.out.println();
				}
				linha = buffer.readLine();
			} 
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException ("arquivo invalido");
	
		}
	}
	
}
