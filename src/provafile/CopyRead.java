package provafile;

import java.io.*;

public class CopyRead {

	public static void main(String[] args) {
		// Leggiamo un file in input
		try {
			// apre il file in lettura
			FileReader filein = new FileReader("C:/corso/provaFile/ciao.txt");

			int next;
			do {
				next = filein.read(); // legge il prossimo carattere

				if (next != -1) { // se non e' finito il file
					char nextc = (char) next;
					System.out.print(nextc); // stampa il carattere
				}

			} while (next != -1);

			filein.close(); // chiude il file

		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("\nBye bye!");
	}

}
