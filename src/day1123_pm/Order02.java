package day1123_pm;
/*
 * 用冒泡排序法进行排序
 */
public class Order02 {
	public static void main(String[] args) {
		int[] numbers={3,5,61,6,2,98,4,0};
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = 0; j < numbers.length-1-i; j++) {
				if (numbers[j]>numbers[j+1]) {
					int temp;
					temp=numbers[j+1];
					numbers[j+1]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
	
}
