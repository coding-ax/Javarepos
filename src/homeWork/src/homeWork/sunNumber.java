package homeWork;

import java.util.Scanner;

public class sunNumber {
	public int[] sunback(int num) {
		int[] temp=new int[num];
		int change=0;
		int j=0;
		for(int i=1;change!=num;i++) {
			int cnum=7*i+5;
			if(cnum%5==4&&cnum%3==2) {
				temp[j]=cnum;
				j++;
				change++;
			}
		}
		return temp; 
	}
	public static void main(String[] avg) {
		sunNumber AX=new sunNumber();
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int[] temp=new int[num+5];
		temp=AX.sunback(num);
		System.out.print("[");
		for(int value:temp) {
			System.out.print(value+" ");
		}
		System.out.print("]");
	}
}
