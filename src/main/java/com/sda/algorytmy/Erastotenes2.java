package com.sda.algorytmy;

import java.util.Arrays;

public class Erastotenes2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sito(30)));

        int[] tab =sito(20);
        for (int i=0; i<tab.length; i++){

            System.out.println(tab[i]);

        }

    }

    public static int [] sito (int n){

        int [] T = new int[n+1];

       // for (int i=2; i>=n; i++){
    //}
        int i = 2;
        int w =0;
        while (!(i>=n)){
           w = i+i;


           while (!(w>n)){
               T[w] = 1;
               w = w + i;
           }
           i=i +1;
        }

        int count =0;

        for (int j = 2; j <= n ; j++) {

            if (T[j] == 0){

                count++;

            }

        }



        //nowa tablica

        int[] tabWynik = new int[count];

        int z =0;

        for (int j = 2; j <= n ; j++) {

            if (T[j] == 0){

                tabWynik[z++]= j;

            }

        }
        return tabWynik;
    }
}
