package day1123_pm;
/*
 * ��һ��ɼ���ƽ��ֵ
 */
public class Avg {
	public static void main(String[] args) {
		int[] score={23,37,97,56,44,98};
		int sum=0,avg;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		avg=sum/score.length;
		System.out.println("ƽ���ɼ�Ϊ:"+avg);
	}

}
