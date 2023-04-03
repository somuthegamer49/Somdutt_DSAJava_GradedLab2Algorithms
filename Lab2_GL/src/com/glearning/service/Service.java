package com.glearning.service;

import java.util.Scanner;

public class Service {
    public void payMoneyTarget(long[] array, int value){
        long sum = 0;
        for(long i = 0; i < array.length; i++) {
            sum += array[(int)i];
            if (value <= sum) {
                System.out.println("Transaction reached target at " + (i+1));
                break;
            }
            else if(i== array.length-1){
                System.out.println("Transaction is not reached");
            }
        }

    }
}
