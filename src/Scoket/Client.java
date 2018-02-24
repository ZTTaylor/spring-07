package Scoket;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket=new Socket("10.25.130.175",123);
			//创建输入流 直接从控制台获取
			InputStreamReader in=new InputStreamReader(System.in);
			//套用BufferReader可以按行来读
			BufferedReader br=new BufferedReader(in); 
			//把获取Socket输出流 控制台接的内容写入管道
			OutputStream os=socket.getOutputStream();
			//接收控制台输入的内容
			PrintStream ps=new PrintStream(os);
			String str=br.readLine();
			while(str!=null) {
				ps.println("客户端输出："+str);
				str=br.readLine();
			}
			br.close();
			in.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
