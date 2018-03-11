package com.uday.dogdoor;

public class BarkRecognizer {
	private DogDoor dogDoor;
	
	public BarkRecognizer(DogDoor door) {
		this.dogDoor = door;
	}
	
	public void recognize(Bark bark) {
		if(dogDoor.getAllowedBarks().contains(bark)) {
			dogDoor.open();
		}
	}
}
