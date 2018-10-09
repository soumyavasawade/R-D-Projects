package com.soumya.compare;



public class MainCompare {

	public static void main(String[] args) {
		MyCompare myCompare= (n1, n2)->{return n1 > n2;};
		boolean compare= myCompare.compare(35,30);
		System.out.println(compare);

	}

}
