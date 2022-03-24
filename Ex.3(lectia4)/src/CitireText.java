import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CitireText {

	public static void main(String[] args) {
		Scanner inputText = new Scanner(System.in);
		String citireConsola = inputText.nextLine();
		String numeFisier = inputText.nextLine();
		int nrLiniiEgale = 0;
		try {
 
			BufferedReader br = new BufferedReader(new FileReader(numeFisier));
			String line = br.readLine();
			while(line != null) 
			{
				if(citireConsola.equals(line))
					nrLiniiEgale++;
				line = br.readLine();
			}
			br.close();
		} 
		catch(IOException e) {
			System.out.println("Eroare la deschiderea fisierului!");
		}
		System.out.println(nrLiniiEgale);
	}
}