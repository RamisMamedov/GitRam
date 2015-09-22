package Park;

public class ThePlaces {
	
	private final String places;
	
	public ThePlaces(final int pIndex){
		places = "Place" + pIndex;
		
		
	}
	public String getName(){
		return places;
	}
}
