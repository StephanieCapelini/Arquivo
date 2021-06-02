package view;

import java.io.IOException;

import controller.InterfaceArquivo;
import controller.MexerArquivo;

public class Main {

	public static void main(String[] args) {
		InterfaceArquivo leitor = new MexerArquivo();
		String dirWin = "C:\\Windows\\Temp";
		try {
			leitor.lerArquivo(dirWin, "generic_food.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
