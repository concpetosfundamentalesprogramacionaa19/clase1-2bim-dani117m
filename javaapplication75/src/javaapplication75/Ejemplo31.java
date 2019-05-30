/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo31 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // escanaer de introduccion de datos 
        Random aleatorios = new Random();// variable aleatoria 
        // definicion de varibles  
        double nota = 0 ; 
        String opcion = ""; 
        boolean salida = true;
        int[] datos = new int[6];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19","19.1-20",
            "20.1-inf"};// el rango es de 5 
        
        while (salida){
            System.out.println("Ingrese la nota");
            nota = entrada.nextInt(); 
            // se utiliza un else if para mejora el orden y ahora lineas
            if(nota >= 0){
                if(nota <= 8){
                  datos[0] = datos[0] + 1;  
                }else if(nota>=8.1 && nota <=12){
                    datos[1] = datos[1] + 1;
                }else if(nota>=12.1 && nota <=16){
                    datos[2] = datos[2] + 1;
                }else if(nota>=16.1 && nota <=19){
                    datos[3] = datos[3] + 1; 
                }else if(nota>=19.1 && nota <=20){
                    datos[4] = datos[4] + 1;
                }else{
                    if(nota>=20.1){
                        datos[5] = datos[5] + 1;
                    }
                }
            }else{// por si el usuario introduce un numero negativo
                System.out.println("Nota incorrecta");
            }    
            entrada.nextLine();// limpieza del bufer
            System.out.println("Ingrese (si) para salir ");
            opcion = entrada.nextLine();    
            if("si".equals(opcion)){// salida de while con una opcion cadena
               salida = false; 
            }   
        }        
         
        System.out.println("Resultados");// se imprimen los resultados 
        // se usa for para mostras los datos almacenados  
        for(int i = 0; i<datos.length; i++){
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
            
        }
    }
}
