package Atividade02;

import java.sql.Date;

public class Main {
    public static void main(String args[]){
        Caminhao ca = new Caminhao("Scania",null,500.0,25);
        System.out.println(ca.getCapacidade());
        System.out.println(ca.Buzinar());
        System.out.println(ca.Deslocar());
        System.out.println(ca.transportar(10));
        System.out.println(ca.transportar(30));

        Cliente a = new Cliente("jonas");
        a.devolver(ca);
    }
} 
