package factory;

import java.util.ArrayList;
import Car.fourwheeled.Bac;
import Car.fourwheeled.Sedan;
import Car.fourwheeled.Suv;
import Car.tcp.TCPClient;
import Car.twowheeled.Bicycle;
import Car.twowheeled.Bike;
import Car.twowheeled.Moped;

public class Factory {
	
	
	private Object RandCar(Object obj){
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
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
	 
		Object ts = classes.get(n).newInstance();
		return obj;
		
	}

}
