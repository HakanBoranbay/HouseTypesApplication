package com.hakanboranbay.main;

import java.util.ArrayList;

import com.hakanboranbay.housetypes.Flat;
import com.hakanboranbay.housetypes.House;
import com.hakanboranbay.housetypes.SummerHouse;
import com.hakanboranbay.housetypes.Villa;

/**
 * A class that 3 of each type of houses are created.
 * 4 methods to get lists of all houses, flats, villas and summer houses.
 * @author hakanboranbay
 *
 */
public class Houses {
	
	ArrayList<House> hauseList = new ArrayList<>();
	ArrayList<House> flatList = new ArrayList<>();
	ArrayList<House> villaList = new ArrayList<>();
	ArrayList<House> summerHauseList = new ArrayList<>();

	Flat flat1 = new Flat(100000.0f, 50, 1, 0);
	Flat flat2 = new Flat(200000.0f, 75, 2, 1);
	Flat flat3 = new Flat(300000.0f, 80, 3, 1);
	Villa villa1 = new Villa(500000.00f, 110, 4, 1);
	Villa villa2 = new Villa(600000.00f, 140, 5, 2);
	Villa villa3 = new Villa(700000.00f, 160, 6, 2);
	SummerHouse summerHause1 = new SummerHouse(350000.00f, 95, 4, 1);
	SummerHouse summerHause2 = new SummerHouse(450000.00f, 115, 5, 1);
	SummerHouse summerHause3 = new SummerHouse(550000.00f, 95, 6, 2);
	
	public ArrayList<House> getHauseList() {
		hauseList.addAll(flatList);
		hauseList.addAll(villaList);
		hauseList.addAll(summerHauseList);
		return hauseList;
	}
	public ArrayList<House> getFlatList() {
		flatList.add(flat1);
		flatList.add(flat2);
		flatList.add(flat3);
		return flatList;
	}
	public ArrayList<House> getVillaList() {
		villaList.add(villa1);
		villaList.add(villa2);
		villaList.add(villa3);
		return villaList;
	}
	public ArrayList<House> getSummerHauseList() {
		summerHauseList.add(summerHause1);
		summerHauseList.add(summerHause2);
		summerHauseList.add(summerHause3);
		return summerHauseList;
	}
	
}
