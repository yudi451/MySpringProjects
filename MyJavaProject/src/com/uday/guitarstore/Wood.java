package com.uday.guitarstore;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, ALDER;
	
	public String toString() {
		switch(this) {
		case INDIAN_ROSEWOOD: return "Indian RoseWood";
		case BRAZILIAN_ROSEWOOD: return "Brazilian RoseWood";
		case ALDER: return "Alder";
		}
		return null;
	}
}
