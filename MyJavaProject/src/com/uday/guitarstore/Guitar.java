package com.uday.guitarstore;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec guitarSpec;
	
	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	public void setGuitarSpec(GuitarSpec guitarSpec) {
		this.guitarSpec = guitarSpec;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Guitar[");
		sb.append("serialNumber=");
		sb.append(this.serialNumber);
		sb.append(", price=");
		sb.append(this.price);
		sb.append(", GuitarSpec=");
		sb.append(guitarSpec);
		sb.append("]");
		return sb.toString();
	}
}
