package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber=in.nextInt();
        System.out.println("Enter second number:");
        int secondNumber=in.nextInt();
        System.out.println("Enter Operation:");
        String op= in.next();
        switch (op){
            case "+": System.out.println("result: "+addFunction(firstNumber,secondNumber));break;
            case "-": System.out.println("result: "+MinFunction(firstNumber,secondNumber));break;
            case "/": System.out.println("result: "+divFunction(firstNumber,secondNumber));break;
            case "*": System.out.println("result: "+(firstNumber*secondNumber));break;

        }
        System.exit(0);

	public static int addFunction(int x,int y){return x+y;}
	public static int divFunction(int x,int y){(y==0)?return 0:return x/y;} 
	public static int MinFunction(int x,int y){return x-y;}
    }
}
