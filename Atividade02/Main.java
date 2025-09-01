package Atividade02;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String args[]){
        Caminhao ca = new Caminhao("Scania R500",LocalDate.of(2002, 03, 18),500.0,25);
        
        System.out.println(ca.getDataProducao());
    }
} 
