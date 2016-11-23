package day1123_pm;

import java.util.Scanner;

/*
 * 查询一组数据是否包含某个数
 */
public class Contain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数");
		int num01=sc.nextInt();
		int[] numbers={4,6,7,3,89,234,67};
		boolean contain=false;
		for (int i = 0; i < numbers.length; i++) {
			if (num01==numbers[i]) {
				contain=true;
				break;
			}
		}
		if (contain==true) {
			System.out.println("该数组包含这个数");
		}else {
			System.out.println("该数组不包含这个数");
		}
	}

}
