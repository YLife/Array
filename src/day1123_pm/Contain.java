package day1123_pm;

import java.util.Scanner;

/*
 * ��ѯһ�������Ƿ����ĳ����
 */
public class Contain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����");
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
			System.out.println("��������������");
		}else {
			System.out.println("�����鲻���������");
		}
	}

}
