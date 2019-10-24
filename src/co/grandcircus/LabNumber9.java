package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LabNumber9 {

	public static void main(String[] args) {
		ArrayList<String> groceryListArr = new ArrayList<>();
		ArrayList<Double> groceryCostArr = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Brandon's mart!! Check out this menu: ");

		System.out.println();

		String cont = "yes";

		// int itemCounter = 0;

		while (cont.equals("yes")) {
			// itemCounter++;
			// System.out.println("ITEM COUNTER" + itemCounter);

			// ***format if you have time***
			Map<String, Double> items = new HashMap<>();
			items.put("Apple", 1.99);
			items.put("Orange", .99);
			items.put("Banana", .59);
			items.put("Spag Heddy", 4999.59);
			items.put("Kiwi", 2.59);
			items.put("TV", 39.99);
			items.put("Steak", 19.49);
			items.put("Avocado", 1.59);

			int counter = 1; // counter to show number of items
			for (String itemName : items.keySet()) {
				System.out.println(counter++ + ". " + itemName + " $" + items.get(itemName));
			}
			System.out.println();
			System.out.println("Type in the name of the item you want to add to your cart (caps matter): ");

			// validates correct capitalization
			String userInputItem = scan.nextLine();
			while (!items.containsKey(userInputItem)) {
				System.out.println("Please use a capital letter for the first letter: ");
				userInputItem = scan.nextLine();
			}

			System.out.println(userInputItem + "s are $" + items.get(userInputItem) + ". Adding to your cart.");
//loop counter that adds to length of arraylists?

			groceryListArr.add(userInputItem);

			double groceryItems = items.get(userInputItem);

			groceryCostArr.add(groceryItems);

			System.out.println(groceryListArr + " " + groceryCostArr + " testing array ArrayLists");

			int arrSize = groceryListArr.size();
			System.out.println("Array Size = " + arrSize);

			//just to test the arrAverage method - still need to do a loop (I think) to add up the total costs of the array
			double totalCost = 10.00;

			arrAverage(arrSize, totalCost);
			System.out.println("Do you want to add more items? (yes/no)");
			cont = scan.next();

			/*
			 * //int arrSize System.out.println("Enter the elements:");
			 * 
			 * for (int i=0; i<arrSize; i++) { groceryCostArr[] } for( int num : array) {
			 * sum = sum+num; } System.out.println("Sum of array elements is:"+sum);
			 */
		}
		// this is our indication that the program has ended
		System.out.println("Goodbye!");
		scan.close();

	}

	public static double arrAverage(int arrSize, double totalCost) {
		double arrAvg = (totalCost / arrSize); // get total cost and array size
		System.out.println("Your average cost per item so far is: " + arrAvg);
		return arrAvg;
	}
}

//ArrayList<String> listOfBanks = new ArrayList<>();
//int size = listOfBanks.size();
