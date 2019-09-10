package com.company;

import java.util.Scanner;

public class  letrab {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int ProduzidoDefeito, PeçasProduzidas;
        System.out.println("informe o tota produzido");
        PeçasProduzidas = SC.nextInt();
        System.out.println("informe o total com defeito");
        ProduzidoDefeito = SC.nextInt();

        double Linear = PeçasProduzidas * .01;
        if (ProduzidoDefeito < Linear) {
            System.out.println("não pausa de manutenção");
        } else {
            System.out.println("precisa de manutenção");
        }
    }
}





