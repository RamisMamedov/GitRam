package fourwheeled;

import main.WagonSizeType;

public class Suv extends FourWheeled {
	
	private static final long serialVersionUID = 1L;
	
	public Suv(){
		super();
		super.tType=TransmitionType.AllWheelDrive;
		super.size=WagonSizeType.big;
		super.maxspeed=200;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "This is Suv";
	}

}
