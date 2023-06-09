package file.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
  public static void main(String[] args) throws IOException {
//	FileReader fr=new FileReader("Hp1.txt");
//	 int i=fr.read();//use int read()
//	 while(i!=-1) {
//		 System.out.print((char) i);
//		 i=fr.read();
//	 }
	//  int read(char[] ch)
   File f=new File("Hp1.txt");
   FileReader fr=new FileReader(f);
   char []ch=new char[(int) f.length()];
     fr.read(ch);
     System.out.println("Main");
     for (char ch1:ch) {
    	 System.out.print((char)ch1);
     }
     System.out.println("\n-->>End");
   	  
   	  
	
}
}
