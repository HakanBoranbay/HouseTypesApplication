package com.hakanboranbay.main;

import java.util.LinkedHashSet;

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
	
	LinkedHashSet<House> houseList = new LinkedHashSet<>();
	LinkedHashSet<House> flatList = new LinkedHashSet<>();
	LinkedHashSet<House> villaList = new LinkedHashSet<>();
	LinkedHashSet<House> summerHauseList = new LinkedHashSet<>();

	Flat flat1 = new Flat(10000.0f, 50, 1, 0);
	Flat flat2 = new Flat(20000.0f, 75, 2, 1);
	Flat flat3 = new Flat(30000.0f, 80, 3, 1);
	Villa villa1 = new Villa(50000.00f, 110, 4, 1);
	Villa villa2 = new Villa(60000.00f, 140, 5, 2);
	Villa villa3 = new Villa(70000.00f, 160, 6, 2);
	SummerHouse summerHause1 = new SummerHouse(35000.00f, 95, 4, 1);
	SummerHouse summerHause2 = new SummerHouse(45000.00f, 115, 5, 1);
	SummerHouse summerHause3 = new SummerHouse(55000.00f, 95, 6, 2);
	
	public Houses() {
		this.flatList = getFlatList();
		this.villaList = getVillaList();
		this.summerHauseList = getSummerHauseList();
		this.houseList = getHauseList();
	}
	
	public LinkedHashSet<House> getHauseList() {
		houseList.addAll(flatList);
		houseList.addAll(villaList);
		houseList.addAll(summerHauseList);
		return houseList;
	}
	public LinkedHashSet<House> getFlatList() {
		flatList.add(flat1);
		flatList.add(flat2);
		flatList.add(flat3);
		return flatList;
	}
	public LinkedHashSet<House> getVillaList() {
		villaList.add(villa1);
		villaList.add(villa2);
		villaList.add(villa3);
		return villaList;
	}
	public LinkedHashSet<House> getSummerHauseList() {
		summerHauseList.add(summerHause1);
		summerHauseList.add(summerHause2);
		summerHauseList.add(summerHause3);
		return summerHauseList;
	}
	
	public void printLists() {
		System.out.println(getHauseList());
	}
	
}
