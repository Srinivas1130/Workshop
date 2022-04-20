package com.bridgelabz.workshop;

public class GamblerUC2 {
	static final int stakePerDay=100;
    static final int betPerGame=1;
    public static void main (String[] args) {
    	System.out.println("Gambler stake per day $"+stakePerDay);
    	System.out.println("Gambler bet per day $"+betPerGame);
    	double check = Math.floor(Math.random()*10)% 2; 
    		
    	if (check==1) {
    		System.out.println("Gambler wins the game");
    	}
    	else
    	{
    		System.out.println("Gambler loss the game");		
    	}
    }
}
