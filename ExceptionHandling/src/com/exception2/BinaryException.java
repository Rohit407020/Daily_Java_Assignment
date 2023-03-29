package com.exception2;

import java.util.Scanner;

public class BinaryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String b = sc.next();

        try {
           
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) != '0' && b.charAt(i) != '1') {
                    throw new Exception("Invalid binary number");
                }
            }

          
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

