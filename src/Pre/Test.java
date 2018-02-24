package Pre;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args)  {
//		// TODO Auto-generated method stub
//		File from=new File("E:\\jdk-8u161-windows-x64.exe"); 
//		String name=from.getName();
//		File to=new File("E:\\新建文件夹\\abcd\\"+name);
//		try {
//			InputStream duqu=new FileInputStream(from);
//			byte[] b=new byte[(int) from.length()];
//			duqu.read(b);
//			duqu.close();			
//			OutputStream copy=new FileOutputStream(to);		
//			copy.write(b);
//			copy.close();
//			System.out.println("shuhuwanc");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
