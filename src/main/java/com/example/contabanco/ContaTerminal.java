package com.example.contabanco;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Itaú Bank !");

        System.out.print("Insira o seu nome: ");
        String nomeCliente = scanner.nextLine().trim();

        System.out.print("Insira o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Insira o digito verificador se houver: ");
        String digitoVerificador = scanner.next();
        if (digitoVerificador.isEmpty()) {
            digitoVerificador = "0";
        }
        System.out.print("Insira o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Insira o digito verificador da conta bancária:" );
        int digitoConta = scanner.nextInt();

        System.out.print("Insira o valor que deseja depositar: ");
        BigDecimal saldoConta = scanner.nextBigDecimal();
        if (saldoConta.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("O valor do depósito não pode ser negativo.");
            return;
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agëncia é " + numeroAgencia+ "-" + digitoVerificador  +  ", conta " + numeroConta + "-" + digitoConta + " e seu saldo é de R$ " + saldoConta + " já está disponível para saque.");
    }
}
