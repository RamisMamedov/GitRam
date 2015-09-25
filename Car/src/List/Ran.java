package List;

import java.util.ArrayList;

import fourwheeled.Bac;
import fourwheeled.Sedan;
import fourwheeled.Suv;
import tcp.TCPClient;
import twowheeled.Bicycle;
import twowheeled.Bike;
import twowheeled.Moped;

public class Ran {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		TCPClient client = null;
		try{
			client = new TCPClient();
			for (int i = 0; i< 100; i++){
				client.write("test" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			} 
		} 
		finally {
			client.close();
		}
		/*ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Bike.class);
		classes.add(Bicycle.class);
		classes.add(Moped.class);
		classes.add(Sedan.class);
		classes.add(Suv.class);
		classes.add(Bac.class);
		
		int ce = classes.size()-1;
		
		int n = (int)(Math.random()*ce);		
		System.out.println(n);
		
		
	 //classes.get(n);
	 
		Object ts = classes.get(n).newInstance();*/
	
	}
	
	}
