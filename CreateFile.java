import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateFile {

    public static void main(String[] args)throws Exception{
        File f1=new File("C:\\Users\\get it\\Desktop\\abd.txt");
        File f2=new File("C:\\Users\\get it\\Pictures\\abd.txt");
        if(!f1.exists())
        {
        	f1.createNewFile();
        }
        if(!f2.exists())
        {
        	f2.createNewFile();
        }
    }
}