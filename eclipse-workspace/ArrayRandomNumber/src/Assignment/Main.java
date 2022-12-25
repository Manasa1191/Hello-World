package Assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length - ");
		int len = in.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			System.out.print("Enter element : ");
			arr[i]=in.nextInt();
		}
		RandomNumber num = new RandomNumber();
		System.out.println("Random value from your array: "+num.returnRandomArrayValue(arr));
		
	}

}
