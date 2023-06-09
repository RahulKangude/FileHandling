package buffer1.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo1 {
   public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("BR.txt");
	BufferedWriter br=new BufferedWriter(fw);
      br.write("Rahul");
      br.newLine();
      br.write("Kangude");
      br.newLine();
     char []ar= {'A','B','C'};
      br.write(105);
      br.write(ar);
      br.write("TVS");
      br.flush();
      br.close();
	
}
}
