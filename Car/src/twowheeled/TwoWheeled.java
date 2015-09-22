package twowheeled;

import main.TheWaggon;
import main.WagonSizeType;

public abstract class TwoWheeled extends TheWaggon {
	
	private static final long serialVersionUID = 1L;
	
	protected int spokesCount; //кол-во спиц в колесе.
	
	public TwoWheeled(){
		super();
		super.wheeled = 2;
		super.size = WagonSizeType.little;
	}

	public int getSpokesCount() {
		return spokesCount;
	}

	public void setSpokesCount(int spokesCount) {
		this.spokesCount = spokesCount;
	}
	
	public String getName(){
		return null;
	}
}
