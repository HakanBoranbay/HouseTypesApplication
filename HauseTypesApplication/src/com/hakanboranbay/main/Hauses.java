package com.hakanboranbay.main;

import java.util.ArrayList;

import com.hakanboranbay.hausetypes.Flat;
import com.hakanboranbay.hausetypes.Hause;
import com.hakanboranbay.hausetypes.SummerHause;
import com.hakanboranbay.hausetypes.Villa;

public class Hauses {
	
	ArrayList<Hause> hauseList = new ArrayList<>();
	ArrayList<Flat> flatList = new ArrayList<>();
	ArrayList<Villa> villaList = new ArrayList<>();
	ArrayList<SummerHause> summerHauseList = new ArrayList<>();

	Flat flat1 = new Flat(100000.0f, 50, 1, 0);
	Flat flat2 = new Flat(200000.0f, 75, 2, 1);
	Flat flat3 = new Flat(300000.0f, 80, 3, 1);
	Villa villa1 = new Villa(500000.00f, 110, 4, 1);
	Villa villa2 = new Villa(600000.00f, 140, 5, 2);
	Villa villa3 = new Villa(700000.00f, 160, 6, 2);
	SummerHause summerHause1 = new SummerHause(350000.00f, 95, 4, 1);
	SummerHause summerHause2 = new SummerHause(450000.00f, 115, 5, 1);
	SummerHause summerHause3 = new SummerHause(550000.00f, 95, 6, 2);
	
	public ArrayList<Hause> getHauseList() {
		hauseList.addAll(flatList);
		hauseList.addAll(villaList);
		hauseList.addAll(summerHauseList);
		return hauseList;
	}
	public ArrayList<Flat> getFlatList() {
		flatList.add(flat1);
		flatList.add(flat2);
		flatList.add(flat3);
		return flatList;
	}
	public ArrayList<Villa> getVillaList() {
		villaList.add(villa1);
		villaList.add(villa2);
		villaList.add(villa3);
		return villaList;
	}
	public ArrayList<SummerHause> getSummerHauseList() {
		summerHauseList.add(summerHause1);
		summerHauseList.add(summerHause2);
		summerHauseList.add(summerHause3);
		return summerHauseList;
	}
	
}
