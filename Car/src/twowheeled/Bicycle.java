package twowheeled;

public class Bicycle extends TwoWheeled {

	private static final long serialVersionUID = 1L;

	public Bicycle(){
		super();
		spokesCount = 22;
	}

	@Override
	public String getName() {
		return "This is Bicycle";
	}
}
