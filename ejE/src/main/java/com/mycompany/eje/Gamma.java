/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Gamma {
   public static void tipos(){
        String[] producto = {"Bolsa gamma baja","Bolsa gamma media","Bolsa gamma alta"};
        Double[] precios = {10000.0,15000.0,20000.0};
        int opcion =0;
        double total =0;
        
        ArrayList<String> carrito = new ArrayList();
        Scanner os = new Scanner (System.in);
        System.out.println("Productos en la tienda");
        /*for ( int i=0; i<5; i++){
            System.out.println(i + " " + producto[i] + "$" + precios[i]);
        }*/
           
            System.out.println("1. Bolsa gamma baja $10000.0");
            System.out.println("2. Bolsa gamma media 15000.0");
            System.out.println("3. Bolsa gamma alta $20000.0");
            System.out.println("4. Ver su carrito de compras");
            System.out.println("5.Salir");
            System.out.println("SELETIENE.COM");
            System.out.println("Elija sus productos");
            
        do{
            opcion=os.nextInt();
            switch(opcion){
                case 1:
                    carrito.add(producto[0]);
                    total=total +  precios[0];
                break;
                case 2:
                    carrito.add(producto[1]);
                    total=total +  precios[1];
                break;
                case 3:
                    carrito.add(producto[2]);
                    total=total +  precios[2];
                case 4:
                    for(int i=0; i<carrito.size(); i++){
                        System.out.println(carrito.get(i));
                    }
                break;
            }
        }while (opcion!=5);
        System.out.println("Su pago total es: " + total);
    }
}
