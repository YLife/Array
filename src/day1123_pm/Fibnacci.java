package day1123_pm;
/*
 * ��fibnacci���е�ǰ20����ֵ
 */
public class Fibnacci {
	public static void main(String[] args) {
		int[] numbers=new int[20];
		numbers[0]=1;
		numbers[1]=1;
		for (int i = 2; i < numbers.length; i++) {
			numbers[i]=numbers[i-1]+numbers[i-2];
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
