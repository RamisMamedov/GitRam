package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPListener extends Thread{
	private Socket clientSocket = null;
	
	public TCPListener(final Socket pSocket) {
		clientSocket = pSocket;
	}
	
	@Override
	public void run() {
		try{
			InputStream in = clientSocket.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String ln = null;
			
			while ((ln = reader.readLine()) != null) {
				System.out.println(ln); 
			}
		} catch(Exception e){
			TCPServer.getInstance().removeListeners(this);
			e.printStackTrace();
		}
	}

	@Override
	public void interrupt() {
		try {
			clientSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			clientSocket = null;
		}
		super.interrupt();
	}
	
	
	
	
}
