package Scoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server=new ServerSocket(123);
			Socket socket=new Socket();
			InputStream from =socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(from);
			BufferedReader br=new BufferedReader(isr);
			//ѭ����ȡsocket���������
			String str=br.readLine();
			while(str!=null) {
				//
				System.out.println("�ͻ�˵��"+str);
				str=br.readLine();
			}
			br.close();
			isr.close();
			from.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
