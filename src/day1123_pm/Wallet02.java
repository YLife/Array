package day1123_pm;

import java.util.Arrays;
import java.util.Iterator;

/*
 * 删除一个数据
 */
public class Wallet02 {
	public static void main(String[] args) {
		int[] wallet={1,1,5,20,20,50,100,100};
		int[] wallet2=new int[wallet.length-1];
		int position=0;
//		找到删除的位置
		
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i]>20) {
				position=i-1;
				break;
			}
		}
//		从此位置起的前一个位置全部前移一位;(先移前面的)
		for (int i = position; i < wallet.length-1; i++) {
			wallet[i]=wallet[i+1];
		}
//		System.arraycopy(wallet, 0, wallet2, 0, wallet.length-1);(备用方法)
		for (int i = 0; i < wallet2.length; i++) {
			wallet2[i]=wallet[i];
		}
//		打印删除一个20后的数据
		for (int element : wallet2) {
			System.out.println(element);
		}
	}
}
