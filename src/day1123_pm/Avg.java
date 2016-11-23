package day1123_pm;
/*
 * 对一组成绩求平均值
 */
public class Avg {
	public static void main(String[] args) {
		int[] score={23,37,97,56,44,98};
		int sum=0,avg;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		avg=sum/score.length;
		System.out.println("平均成绩为:"+avg);
	}

}
