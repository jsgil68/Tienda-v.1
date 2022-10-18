/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eje;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjE {
    
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        Scanner Read = new Scanner(System.in);
        //System.out.println("Hello World!");
        System.out.println("     SELETIENE.COM");
        System.out.println("Bienvenido, Que desea hacer?");
        System.out.println(" 1. Comprar articulos");
        System.out.println(" 2. Vender articulos");
        System.out.println(" 3. Definir metodo de pago");
        System.out.println(" 4. Definir direccion de envio");
        System.out.println(" 5. Salir");
        int Buy = Leer.nextInt();//INTRODUCIMOS NUESTRA OPCIÓN POR TECLADO.

        switch (Buy) {

            case 1:

                System.out.println("     SELETIENE.COM");
                System.out.println("Bienvenido, Que desea hacer comprar?");
                System.out.println(" 1. Comprar bolsas");
                System.out.println(" 2. Comprar articulos individuales");
                
                int Gammas = Read.nextInt();
                switch (Gammas) {
                    case 1:
                        Gamma obje = new Gamma();
                        obje.tipos();
                        break;
                    case 2:
                        Carrito obj = new Carrito();
                        obj.listas();
                        break;
                }
            break;
            case 2:

            break;
            case 3:
                  
                System.out.println("Con que metodo desea realizar el pago");
                System.out.println(" 1. Efectivo contra entrega");
                System.out.println(" 2. PSE");
                System.out.println(" 2. Bonos");
                int pago = Read.nextInt();
                switch (pago) {
                case 1:
                        System.out.println("Usted realizara el pago cuando el pedido se entregue");
                break;
                case 2:
                    String targeta;
                    Scanner teclado = new Scanner(System.in);
                    System.out.print("Introduzca su Numero de targeta: ");
                    targeta = teclado.nextLine();
                    System.out.println("¡Su pedido sera enviado a: " + targeta + "!");
                break;
                case 3:
                        System.out.println("Usted realizara la entrega del bono al recibir el pedido");
                break;
                }
                
            break;
            case 4:
              String direccion;
                    Scanner teclado = new Scanner(System.in);
                    System.out.print("Introduzca su direccion: ");
                    direccion = teclado.nextLine();
                    System.out.println("¡Su pedido sera enviado a: " + direccion + "!");
                    System.out.println("Que tipo de envio desea?");
                    System.out.println("Con que metodo desea realizar el pago");
                System.out.println(" 1. Aereo");
                System.out.println(" 2. vehiculo");
                System.out.println(" 2. Ir a un punto a recogerlo");
                int tipoEnvio = Read.nextInt();
                switch (tipoEnvio) {
                case 1:
                        System.out.println("Su pedido se realizara por avion");
                break;
                case 2:
                    System.out.println("Su pedido se realizara por vehiculo");
                break;
                case 3:
                        System.out.println("Usted debera ir a un punto a retirar su pedido");
                break;
                }
            break;
            case 5:
                System.exit(0);
                break;
        }
    }

}
