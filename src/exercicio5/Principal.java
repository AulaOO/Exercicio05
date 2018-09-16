/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, dataNascimento;
        float peso, altura;
        Prontuario prontuario1 = new Prontuario();
        Prontuario prontuario2 = new Prontuario();
        Prontuario prontuario3 = new Prontuario();
        Prontuario prontuario4 = new Prontuario();
        System.out.println("Digite as informações do paciente 1:");
        System.out.println("Nome: ");
        nome = ler.next();
        System.out.println("Data de nascimento: ");
        dataNascimento = ler.next();
        System.out.println("Altura: ");
        altura = ler.nextFloat();
        System.out.println("Peso: ");
        peso = ler.nextFloat();
        prontuario1.setNome(nome);
        prontuario1.setDataNascimento(dataNascimento);
        prontuario1.setAltura(altura);
        prontuario1.setPeso(peso);
        prontuario1.imprimiProntuario();
        prontuario1.calculaIMC();
        prontuario1.preDiagnosticar();
        System.out.println("\nDigite as informações do paciente 2:");
        System.out.println("Nome: ");
        nome = ler.next();
        System.out.println("Data de nascimento: ");
        dataNascimento = ler.next();
        System.out.println("Altura: ");
        altura = ler.nextFloat();
        System.out.println("Peso: ");
        peso = ler.nextFloat();
        prontuario2.setNome(nome);
        prontuario2.setDataNascimento(dataNascimento);
        prontuario2.setAltura(altura);
        prontuario2.setPeso(peso);
        prontuario2.imprimiProntuario();
        prontuario2.calculaIMC();
        prontuario2.preDiagnosticar();
        System.out.println("\nDigite as informações do paciente 3:");
        System.out.println("Nome: ");
        nome = ler.next();
        System.out.println("Data de nascimento: ");
        dataNascimento = ler.next();
        System.out.println("Altura: ");
        altura = ler.nextFloat();
        System.out.println("Peso: ");
        peso = ler.nextFloat();
        prontuario3.setNome(nome);
        prontuario3.setDataNascimento(dataNascimento);
        prontuario3.setAltura(altura);
        prontuario3.setPeso(peso);
        prontuario3.imprimiProntuario();
        prontuario3.calculaIMC();
        prontuario3.preDiagnosticar();
        System.out.println("\nDigite as informações do paciente 4:");
        System.out.println("Nome: ");
        nome = ler.next();
        System.out.println("Data de nascimento: ");
        dataNascimento = ler.next();
        System.out.println("Altura: ");
        altura = ler.nextFloat();
        System.out.println("Peso: ");
        peso = ler.nextFloat();
        prontuario4.setNome(nome);
        prontuario4.setDataNascimento(dataNascimento);
        prontuario4.setAltura(altura);
        prontuario4.setPeso(peso);
        prontuario4.imprimiProntuario();
        prontuario4.calculaIMC();
        prontuario4.preDiagnosticar();
    }
    
}
