package com.C00FizzBuzz;

/*
* RETO #0
* Programa que muestre por consola los numeros de 1-100(salto de linea entre impresion )
* sustituyendo los siguientes numeros:
* multiplos de 3 por FIZZ
* multiplos de 5 por BUZZ
* multiplos de 3 y 5 por FIZZBUZZ
* */



public class Main {

    public static boolean esMultiplo(int n1, int n2){
        if (n1 % n2 == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        int num = 100;

        for (int i =1;i <= num;i++){
            if (esMultiplo(i,3) && esMultiplo(i,5)  ) {
                System.out.println( i + " FIZZBUZZ");
            } else if (esMultiplo(i,5)) {
                System.out.println(i + " BUZZ");
            }else if (esMultiplo(i,5)){
                System.out.println(i + " FIZZ");
            }else{
                System.out.println(i);
            }
        }





    }

}
