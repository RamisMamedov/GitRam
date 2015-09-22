package main;

import java.io.Serializable;

public abstract class TheWaggon implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected int maxspeed;
	protected int wheeled;
	protected WagonSizeType size = null;
	
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	public int getWheeled() {
		return wheeled;
	}
	public WagonSizeType getSize() {
		return size;
	}
	
	public abstract String getName();
}
