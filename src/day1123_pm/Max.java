package day1123_pm;
/*
 * 求一组数据的最大值
 */
public class Max {
	public static void main(String[] args) {
		int[] numbers={1,5,3,350,87,34,56,98,100};
		int max=numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max<numbers[i]) {
				max=numbers[i];
			}
		}
		System.out.println("最大值为:"+max);
	}
}
