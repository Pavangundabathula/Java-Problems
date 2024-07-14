import java.io.*;

public class file2 {
    public static void main(String[] args){
        File f1=new File("C:\\Users\\PAVAN\\OneDrive\\Documents\\.vscode\\Home\\Java\\Learning\\Filehadling");
        String names[]=f1.list();
        File f2;
        for(int i=0;i<names.length;i++){
            f2=new File(f1,names[i]);
            if(f2.isFile()){
                System.out.println(names[i]+" and length of file is: "+f2.length());
            }
        }
    }
}
