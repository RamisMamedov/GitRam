package Factory;

import java.util.ArrayList;

import fourwheeled.Bac;
import fourwheeled.Sedan;
import fourwheeled.Suv;
import tcp.TCPClient;
import twowheeled.Bicycle;
import twowheeled.Bike;
import twowheeled.Moped;

public class Factory {
	
	
	
	public Object RandomFactory(Object obj) throws Exception, IllegalAccessException{
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Bike.class);
		classes.add(Bicycle.class);
		classes.add(Moped.class);
		classes.add(Sedan.class);
		classes.add(Suv.class);
		classes.add(Bac.class);
		
		int ce = classes.size()-1;
		int n = (int)(Math.random()*ce);		
		obj = classes.get(n).newInstance();
		return obj;
	}
	

}
