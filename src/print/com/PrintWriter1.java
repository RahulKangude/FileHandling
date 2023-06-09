package print.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("Abcd3.txt");
		BufferedReader br = new BufferedReader(new FileReader("BR.txt"));
		String line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}

		br = new BufferedReader(new FileReader("Hp1.txt"));
		line = br.readLine();
		while (line != null) {
			pw.println(line);
			line = br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
	}
}
