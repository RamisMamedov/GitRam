package Park;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import main.TheWaggon;
public class TheParking {
	///======================== Singleton class realized=================
	private static volatile TheParking instance;
	public static void initialize(final int pFloursCount, 
			final int pLinesCount, 
			final int pPlacesCount,
			final int pEntarancesCount){
		if (instance == null)
			synchronized (TheParking.class) {
				instance = new TheParking(pFloursCount, pLinesCount, pPlacesCount, pEntarancesCount);
			}
	}
	
	public static TheParking getInstance(){
		return instance;
	}
	//=================================================================== 
	protected List<TheFlour> flours = null;
	protected List<ConcurrentLinkedQueue<TheWaggon>> entrances = null;
	
	//This is constructor
	private TheParking(final int pFloursCount, 
			final int pLinesCount, 
			final int pPlacesCount,
			final int pEntarancesCount){
		
		//Created flours
		flours = new ArrayList<TheFlour>();
		for (int i = 0; i < pFloursCount; i++){
			final TheFlour flour = new TheFlour(i, pLinesCount, pPlacesCount);
			flours.add(flour);
		}
		//Created entrances
		entrances = new ArrayList<ConcurrentLinkedQueue<TheWaggon>>();
		for (int i = 0; i < pEntarancesCount; i++){
			entrances.add(new ConcurrentLinkedQueue<TheWaggon>());
		}
	}
}
	
	
	
	
	