package com.uday.guitarstore;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	@Override
	public boolean equals(Object o1) {
		GuitarSpec gs = (GuitarSpec) o1;
		return this.builder.name().equalsIgnoreCase(gs.builder.name());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("GuitarSpec=[");
		sb.append("builder=");
		sb.append(builder.name());
		sb.append(",model=");
		sb.append(model);
		sb.append(",type=");
		sb.append(type.name());
		sb.append(",backWood=");
		sb.append(backWood.name());
		sb.append(",topWood=");
		sb.append(topWood.name());
		sb.append("]");
		return sb.toString();
	}
}
