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
			//���������� ֱ�Ӵӿ���̨��ȡ
			InputStreamReader in=new InputStreamReader(System.in);
			//����BufferReader���԰�������
			BufferedReader br=new BufferedReader(in); 
			//�ѻ�ȡSocket����� ����̨�ӵ�����д��ܵ�
			OutputStream os=socket.getOutputStream();
			//���տ���̨���������
			PrintStream ps=new PrintStream(os);
			String str=br.readLine();
			while(str!=null) {
				ps.println("�ͻ��������"+str);
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
