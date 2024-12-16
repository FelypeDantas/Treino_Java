package edu.curso;

public class Carro{
    String marca;
    String modelo;
    int ano;
    Pneu[] pneu = new Pneu[5];

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        for(int i = 0; i < 5; i++){
            pneu[i].aro = 14;
            pneu[i].marca = "Pirelli";
        }
    }
}