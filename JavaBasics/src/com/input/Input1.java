package com.input;
import java.util.*;
public class Input1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		//String name = sc.next(); prints single word of a name.....
		String name = sc.nextLine(); // prints whole name or sentence.....
		System.out.println(name);
	}
}
