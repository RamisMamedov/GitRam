package tcp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import factory.Factory;

public class TCPClient {
	private Socket socket = null;
	
	public TCPClient(){
		reconnect();
	}

	private void reconnect() {
		try{
			if (socket != null)
				socket.close();
			
			socket = new Socket("localhost", 5555);
			//write("test");
		} catch (Exception e){
			System.err.println(e);
		}
	}
	
	public boolean write(final Factory factory){
		if (socket == null || socket.isClosed() || !socket.isConnected())
			reconnect();
		OutputStream streamOut = null;
		BufferedWriter writer = null;
		try{
			streamOut = socket.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(streamOut));
			writer.write(factory + "\n");
			writer.flush();
			return true;
		} catch (Exception e){
			System.err.println(e);
			socket = null;
			return false;
		} finally {
			
		}
	}

	public void close() {
		
		try {
			if (socket != null)
				socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
