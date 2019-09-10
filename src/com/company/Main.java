package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  Sc = new Scanner(System.in);
        int TotalCopias;
        System.out.println("informe o total de copias ");
        TotalCopias=Sc.nextInt();
        double TotalPago;
        if(TotalCopias > 100){
            TotalPago=TotalCopias * 0.20;
        } else{
            TotalPago=TotalCopias* .25;
        }
        System.out.println(TotalPago);
    }

}
