import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   String str=br.readLine();
	   String[] data=str.split(" ");
	   int n=data.length;
	   int[] arr=new int[n];
	   int flag=0;
	   
	   for(int i=0;i<n;i++)
	    arr[i]=Integer.parseInt(data[i]);
	    
	   if(arr[n-1]+1 <= 9)
	   {
	       arr[n-1]=arr[n-1]+1;
	       flag = 1;
	   }
	   else
	   {
	       int rem = (arr[n-1]+1)/10;
	       arr[n-1]=0;
	       for(int i=n-2;i>=0;i--)
	       {
	           if(arr[i]<9)
	           {
	               arr[i]=arr[i]+1;
	               flag=1;
	               break;
	           }
	           else
	           arr[i]=0;
	       }
	   }
	   if(flag==0)
	   bw.write(1+"\t");
	   for(int i=0;i<n;i++)
	   bw.write(arr[i]+"\t");
	   bw.flush();
	}
	
}
