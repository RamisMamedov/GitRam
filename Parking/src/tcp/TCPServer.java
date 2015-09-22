package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TCPServer {
	private static volatile TCPServer instance = null;
	private ServerSocket serverSocket = null;
	private List<TCPListener> listeners = null;
	
	public static TCPServer getInstance(){
		if (instance == null)
			synchronized (TCPServer.class) {
				instance = new TCPServer();
			}
		return instance;
	}
	
	private TCPServer(){
		listeners = new ArrayList<TCPListener>();
		recreate();
	}

	private void recreate() { 
		try {
			serverSocket = new ServerSocket(9999);
			Socket clientSocket = null;
			while ((clientSocket = serverSocket.accept()) != null) {
				final TCPListener listener = new TCPListener(clientSocket); 
				listeners.add(listener);
				listener.start();
			}
		} catch (IOException e) { 
			System.out.println("Ошибка при чтении сообщения.");
			e.printStackTrace();
		}
	}

	public void removeListeners(final TCPListener listner){
		listeners.remove(listner);
	}
	
	public void close() {
		
		if (listeners != null){
			for (TCPListener listener: listeners){
				listener.interrupt();
				listener = null;
			}
			listeners.clear();
			listeners = null;
		}
		try {
			if (serverSocket != null)
				serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
