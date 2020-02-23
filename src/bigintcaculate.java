import java.util.Scanner;
import java.math.BigDecimal;
public class bigintcaculate {

public static void main(String[] args) {

	int n;
	Scanner cin = new Scanner(System.in);
	n=cin.nextInt();
	for(int i=0;i<n;i++)
{
cin = new Scanner(System.in);
BigDecimal a = cin.nextBigDecimal();
BigDecimal b = cin.nextBigDecimal();
if(i==n-1)
System.out.println("Case "+(i+1)+":\n"+a+"+"+b+"="+a.add(b)+"\n\n");
else
	System.out.println("Case "+(i+1)+":\n"+a+"+"+b+"="+a.add(b));
}
}
}