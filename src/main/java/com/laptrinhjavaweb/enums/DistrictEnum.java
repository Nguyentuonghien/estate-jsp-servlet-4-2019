package com.laptrinhjavaweb.enums;

public enum DistrictEnum {
	
	Quan_1("Quận 1"),
	Quan_2("Quận 2"),
	Quan_3("Quận 3");

	private String value;

	DistrictEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
