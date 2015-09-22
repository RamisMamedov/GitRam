package Park;

import java.util.ArrayList;
import java.util.List;

public class TheLines {
	private final String lin;
	private List<ThePlaces> place = null;
	
	public TheLines(final int pIndex,final int pPlacesCount){
		lin="Lines"+pIndex;
		place=new ArrayList<ThePlaces>();
		for(int i=0;i<pPlacesCount;i++){
			final ThePlaces plac = new ThePlaces(i);
			place.add(plac);
		}
	}
	public String getName(){
		return lin;
	}
}
