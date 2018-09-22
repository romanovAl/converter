package main;

import java.util.Arrays;
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

        reverseMass(decToBin(decVar));

    }
    private static int[] decToBin(long number){ //приводит к двоичной системе
        int[] massBinNum = new int[numberOfDiv(number)];
        long number2 = number;
        for(int i = 0; i < numberOfDiv(number2);i++){

            if((number / (double)2) == (int)Math.floor(number/2)){
                massBinNum[i] = 0;
                number = (long)Math.floor(number/2);
            } else{
                massBinNum[i] = 1;
                number = (long)Math.floor(number/2);
            }

        }
        return massBinNum;

    }


    private static int[] reverseMass(int[]massive){ //Переворачивает массив
        int[] finalMassive = new int[massive.length];
        for(int i = 0; i < massive.length; i++ ){
            finalMassive[i] = massive[massive.length - 1 - i];
//            System.out.println(Arrays.toString(finalMassive));
        }
        for(int i = 0; i< finalMassive.length; i++){
            System.out.print(finalMassive[i]);
        }
        return finalMassive;
    }


    private static int numberOfDiv(long number){  //Эта функция считает количество знаков в двоичном числе(длинна массива)
        int i = 1;
        while(Math.floor(number / 2) >= 1){
            number = (long)Math.floor(number / 2);
            i++;
        }
        return i;
    }

    private static boolean varTypeChecker(long a, long b, long number){  //Проверяет в каком диапазоне число
        return number >= a & number <= b;
    }

}
