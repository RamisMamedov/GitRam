package twowheeled;


public class Bike extends TwoWheeled {
	
	private static final long serialVersionUID = 1L;

	public Bike(){
		super();
		spokesCount = 11;
	}

	@Override
	public String getName() {
		return "This is Bike";
	}
}
