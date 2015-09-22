package fourwheeled;

import main.WagonSizeType;

public class Bac extends FourWheeled {
	private static final long serialVersionUID = 1L;

	public Bac(){
		super();
		super.tType=TransmitionType.AllWheelDrive;
		super.size=WagonSizeType.giant;
		super.maxspeed=170;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return "This is Bac";
	}

	
}
