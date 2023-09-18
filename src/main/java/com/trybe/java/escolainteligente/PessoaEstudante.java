package com.trybe.java.escolainteligente;

import java.util.Scanner;

public class PessoaEstudante {

  /**
   * Método calcularIdadeEmDias.
   */
  public static int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o nome da Pessoa Estudante?");
    String nome = scanner.next();

    System.out.println("Qual a sua idade em anos, meses e dias?");
    System.out.println("anos:");
    int anos = Integer.parseInt(scanner.next());

    System.out.println("meses:");
    int meses = Integer.parseInt(scanner.next());

    System.out.println("dias:");
    int dias = Integer.parseInt(scanner.next());

    int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
    System.out.println("A idade de " + nome + " é " + idadeEmDias + ".");
  }
}