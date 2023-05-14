package com.Bridglabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

       coin();
        leapYear();
        primeFactor();
        powerOfTwoTable();
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
    public static void primeFactor(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime number");
        }
    }
    public static void powerOfTwoTable(){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(num+" *"+i+"="+num*i);
        }
    }
}
