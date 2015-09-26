package List;

import java.util.ArrayList;

import factory.Factory;
import tcp.TCPClient;

public class Ran {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		TCPClient client = null;
		Factory factory = new Factory();
		try{
			client = new TCPClient();
			//for (int i = 0; i< 100; i++){
			while(true){
				client.write(factory);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			} 
		} 
		finally {
			client.close();
		}
		
	}
	
	}
