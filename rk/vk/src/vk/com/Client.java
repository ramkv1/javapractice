package vk.com;

import java.io.*;
import java.net.*;

class Client {
	public static void main(String[] args) throws IOException {
			String address = args[0];
			int port = Integer.parseInt(args[1]);
			Socket s = new Socket(address, port);
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			byte[] b1 = new byte[100];
			byte[] b2 = new byte[100];
			while (true) {
				System.out.println("To server:");
				System.in.read(b1);
				os.write(b1);
				is.read(b2);
				String s1 = new String(b2);
				String s2 = s1.trim();
				System.out.println("From Server" + s2);
		} 
	}
}
