package Pair_equals_to_sum;

import java.util.HashSet;
import java.util.Scanner;

public class Pair_equals_to_sum {
	static int[] arr;
	static int sum;
	static String str;
	static String[] nums;
	
	static Scanner user = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the array of numbers splitted by a space: ");
		str = user.nextLine();
		nums = str.split(" ");
		arr = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		
		System.out.println("Enter the sum of two indexes you would like to find: ");
		int sum = user.nextInt();
		
		find(arr, sum);
	}
	
	public static boolean find(int[] arr, int sum) {
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean tf = false;
		
		for(int i=0; i<arr.length; i++) {
			hs.add(sum - arr[i]); //adding all the integers that need to be found in the array to the HashSet.
		}
		for(int i=0; i<arr.length; i++) {
			if(hs.contains(arr[i])) { //searching for the numbers that exist in both the array and the HashSet.
				System.out.println(arr[i]);
				tf = true;
			}
		}
		if(tf == false) {
			System.out.println("No match was found.");
		}
		return tf;
	}
}
