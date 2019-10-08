package homeWork;

public class int_check {
	int a[]=new int[1000];
	int max,min;
	double avg;
	public int_check(int[] temp) {
		a=temp;
		max=min=temp[0];
		for(int value:temp) {
		if(value>max) {
			max=value;
		}
		if(value<min) {
			min=value;
		}
		avg+=value*1.0;
		}
		avg/=temp.length;
		
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	public double getAvg() {
		return avg;
	}
	public void AXsort() {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp;
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		
	}
	public void travel() {
		System.out.print("[");
		for(int value:a) {
			System.out.print(value+" ");
		}
		System.out.print("]");
	}
	public static void main(String[] avgs) {
		int a[]= {1,5,4,3,8,7,5,6,4,1};
		int_check p=new int_check(a);
		System.out.println("最大值:"+p.getMax());
		System.out.println("最小值:"+p.getMin());
		System.out.println("平均值:"+p.getAvg());
		p.travel();
		p.AXsort();
		System.out.println("\n排序后：");
		p.travel();
	}
}
