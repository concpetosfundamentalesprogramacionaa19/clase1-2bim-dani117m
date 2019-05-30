/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Random;

/**
 *
 * @author UPS-SCI-002
 */
public class DemoRandomico {
    public static void main(String[] arg){
        Random aleatorios = new Random();// se importa la utilidad
        int v = aleatorios.nextInt(4);// 4 es el limete asta donde se puede generar los valores Random
        System.out.printf("%d\n",v);
    }
}
