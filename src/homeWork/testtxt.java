package homeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testtxt {
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
                out.write(book[i].+' '); // \r\n即为换行
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
		String moneych[]= {"18.88","18.88","77.7","12.5","39.5"};
		String bookName[]= {"背着书包上学堂","卖女孩的小火柴","采姑娘的小蘑菇","食草打野","论小虎如何退役"};
		String flag[]= {}
		writeFile(authorName);
		
		readFile();
    }
}
