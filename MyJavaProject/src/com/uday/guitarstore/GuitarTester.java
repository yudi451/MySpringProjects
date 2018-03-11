package com.uday.guitarstore;

import java.util.List;

public class GuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec genericGuitarSpec = new GuitarSpec(Builder.FENDER, "stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		Guitar whatILike = new Guitar("", 0, genericGuitarSpec);
		List<Guitar> search = inventory.search(whatILike);
		System.out.println(search);
	}

	private static void initializeInventory(Inventory inventory) {
		GuitarSpec genericGuitarSpec = new GuitarSpec(Builder.FENDER, "stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		inventory.addGuitar("V95693", 1499.95, genericGuitarSpec);
		inventory.addGuitar("V95645", 2000, genericGuitarSpec);
	}	
}
