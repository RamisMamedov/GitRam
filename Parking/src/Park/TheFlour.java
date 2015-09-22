package Park;

import java.util.ArrayList;
import java.util.List;

public class TheFlour {

	private final String name;
private List<TheLines> lines = null;
	
	public TheFlour(final int pIndex, final int pLinesCount, final int pPlacesCount) {
		name =  "Flour " + pIndex;
		lines=new ArrayList<TheLines>();
		for(int i=0;i<pLinesCount;i++){
			final TheLines line = new TheLines(i, pPlacesCount);
			lines.add(line);
		//create lines
			
		}
	}
	
	public String getName(){
		return name;
	}
	
}
