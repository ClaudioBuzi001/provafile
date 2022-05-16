package it.prova.provafile.test;

import java.io.FileWriter;
import java.io.IOException;

public class CopyWriter {
	public static void main(String[] args) {
		// Scrivo all interno di un file

		try {

			// apre il file in scrittura
			FileWriter fileout = new FileWriter("C:/corso/provaFile/scrivi.txt");
			String str = "Ciao mi chiamo claudio e mi piace la nutella";

			// il ciclo scrive ogni carattere delle stringa nel file
			fileout.write(str);
			
			fileout.write('\n');

			fileout.close(); // chiude il file

		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("\nBye bye!");
	}

}
