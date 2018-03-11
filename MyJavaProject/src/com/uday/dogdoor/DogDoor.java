package com.uday.dogdoor;

import java.util.ArrayList;
import java.util.List;

public class DogDoor {
	private boolean open;
	private List<Bark> barks;
	
	public DogDoor() {
		barks = new ArrayList<Bark>();
	}
	
	public void open() {
		open = true;
	}
	
	public void close() {
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public List<Bark> getAllowedBarks() {
		return barks;
	}
	
	public void addAllowedBarks(Bark b) {
		this.barks.add(b);
	}
}
