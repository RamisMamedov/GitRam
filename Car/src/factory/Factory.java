package factory;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import fourwheeled.Bac;
import fourwheeled.Sedan;
import fourwheeled.Suv;
import tcp.TCPClient;
import twowheeled.Bicycle;
import twowheeled.Bike;
import twowheeled.Moped;

public class Factory {
	
	public String Factory() throws InstantiationException, IllegalAccessException{
		ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Bike.class);
		classes.add(Bicycle.class);
		classes.add(Moped.class);
		classes.add(Sedan.class);
		classes.add(Suv.class);
		classes.add(Bac.class);
		
		int ce = classes.size()-1;
		int n = (int)(Math.random()*ce);		
		
		Gson gson = new Gson();
		String json = gson.toJson(classes.get(n).newInstance());
		return json;
			}

}
