package file.com;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
  public static void main(String[] args) throws IOException {
	//FileWriter fw=new FileWriter("Hp1.txt");//for  override the data use this constrctor
	FileWriter fw=new FileWriter("Hp1.txt", true);//for  Apped  the data use this constrctor
	fw.write("ER-->>");
	fw.write("Rahulkangude\n");
	fw.write("Visapur,");
	fw.write("Srigonda,");
	fw.write("Ahmednagar \n");
	char []arr= {'A','B','C','D'};
	fw.write(arr);
	System.out.println("\n");
	fw.flush();
	fw.close();
}
}
