/*
 * Arthur : Ngan Hoang 
 * Date : 11/12/2001
 * Course : CSC 110
 * Program : Candy orders 
 * Purpose : Combine 2 orders into 1 
 */
package assignment;
import java.util.Scanner;
public class CandyOrders_NganHoang {
	// combined method has return value
	
public static int [] combineOrder ( int [] num_of_candies1, int [] num_of_candies2) {
	int [] total = new int [5];
	for (int i = 0; i< 5; i++)
		total[i] = num_of_candies1[i] + num_of_candies2[i];
	return total;
}
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int i;
		// declare arrays
			
		int [] order1 = new int [5];
		int [] order2 = new int [5];
		String [] candy = {"Mints ", "Chocolates with Nuts ", "Chewy Chocolates ", "Dark Chocolate Creams ", "Sugar Free Suckers "};
		
		// order 1
		
		System.out.println("Hey John, what's your order for the candies below?");
		for (i = 0; i<5; i++) {
			System.out.print("\n" + candy[i] + ": ");
			order1[i] = scnr.nextInt();
		}
		// order 2
		
		System.out.println("\nHey Mary, what's your order for the candies below?");
		for (i = 0; i<5; i++) {
			System.out.print("\n" + candy[i] + ": ");
			order2[i] = scnr.nextInt();
		}
		// order's total
		
		System.out.println("\nYour orders combined are :\n--------------------------");
		for ( i = 0; i<5 ; i++) 
		System.out.println(candy[i]+": "+combineOrder(order1, order2)[i]);
		
		scnr.close();
	}

}
