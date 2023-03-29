package com.assignment;

import java.util.Scanner;

public class chaekdac {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any caracter : ");
        char ch = scan.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is a alphabet.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is a digit.");

        } else {

             System.out.println(ch + " is a special char.");
        }
    
    }

}
