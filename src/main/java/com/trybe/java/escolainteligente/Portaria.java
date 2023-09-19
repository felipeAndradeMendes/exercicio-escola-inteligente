package com.trybe.java.escolainteligente;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

import java.util.Scanner;

public class Portaria {

  /**
   * Método emitirRelatorio.
   */
  public static void emitirRelatorio(int qtdFundamental1, int qtdFundamental2, int qtdMedio) {
    int total = qtdFundamental1 + qtdFundamental2 + qtdMedio;
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    DecimalFormat df = new DecimalFormat("#.0#", symbols);
    double percentFund1 = 100.0 * qtdFundamental1 / total;
    double percentFund2 = 100.0 * qtdFundamental2 / total;
    double percentMedio = 100.0 * qtdMedio / total;

    System.out.println("----- Quantidade -----");
    System.out.println("Ensino Fundamental I: " + qtdFundamental1);
    System.out.println("Ensino Fundamental II: " + qtdFundamental2);
    System.out.println("Ensino Médio: " + qtdMedio);
    System.out.println();
    System.out.println("----- Percentual -----");
    System.out.println("Ensino Fundamental I: " + df.format(percentFund1) + "%");
    System.out.println("Ensino Fundamental II: " + df.format(percentFund2) + "%");
    System.out.println("Ensino Médio: " + df.format(percentMedio) + "%");
    System.out.println();
    System.out.println("TOTAL: " + total);

  }

  /**
   * Método coletarInformacoes.
   */
  public static void coletarInformacoes() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Registrar o acesso de pessoa estudante");
    System.out.println("2 - Finalizar o acesso e emitir o relatório");

    ArrayList<Short> idadesEstudantes = new ArrayList<Short>();
    short fundamental1 = 0;
    short fundamental2 = 0;
    short ensinoMedio = 0;

    short menuOpt = scanner.nextShort();


    while (menuOpt != 2) {
      if (menuOpt != 1) {
        System.out.println("Entre com uma opção válida!");
        System.out.println("Entre com o número correspondente à opção desejada:");
        System.out.println("1 - Registrar o acesso de pessoa estudante");
        System.out.println("2 - Finalizar o acesso e emitir o relatório");
        menuOpt = scanner.nextShort();
      } else {
        System.out.println("Informe a idade da pessoa estudante:");
        short idade = scanner.nextShort();
        idadesEstudantes.add(idade);

        if (idade <= 10) {
          fundamental1++;
          System.out.println("Pessoa estudante do Ensino Fundamental I, catraca liberada!");
        } else if (idade >= 15) {
          ensinoMedio += 1;
          System.out.println("Pessoa estudante do Ensino Médio, catraca liberada!");
        } else {
          fundamental2++;
          System.out.println("Pessoa estudante do Ensino Fundamental II, catraca liberada!");
        }
        System.out.println("Entre com o número correspondente à opção desejada:");
        System.out.println("1 - Registrar o acesso de pessoa estudante");
        System.out.println("2 - Finalizar o acesso e emitir o relatório");
        menuOpt = scanner.nextShort();
      }
    }

    emitirRelatorio(fundamental1, fundamental2, ensinoMedio);

  }
}
