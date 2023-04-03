package com.glearning.Service;

public class DenominationService {
    public void DenominationAlgo(int[] array, int amount){
        int temp =0;
        int temp2 = 0;
        int arr2[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            int count = 0;
            if(amount<array[i]){
                continue;
            }
            while(amount >= array[i]) {
                amount = amount - array[i];
                count++;
            }
            if(amount<0){
                break;
            }
            System.out.println(array[i]+ ":" + count);
        }
    }
}