package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        while(true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            if (nota >=0 && nota <=10) {
                break;
            } else {
                System.out.println("Valor inválido, digite novamente!");
            }
        }
        System.out.println("Você inseriu a nota:  " + nota);
        System.out.println("Programa encerrado!");
    }
}