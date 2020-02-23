package homeWork;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
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
	  public static void readFile() {
	        String pathname = "input.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
	        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
	        //不关闭文件会导致资源的泄露，读写文件都同理
	        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
	        try (FileReader reader = new FileReader(pathname);
	             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
	        ) {
	            String line;
	            //网友推荐更加简洁的写法
	            while ((line = br.readLine()) != null) {
	                // 一次读入一行数据
	                System.out.println(line);
	                
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    /**
	     * 写入TXT文件
	     */
	    public static void writeFile(book[] ax) {
	        try {
	            File writeName = new File("input.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
	            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
	            try (FileWriter writer = new FileWriter(writeName);
	                 BufferedWriter out = new BufferedWriter(writer)
	            ) {
	            	for(int i=0;i<ax.length;i++)
	                out.write(ax[i].getName()+' '+ax[i].getAuthor()+' '+ax[i].getMoney()+' '+ax[i].getFlag()+'\n'); // \r\n即为换行
	                out.flush(); // 把缓存区内容压入文件
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
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
		System.out.print("1.查看馆藏\n2.归还书籍\n3.借阅书籍\n4.保存数据");
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
		case 4:
			writeFile(AX);
			readFile();
			default:returnflag=true;
				break;
		}
		if(returnflag) {
			break;
		}
		}		
	}
}
