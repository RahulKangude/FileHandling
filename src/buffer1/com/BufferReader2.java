package buffer1.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader2 {
  public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("BR.txt");
	BufferedReader br=new BufferedReader(fr);
//	int i=br.read();
//	while(i!=-1) {
//		System.out.print((char)i);
//		i=br.read();
//	}
	String line =br.readLine();
	while(line!=null) {
		System.out.println(line);
		line =br.readLine();
		
	}
	
	
	}
}
