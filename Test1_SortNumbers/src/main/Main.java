/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Arrays;
    

/**
 *
 * @author Laputa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] A = {8, 72, 2, 83, 5, 23, 55, 62, 17, 40, 79, 22};
        System.out.println("The original sequence A is: " + Arrays.toString(A));
        
        int[] sorted = selectionSort(A);// sort the array using selection sort
        int[] primes = removeNonPrimes(sorted); // remove non-prime numbers from the sorted array
        System.out.println("The sorted prime sequence A is: "+ Arrays.toString(primes));
        
    }
    
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static int[] removeNonPrimes(int[] arr){
        int[] primes = new int[arr.length];
        int count = 0;
        for(int num : arr){
            if(isPrime(num)){
                primes[count++] = num;
            }
        }
        int[] result = new int[count];
        for(int i=0; i<count; i++){
            result[i] = primes[i];
        }
        return result;
    }
    
}
