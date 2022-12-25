package Assignment;

import java.util.Random;

public class RandomNumber {

	public int returnRandomArrayValue(int[] arr) {
		int low=0,high=arr.length;
		Random r = new Random();
		int random = r.nextInt(high-low)+low;
		
		for(int i=0;i<arr.length;i++) {
			if(i==random) {
				random = arr[i];
			}
		}
		return random;
	}

}
