package homeWork;

import java.util.Scanner;

public class trianglePrint {
	int n;
	public trianglePrint(int j) {
		n=j;
		System.out.print(n);
	}
	public void setN(int j) {
		n=j;
	}
	public void Print() {
		for(int i=0;i<n;i++) {
			System.out.print("*");
			for(int j=i;j<n;i++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}		
	}
	
	public static void main(String[] avgs) {
	int n;
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	trianglePrint AX=new trianglePrint(n);
	AX.Print();
	}
}
