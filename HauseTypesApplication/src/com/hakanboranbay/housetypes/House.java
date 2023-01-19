package com.hakanboranbay.housetypes;

import java.util.ArrayList;

public abstract class House {

	float price;
	int squareMeter;
	int roomNumber;
	int livingRoomNumber;
	ArrayList<House> hauseList = new ArrayList<>();
	
	public float getPrice() {
		return price;
	}
	public int getSquareMeter() {
		return squareMeter;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getLivingRoomNumber() {
		return livingRoomNumber;
	}
	
}
