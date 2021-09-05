package com.example.lab1;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter a length of rectangle > ");
	    int length = s.nextInt();
	    for(int i = 0; i < length; i++){
	      for (int j = 0; j < length; j++){
	        System.out.print("# ");
	      }
	      System.out.println("");
	    }
	}
}