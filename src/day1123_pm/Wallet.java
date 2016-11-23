package day1123_pm;
/*
 * 插入一个数据
 */
public class Wallet {
	public static void main(String[] args) {
		int wallet[]={1,1,5,20,50,100,100};
		int money=10;
//		扩充钱包容量
		int[] wallet2=new int[wallet.length+1];
		System.arraycopy(wallet, 0, wallet2, 0, wallet.length);
		wallet=wallet2;
//		确定插入位置
		int position=wallet.length-1;
		for (int i = 0; i < wallet.length; i++) {
			if (wallet[i]>money) {
				position=i;
				break;
			}
		}
//		从此位置起的所有元素后移一位(先移后面的)
		for (int i = wallet.length-1; i >position; i--) {
			wallet[i]=wallet[i-1];
		}
//		插入数据
		wallet[position]=money;
		for (int element : wallet2) {
			System.out.println(element);
		}	
	}
}
