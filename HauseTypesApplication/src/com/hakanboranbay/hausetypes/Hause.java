package com.hakanboranbay.hausetypes;

import java.util.ArrayList;

public abstract class Hause {

	float price;
	int squareMeter;
	int roomNumber;
	int livingRoomNumber;
	ArrayList<Hause> hauseList = new ArrayList<>();
	
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
