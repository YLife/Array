package day1123_pm;

import java.util.Arrays;
import java.util.Iterator;

/*
 * ɾ��һ������
 */
public class Wallet02 {
	public static void main(String[] args) {
		int[] wallet={1,1,5,20,20,50,100,100};
		int[] wallet2=new int[wallet.length-1];
		int position=0;
//		�ҵ�ɾ����λ��
		
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i]>20) {
				position=i-1;
				break;
			}
		}
//		�Ӵ�λ�����ǰһ��λ��ȫ��ǰ��һλ;(����ǰ���)
		for (int i = position; i < wallet.length-1; i++) {
			wallet[i]=wallet[i+1];
		}
//		System.arraycopy(wallet, 0, wallet2, 0, wallet.length-1);(���÷���)
		for (int i = 0; i < wallet2.length; i++) {
			wallet2[i]=wallet[i];
		}
//		��ӡɾ��һ��20�������
		for (int element : wallet2) {
			System.out.println(element);
		}
	}
}
