package com.searchOrder.view;

import java.util.Scanner;
import com.searchOrder.model.Busca;

public class ViewLinearSearch {

    public static void main(String[] args) {
       
        Busca b = new Busca();

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("\nInforme um número para iniciar uma busca linear no array: ");
        numero = ler.nextInt();

        int resultado = b.buscaLinear(b.getArray(), numero);

        if (resultado == -1) {
            System.out.println("Número não encontrado no array.");
        } else {
            System.out.println("Número "+ numero +" está na posição " + resultado + " do array!");
        }
        ler.close();
    }

}
