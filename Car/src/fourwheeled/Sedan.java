package fourwheeled;

import main.WagonSizeType;

public class Sedan extends FourWheeled {
	
	private static final long serialVersionUID = 1L;
	
	public Sedan(){
		super();
		super.tType=TransmitionType.FrontWheel;
		super.maxspeed=320;
		super.size=WagonSizeType.big;
		
	}

	public String getName(){
		return "This is Sedan";
	}
}
