package com.company;

public class Main {

    public static void main(String[] args) {
	    Life l = new Life();
        //System.out.println(l.randState(9,8));
        l.renderBoard(l.randState(50,100));
    }
}
