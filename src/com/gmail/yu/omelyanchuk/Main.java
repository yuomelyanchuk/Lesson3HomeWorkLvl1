package com.gmail.yu.omelyanchuk;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

public class Main {
	private static void maxDigit(int a, int b, int c, int d) {
		if (b > a) {
			a = b;
		}
		if (c > a) {
			a = c;
		}
		if (d > a) {
			a = d;
		}
		System.out.println("max = " + a);

	}

	private static void apartmentFloor(int a) {
		int apartmentCount = 4;
		int floorCount = 9;
		int frontDoorCount = 4;
		int floor;
		int frontDoor;
		if (a > 0 && a <= apartmentCount * floorCount * frontDoorCount) {
			a=a-1;
			frontDoor = a / (apartmentCount * floorCount);
			floor = (a - frontDoor * floorCount * apartmentCount) / apartmentCount+1;
			frontDoor += 1;
			System.out.println("floor = " + floor + " frontDoor=" + frontDoor);

		} else {
			System.out.println("apartment not exists");
		}
	}

	private static void leapYear(int year){
		if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
			System.out.println("366");
		}
		else{
			System.out.println("355");
		}
	}
	
	private static void tieangleExists(double a,double b,double c){
		if((a+b)>c & (a+c)>b & (b+c)>a){
			System.out.println("triangle exists");
		}
		else{
			System.out.println("triangle non exists");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//tasc 1
		int a;
		int b;
		int c;
		int d;
		System.out.println("input a");
		a=sc.nextInt();
		System.out.println("input b");
		b=sc.nextInt();
		System.out.println("input c");
		c=sc.nextInt();
		System.out.println("input d");
		d=sc.nextInt();
		maxDigit(a, b, c, d);
		//tasc 2
		System.out.println("input apartment number");
		apartmentFloor(sc.nextInt());
		//tasc 3
		System.out.println("input yaer");
		leapYear(sc.nextInt());		
		//tasc 4
		
		double at;
		double bt;
		double ct;
		System.out.println("input triangle side");
		System.out.println("input a");
		at=sc.nextDouble();
		System.out.println("input b");
		bt=sc.nextDouble();
		System.out.println("input c");
		ct=sc.nextDouble();
		tieangleExists(at,bt,ct);
		
		sc.close();

	}

}
