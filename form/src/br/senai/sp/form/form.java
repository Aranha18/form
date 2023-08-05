package br.senai.sp.form;

import java.util.Scanner;

public class form {
    public static void main(String[] args) {

        /** Import class Scanner */
        Scanner sc = new Scanner(System.in);

        System.out.print("Bom dia Prof 1 e Prof 2! Qual é o nome de voces? ");
        String [] nome= new String[2];
        nome[0]= sc.nextLine();
        nome[1]= sc.nextLine();

        System.out.print("Quantos anos vcs tem?");
        int idade [] = new int[2];
        idade[0]= sc.nextInt();
        idade[1]= sc.nextInt();

        System.out.print("Qual é altura de vcs?");
        float altura [] = new float[2];
        altura[0] = sc.nextFloat();
        altura[1] = sc.nextFloat();

        System.out.println("Qual o peso de vcs?");
        int peso [] = new int[2];
        peso[0]= sc.nextInt();
        peso[1]= sc.nextInt();

        System.out.print("Qual o rg de vcs?");
        long rg [] = new long[2];
        rg[0]= sc.nextLong();
        rg[1]= sc.nextLong();

        System.out.print("Qual seu cpf de vcs?");
        long cpf [] = new long[2];
        cpf[0]= sc.nextLong();
        cpf[1]= sc.nextLong();

        System.out.print("Qual a profissão de vcs?");
        String profissao [] = new String[2];
        profissao[0]= sc.next();
        profissao[1]= sc.next();

        System.out.print("Qual o curso de vcs ?");
        String curso [] = new String[2];
        curso[0]= sc.next();
        curso[1]= sc.next();


        /** Print das informações */

        System.out.println("----------------------------------");
        System.out.println("---------Formulario Prof 1--------\n");
        System.out.println("Ola " + nome[0] + " Seja Bem vindo !!");
        System.out.println("Sua idade é: " + idade[0]);
        System.out.println("Seu peso é: " + peso[0]);
        System.out.println("Sua altura é :" + altura[0]);
        System.out.println("Seu RG: " + rg[0]);
        System.out.println("Seu CPF: " + cpf[0]);
        System.out.println("Sua profissao: " + profissao[0]);
        System.out.println("Seu curso: " + curso[0]);
        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println("-----------------------------------");
        System.out.println("---------Formulario Prof 2 --------\n");
        System.out.println("Ola " + nome[1] + " Seja Bem vindo !!");
        System.out.println("Sua idade é: " + idade[1]);
        System.out.println("Seu peso é: " + peso[1]);
        System.out.println("Sua altura é :" + altura[1]);
        System.out.println("Seu RG: " + rg[1]);
        System.out.println("Seu CPF: " + cpf[1]);
        System.out.println("Sua profissao: " + profissao[1]);
        System.out.println("Seu curso: " + curso[1]);
        System.out.println("---------------------------");
        System.out.println("--------------------------\n);
    }

}
