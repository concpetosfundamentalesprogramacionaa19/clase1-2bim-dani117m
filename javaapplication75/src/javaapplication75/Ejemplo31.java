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
        Scanner entrada = new Scanner(System.in);
        Random aleatorios = new Random();// variable de mas 
        double nota = 0 ; 
        String opcion = ""; 
        boolean salida = true;
        int[] datos = new int[10];
        String[] rangos = {"0-8", "8.1-12", "12.1-16", "16.1-19","19.1-20","20.1-inf"};
  
        while (salida){
        System.out.println("Ingrese la nota");
        nota = entrada.nextInt(); 
        
                if(nota <= 8){
                    datos[0] = datos[0] + 1;
                }else{
                    if(nota>=8.1 && nota <=12){
                        datos[1] = datos[1] + 1;
                    }else{
                        if(nota>=12.1 && nota <=16){
                            datos[2] = datos[2] + 1;
                        }else{
                            if(nota>=16.1 && nota <=19){
                                datos[3] = datos[3] + 1;  
                            }else{
                                if(nota>=16.1 && nota <=19){
                                    datos[4] = datos[4] + 1;
                                }else{
                                    if(nota>=19.1 && nota <=20){
                                        datos[5] = datos[5] + 1;
                                    }else{
                                        if(nota>=20.1){
                                            datos[6] = datos[6] + 1;
                                    }
                                }        
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Ingrese (si) para salir ");
            opcion = entrada.nextLine();    
            if("si".equals(opcion)){
               salida = false; 
            }   
        }        
         
        System.out.println("Resultados");
        
        for(int i = 0; i<datos.length; i++){
            System.out.printf("Ventas en %s - %d\n", rangos[i], datos[i]);
            
        }
    }
}
