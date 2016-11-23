package day1123_pm;

import java.util.Scanner;

public class Training01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num2=sc.nextInt();
		int count=0;
		int[] number={8,4,2,1,23,344,12};
		for (int i = 0; i < number.length; i++) {
			if (number[i]==num2) {
				System.out.println("该数组包含这个数");
				break;
			}
			count++;
			if (count==number.length) {
				System.out.println("该数组不包含这个数");
			}
		}
	}

}
