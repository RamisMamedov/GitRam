package twowheeled;

public class Moped extends TwoWheeled {
	
	private static final long serialVersionUID = 1L;

	public Moped(){
		super();
		spokesCount = 33;
	}

	@Override
	public String getName() {
		return "This is Moped";
	}

}
