package level1;

import java.util.Scanner;

//task2
public class PalindromeChecker 
{
	public static boolean isPalindrome(String str)
	{
		
		String text1=str.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String text2=new StringBuilder(text1).reverse().toString();
		
		return text1.equals(text2);
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the Word or phrase: ");
		String text=sc.next();
		
		System.out.println();
		if(isPalindrome(text))
		{
			System.out.println(text +" is a Palindorme.");
		}
		else
		{
			System.out.println(text +" is not Palindrome.");
		}
	}
}
