package level1;

import java.util.Scanner;

//Task3
public class StudentGradeCalculator 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the number of grades: ");
		int numGrades= sc.nextInt();
		System.out.println();
		int greads[]=new int[numGrades];
		
		for (int i=0;i<numGrades;i++)
		{
			System.out.print("Enter grade "+ (i+1)+": ");
			greads[i]=sc.nextInt();
		}
		
		double sum=0;
		for(int i=0;i < numGrades;i++)
		{
			sum=sum+greads[i];
		}
		
		double averageOfGrade=sum/numGrades;
		
		System.out.println("\nThe average grade is: "+averageOfGrade);
	}
}
