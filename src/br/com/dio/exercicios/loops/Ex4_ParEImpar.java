package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int countPares = 0;
        int countImpares = 0;

        System.out.println("Quantos números inteiros você vai digitar? ");
        int quantidadeNumeros = scan.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
        scan.close();
    } 
}