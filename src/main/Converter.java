package main;

import java.util.Scanner;

public class Converter {

    Scanner scan = new Scanner(System.in);

    long decVar = scan.nextLong();

    boolean varTypeChecker(long a,long b, long number){
        if(number >= a & number <= b ){
            return true;
        }
        return false;
    }
}
