package homeWork;

import java.util.Scanner;

public class numberPrint {
	public int[] numberback(int num) {
		int a[]=new int[10000];
		int temp=num;
		int n=0;
		for(int i=2;i<num;i++) {
			int flag=0;
			while(temp%i==0) {
				a[n]=i;
				flag++;
				temp/=i;
			}
			if(flag!=0) {a[n+1]=flag;n+=2;}
			if(temp==0)break;
		}
		return a;
	}
	
	public static void main(String[] avgs) {
		int a[]=new int[10000];
		numberPrint p=new numberPrint();
		int num;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		a=p.numberback(num);
	
		System.out.print("[");
	for(int value:a) {
		if(value==0) break;
		System.out.print(value+" ");
	}
	System.out.print("]");
	}
}
