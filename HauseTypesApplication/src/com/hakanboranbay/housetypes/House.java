package com.hakanboranbay.housetypes;

/**
 * An abstract class that represents all types of houses.
 * @author hakanboranbay
 *
 */
public abstract class House {

	float price;
	int squareMeter;
	int roomNumber;
	int livingRoomNumber;
	
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
