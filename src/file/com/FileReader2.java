package file.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 {
  public static void main(String[] args) throws IOException {
	File f=new File("Hp1.txt");
	FileReader fr=new FileReader(f);
	int i=fr.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=fr.read();
	}
	System.out.println("-----------------------------------------");
	File f1=new File("Hp1.txt");
	FileReader fr1=new FileReader(f1);
	char []ch1=new char[(int) f1.length()];
	fr1.read(ch1);
	for(char ch2:ch1) {
		System.out.print(ch2);
	}
	}
}
