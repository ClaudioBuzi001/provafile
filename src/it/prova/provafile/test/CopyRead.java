package it.prova.provafile.test;

import java.io.*;

public class CopyRead {

	public static void main(String[] args) {
		// Leggiamo un file in input
		try {
			// apre il file in lettura
			FileReader filein = new FileReader("C:/corso/provaFile/ciao.txt");

			BufferedReader reader = new BufferedReader(filein);
			String in = reader.readLine();
			while(in != null) {
				System.out.println(in);
				in = reader.readLine();
			}

			filein.close(); // chiude il file

		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("\nBye bye!");
	}

}
