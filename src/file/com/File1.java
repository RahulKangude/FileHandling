package file.com;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException {
    File f=new File("Rk,txt");
    System.out.println(f.exists());
    System.out.println(f.mkdir());
    System.out.println(f.exists());
    
    File f1=new File("Rahul@123");
    f.mkdir();
    File f2=new File ("Rahul@123","Rk123");//create the file name and directory
    File f3 =new File(f1,"Rk123");
    f1.createNewFile();
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    
//    //create a file name with moblie:xyz folder;
//    File f5=new File("c:\\xyz","Rkangude.txt");
//    f5.createNewFile();
    File ff=new File ("D:\\git c programing\\cprogramming");
    String []arr=ff.list();
    int count=0;
    for(String s1:arr) {
    	System.out.println(s1);
    	count++;
    }
    System.out.println("total number of file presents in this directory=="+count);
    
	}
}
