package day1123_pm;

import java.util.Scanner;

public class Training01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����:");
		int num2=sc.nextInt();
		int count=0;
		int[] number={8,4,2,1,23,344,12};
		for (int i = 0; i < number.length; i++) {
			if (number[i]==num2) {
				System.out.println("��������������");
				break;
			}
			count++;
			if (count==number.length) {
				System.out.println("�����鲻���������");
			}
		}
	}

}
