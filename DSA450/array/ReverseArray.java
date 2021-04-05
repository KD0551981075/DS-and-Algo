package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String args[]) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int count = Integer.parseInt(br.readLine());
		arrayStringReverse();
	}
	
	private static void arrayStringReverse() {
		String str = "Geeks";
		
		//using string buffer
		/*
		 * StringBuffer bf = new StringBuffer(str); System.out.println(
		 * "bf.reverse().toString()"+bf.reverse().toString());
		 */
		int length = str.length()-1;
		String temp = "";
		for(int i=length; i>=0;i--)
		{
			temp += str.charAt(i);
		}
		System.out.println("reverse :"+temp);
		
	}

	static void reverseArray(BufferedReader br,int count) throws IOException
	{
		for(int i=0;i<count;i++)
		{
			String word = br.readLine();
			char[] array = word.toCharArray();
			System.out.println("array"+array.toString());
			int end = array.length-1;
			int start = 0;
			
			//swapping
			if(start<end)
			{
				char temp = array[start];
				array[start] = array[end];
				array[end]= temp;
				
				start ++;
				end --;
			}
			
			System.out.println("output"+array);
		}
	}
}
