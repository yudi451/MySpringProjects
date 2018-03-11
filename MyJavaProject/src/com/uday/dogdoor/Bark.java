package com.uday.dogdoor;

public class Bark {
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	@Override
	public boolean equals(Object o1) {
		Bark b1 = (Bark) o1;
		if(b1 instanceof Bark) {
			return this.sound.equals(b1.getSound());
		}
		return false;
	}
}
