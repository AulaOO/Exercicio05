/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author Luis Guilherme
 */
public class Prontuario {
    private String nome;
    private String dataNascimento;
    private float peso;
    private float altura;

    public Prontuario() {
    }

    public Prontuario(String nome, String dataNascimento, float peso, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void imprimiProntuario(){
        System.out.println("Nome do paciente: " + nome
        + "\nData de nascimento: " + dataNascimento
        + "\nPeso: " + peso
        + "\nAltura: " + altura);
    }
    
    public float calculaIMC(){
        float IMC = (peso)/(altura*altura);
        return IMC;
    }
    
    public void preDiagnosticar(){
        if(calculaIMC() < 18.5){
            System.out.println("Você está abaixo do peso ideal");
        }
        else if((calculaIMC() > 18.5) && (calculaIMC() < 24.9)){
            System.out.println("Você está no peso ideal");
        }
        else if((calculaIMC() > 25) && (calculaIMC() < 29.9)){
            System.out.println("Você está com sobrepeso");
        }
        else if((calculaIMC() > 30) && (calculaIMC() < 34)){
                System.out.println("Obesidade Grau I");
                }
        else if((calculaIMC() > 35) && (calculaIMC() < 39.9)){
            System.out.println("Obesidade Grau 2");        
    }
        else{
            System.out.println("Obesidade Mórbida");
        }
}
    
}
