package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите ваше число");

        Scanner scan = new Scanner(System.in);

        long decVar = scan.nextLong();

        if(varTypeChecker(-128,127,decVar)){
            System.out.println("byte is ok");
        }

        if(varTypeChecker(-32768,32767,decVar)){
            System.out.println("short is ok");
        }

        if(varTypeChecker(-2147483648,2147483647,decVar)){
            System.out.println("int is ok");
        }

        if(varTypeChecker(-9223372036854775808L,9223372036854775807L,decVar)){
            System.out.println("long is ok");
        }

        while(Math.IEEEremainder(decVar, 2) < 1){

            Math.IEEEremainder(decVar,2);


        }
    }

    private static boolean varTypeChecker(long a, long b, long number){
        if(number >= a & number <= b ){
            return true;
        }
        return false;
    }
}
