package day1123_pm;
/*
 * ����һ������
 */
public class Wallet {
	public static void main(String[] args) {
		int wallet[]={1,1,5,20,50,100,100};
		int money=10;
//		����Ǯ������
		int[] wallet2=new int[wallet.length+1];
		System.arraycopy(wallet, 0, wallet2, 0, wallet.length);
		wallet=wallet2;
//		ȷ������λ��
		int position=wallet.length-1;
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i]>money) {
				position=i;
				break;
			}
		}
//		�Ӵ�λ���������Ԫ�غ���һλ(���ƺ����)
		for (int i = wallet.length-1; i >position; i--) {
			wallet[i]=wallet[i-1];
		}
//		��������
		wallet[position]=money;
		for (int element : wallet2) {
			System.out.println(element);
		}	
	}
}
