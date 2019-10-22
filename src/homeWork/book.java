package homeWork;

import java.util.Scanner;

public class book {
	String author;
	String name;
	double money;
	Boolean flag;
	public book(String author,String name,double money) {
		this.author=author;
		this.money=money;
		this.name=name;
		this.flag=false;
	}
	public book() {
		this.author="";
		this.money=0;
		this.name="";
		this.flag=true;
	}
	public void getBook() {
		System.out.print("name:"+name+" author:"+author+" money:"+money+"元   ");
		if(!flag) {
			System.out.print("在馆\n");
		}
		else {
			System.out.print("借出\n");
		}
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public double getMoney() {
		return money;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setBook(String author,String name,double money) {
		this.author=author;
		this.money=money;
		this.name=name;
		this.flag=false;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAuthor(String name) {
		this.author=name;
	}
	public void setName(double name) {
		this.money=name;
	}
	public void setName(Boolean flag) {
		this.flag=flag;
	}
	
	public void lend() {
		System.out.print("借出成功");
		this.flag=true;
		
	}
	public void back() {
		System.out.print("归还成功");
		this.flag=false;
	}
	public static void main(String[] avgs) {
		book[] AX=new book[5];
		//String[] bookName=new String[10];
		String authorName[]= {"Theshy","Baolan","Jackeylove","Leyan","Rookie"};
		double moneych[]= {18.88,18.88,77.7,12.5,39.5};
		String bookName[]= {"背着书包上学堂","卖女孩的小火柴","采姑娘的小蘑菇","食草打野","论小虎如何退役"};
		for(int i=0;i<5;i++) {
			AX[i]=new book(authorName[i],bookName[i],moneych[i]);
		//	AX[i].setBook();
			//AX[i].getBook();
		}
		System.out.print("1.查看馆藏\n2.归还书籍\n3.借阅书籍\n");
		Boolean returnflag=false;
		while(true) {
			int n;
			Scanner scan=new Scanner(System.in);
			n=scan.nextInt();
		switch(n) {
		case 1:
			for(int i=0;i<5;i++) {
				
				AX[i].getBook();
			}
			break;
		case 2:
			System.out.print("请输入书名：");
			Scanner scan2=new Scanner(System.in);
			String name;
			Boolean flag=true;
			name=scan2.next();
			for(int i=0;i<AX.length;i++) {
				if(AX[i].getName().equals(name)){
					if(AX[i].getFlag())
					{
						AX[i].back();
						flag=false;
					}
					else {
						flag=false;
						System.out.print("书未借出\n");
					}
			}
			}
			if(flag) 
				System.out.print("未找到\n");
			break;
		case 3:
			System.out.print("请输入书名：");
			Scanner scan3=new Scanner(System.in);
			String name1;
			Boolean flag1=true;
			name1=scan3.next();
			for(int i=0;i<AX.length;i++) {
				if(AX[i].getName().equals(name1)){
					if(!AX[i].getFlag())
					{	AX[i].lend();
					flag1=false;}
					else {
						System.out.print("书未在馆\n");
						flag1=false;
					}
				}
			}
			if(flag1) {
				System.out.print("未找到\n");
			}
			break;
			default:returnflag=true;
				break;
		}
		if(returnflag) {
			break;
		}
		}
		
		
		
		
		
	}
}
