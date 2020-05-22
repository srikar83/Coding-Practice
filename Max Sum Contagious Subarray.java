import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().trim().split(" ");
		int n=str.length;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(str[i]);
		int max=arr[0];
		int result = arr[0];
		for(int i=1;i<n;i++)
		{
		    max=Math.max(arr[i],max+arr[i]);
		    result = Math.max(result,max);
		}
		bw.write(result+"\t");
		bw.flush();
		
	}
}
