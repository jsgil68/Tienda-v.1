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
public class Carrito {
    public static void listas(){
        String[] producto = {"Agua","Pepsi","Carne","Verdura","Helado"};
        Double[] precios = {1500.0,3000.0,10000.0,7500.0,1500.0,3000.0};
        int opcion =0;
        double total =0;
        
        ArrayList<String> carrito = new ArrayList();
        Scanner os = new Scanner (System.in);
        System.out.println("Productos en la tienda");
        /*for ( int i=0; i<5; i++){
            System.out.println(i + " " + producto[i] + "$" + precios[i]);
        }*/
           
            System.out.println("1. Agua$1500.0");
            System.out.println("2. Pepsi$3000.0");
            System.out.println("3. Carne$10000.0");
            System.out.println("4. Verdura$7500.0");
            System.out.println("5. Helado$1500.0");
            System.out.println("6. Ver su carrito de compras");
            System.out.println("7.Salir");
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
                break;
                case 4:
                    carrito.add(producto[3]);
                    total=total +  precios[3];
                break;
                case 5:
                    carrito.add(producto[4]);
                    total=total +  precios[4];
                break;
                case 6:
                    for(int i=0; i<carrito.size(); i++){
                        System.out.println(carrito.get(i));
                    }
                break;
            }
        }while (opcion!=7);
        System.out.println("Su pago total es: " + total);
        
    }
}
