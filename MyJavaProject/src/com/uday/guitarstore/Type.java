package com.uday.guitarstore;

public enum Type {
	ACOUSTIC, ELECTRIC;
	
	public String toString() {
		switch(this) {
		case ACOUSTIC: 
			return "acoustic";
		case ELECTRIC:
			return "electric";
		}
		return null;
	}
}
