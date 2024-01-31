package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter starting money");
		double startAmount = in.nextDouble();
		System.out.println("Please enter your win limit");
		double winLimit = in.nextDouble();
		System.out.println("Please enter a number between 0 and 100 for your win percentage");
		double winChance = in.nextDouble();
		double ruinAmount = 0.00;
		while (startAmount > ruinAmount)
		
		while (startAmount < winLimit)
		{
		double randomNumber = Math.random() * 100;
		
		if (winChance > randomNumber)
			{
			startAmount = startAmount + 1;
			System.out.println("You won! You now have $" + startAmount);
				if (startAmount == winLimit)
				{
				System.out.println("You win and hit the win limit! You now have $" + winLimit);
				}
			}
		else
			{
			startAmount = startAmount - 1;
			System.out.println("You lost. You now have $" + startAmount);
				if (startAmount <= ruinAmount)
				{
				System.out.println("You lost all of your money. Don't gamble idiot.");
				}
			}
		}
	}
}
		

