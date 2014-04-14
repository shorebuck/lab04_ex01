//ICT 306
//Lab 4 Question 01
//records positive integers and outputs average of the numbers and counts the values that are above, below and equal the average value
//Gavin Criddle

import java.util.*;

public class lab04_ex01
{
	public static void main(String[] args)
	{
		
		int number = 0;
		double average = 0;
		int belowAverageCount = 0;
		int aboveAverageCount = 0;
		int equalAverageCount = 0;
		ArrayList <Integer> Numbers = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a positive integer and enter a negative integer to stop input");
		number = keyboard.nextInt();
		 while (number >= 0) {
		Numbers.add(number);
		number = keyboard.nextInt();
		};  //end while when a negative number is entered
		System.out.println(Numbers.size());
		int fourCount = 0; //counter to detect four numbers
		for (int count = 0; count < Numbers.size(); count++)
		{
			System.out.printf(Numbers.get(count) + " ");
			int runningTotal = Numbers.get(count); //grab the number
			average = (average + runningTotal);  //and add it to a total
			
			fourCount++;
			if (fourCount == 4) // every four numbers, start a new line
			{
				System.out.println();
				fourCount = 0; //reset counter
			}
		} //end for
		System.out.println();
		average = average/Numbers.size();
		
		for (int count = 0; count < Numbers.size(); count++)
		{
			if (Numbers.get(count) < average)
			{
				belowAverageCount++;
			}
			else if (Numbers.get(count) > average)
			{
				aboveAverageCount++;
			}
			else
			{
				equalAverageCount++;
			}
		} //end for
		
		System.out.println();
		System.out.println("The average of the numbers is: " + average);
		System.out.println("There are " + belowAverageCount + " numbers below the average.");
		System.out.println("There are " + aboveAverageCount + " numbers above the average.");
		System.out.println("There are " + equalAverageCount + " numbers that equal the average.");
		
	}
}