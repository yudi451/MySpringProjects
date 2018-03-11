package com.uday.guitarstore;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		
		for(Guitar guitar: guitars) {
			if(guitar.getSerialNumber().equalsIgnoreCase(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> guitarList = new LinkedList<Guitar>();
		
		for(Guitar guitar: guitars) {
			if(guitar.getGuitarSpec() != null && searchGuitar.getGuitarSpec() != null) {
				if(guitar.getGuitarSpec().equals(searchGuitar.getGuitarSpec()))
					guitarList.add(guitar);
			}
		}
		return guitarList;
	}
}
