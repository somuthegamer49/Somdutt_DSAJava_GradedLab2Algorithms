package com.glearning.Client;

import com.glearning.Service.DenominationService;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        DenominationService obj = new DenominationService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the currency denominations");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the currency denominations value");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        obj.DenominationAlgo(arr,amount);
    }


}
