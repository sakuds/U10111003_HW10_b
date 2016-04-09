
//U10111003 朱永捷

import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSort {
	public static void main(String[] args){

		// Prompt the user to enter number of digits
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers?");
		int number = scanner.nextInt();	

		// Prompt the user to enter all digits
		System.out.println("Please enter digits : (ex.1 2 3 4 5)");
		int temp = 0;
		ArrayList<Integer> compare = new ArrayList<>();
		while (temp < number) {
			int store = scanner.nextInt();	
			compare.add(store);
			temp++;
		}

		// Use bubble sort 
		for (int i = compare.size()-2 ; i >= 0 ; i--){
			for (int j = 0 ; j <= i ; j++){
				if (compare.get(j) > compare.get(j+1)) {
					temp = compare.get(j);
					compare.remove(j);
					compare.add(j+1 , temp);
				}
			}
		}

		// Print result
		for(int i = 0; i <= compare.size()-1 ; i++)
			if (i == compare.size()-1) {
				System.out.print(compare.get(i) + "");
			} else {
				System.out.print(compare.get(i) + "" + ",");
			}
	}
}


