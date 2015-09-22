import tcp.TCPServer;


public class Main {
	public static void main(String[] args){
		TCPServer server = null;
		try{
			server = TCPServer.getInstance();
		} finally{
			server.close();
		}
	}
}
