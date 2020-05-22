import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str=br.readLine().trim().split(" ");
		int result=0;
		int n=str.length;
		int[] arr=new int[n];
		int[] left = new int[n];
		int[] right = new int[n];
		for(int i=0;i<n;i++)
		    arr[i]=Integer.parseInt(str[i]);
		
		left[0]=arr[0];
		right[n-1]=arr[n-1];
		
		for(int i=1;i<n;i++)
		    left[i] = Math.max(left[i-1],arr[i]);
		for(int i=n-2;i>=0;i--)
		    right[i]=Math.max(right[i+1],arr[i]);
		    
		for(int i=0;i<n;i++)
		result += Math.min(left[i],right[i])-arr[i];
		bw.write(result+"\n");
		bw.flush();
		
	}
}
