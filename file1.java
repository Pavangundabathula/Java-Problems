import java.io.*;
import java.util.*;
public class file1 {
   public static void main(String[] args) {
    File f=new File("C:\\Users\\PAVAN\\OneDrive\\Documents\\.vscode\\Home\\Java\\Learning\\Filehadling\\abc.txt");
    System.out.println("File name: "+f.getName());
    System.out.println("File path: "+f.getPath());
    System.out.println("Is it absolute: "+f.isAbsolute());
    System.out.println("File Absolute path: "+f.getAbsolutePath());
    System.out.println("File exists: "+f.exists());
    System.out.println("is it readable: "+f.canRead());
    System.out.println("is it writable: "+f.canWrite());
    System.out.println("is it a file: "+f.isFile());
    System.out.println("File size: "+f.length());
    System.out.println("Rename the file :"+f.renameTo(new File("C:/Users/PAVAN/Downloads/rae.txt")));
    System.out.println("is it a diretory: "+f.isDirectory());
    System.out.println("File last-modified: "+new Date(f.lastModified()));
    System.out.println("Parent is: "+f.getParent());
    
   }
}
