
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str1 = br.readLine().trim().split(" ");
		String[] str2 = br.readLine().trim().split(" ");
		int n = str1.length;
		int result = 0;
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr1[i]=Integer.parseInt(str1[i]);
		    arr2[i]=Integer.parseInt(str2[i]);
		}
		for(int i=0;i<n-1;i++)
		{
		    result+=Math.max(Math.abs(arr1[i+1]-arr1[i]),Math.abs(arr2[i+1]-arr2[i]));
		}
		bw.write(result+"\t");
		bw.flush();
	}
}
