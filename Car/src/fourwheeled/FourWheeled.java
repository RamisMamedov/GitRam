package fourwheeled;
import main.TheWaggon;


public abstract class FourWheeled extends TheWaggon {
	
	private static final long serialVersionUID = 1L;
	
	protected TransmitionType tType = null;

public FourWheeled(){
	super();
	super.wheeled=4;
	
}



@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
}
