package com.glearning.client;

import com.glearning.service.Service;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Service obj = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        long arr[] = new long[size];
        System.out.println("Enter elements of array");
        for(int i = 0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the total number of targets to be achieved");
        int target = sc.nextInt();
        for(int i=0; i<target;i++){
            System.out.println("Enter the value of the target");
            int value = sc.nextInt();
            obj.payMoneyTarget(arr,value);
        }
    }
}
