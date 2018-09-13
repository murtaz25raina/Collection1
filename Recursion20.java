package datastrure;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
class FileBoy
{
	public int funct(File f2)
	{
		File arr[]=f2.listFiles();
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		}
	   	for(int i=0;i<arr.length;i++){
		    if(arr[i].isDirectory())
		    {		
			File f3=new File(arr[i].getPath());
			return funct(f3);
			}
	    	}
		
	return 0;
	    
		
	}
}
public class Recursion {

    public static void main(String[] args)throws Exception{
        File f1=new File("C:\\Users\\get it\\Desktop\\home");
        FileBoy obj = new FileBoy();
        obj.funct(f1);
    }
}