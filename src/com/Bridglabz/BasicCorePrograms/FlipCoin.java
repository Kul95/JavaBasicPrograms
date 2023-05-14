package com.Bridglabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

       coin();
    }
    public static void coin(){
        if(Math.random()<0.5){
            System.out.println("Head");
        }else{
            System.out.println("Tails");
        }
    }
    public static void leapYear(){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println("Enter the year:");
        if(((year%4==0) && (year%100 !=0))||(year%400==0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
