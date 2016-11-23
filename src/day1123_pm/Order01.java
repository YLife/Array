package day1123_pm;

import java.util.Arrays;

/*
 * ÓÃArrays.sort()½øĞĞÅÅĞò
 */
public class Order01 {
	public static void main(String[] args) {
		int[] numbers={3,5,61,6,2,98,4,0};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
