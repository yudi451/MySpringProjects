package com.uday.dogdoor;

public class Remote {
	private DogDoor dogDoor;
	
	public Remote(DogDoor door) {
		this.dogDoor = door;
	}
	
	public void pressButton() {
		if(dogDoor.isOpen()) {
			dogDoor.open();
		} else {
			dogDoor.close();
		}
	}
}
