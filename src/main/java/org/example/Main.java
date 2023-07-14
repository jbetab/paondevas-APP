package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           // declarando los datos de entrda del poblema
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsurio;


        //declarar un dato especial para caputar imformacion desde el teclado
        Scanner tecldo=new Scanner(System.in);

        //para inicializar las variales

        System.out.print("\u001B[30m paondevas App \u001B[0m");

        System.out.print("digite su ubicacion: ");
        ubicacionUsuario=tecldo.nextLine();

        System.out.print("digite su destino: ");
        destino=tecldo.nextLine();

        System.out.print("digite su nombre: ");
        nombreUsuario=tecldo.nextLine();

        System.out.print("digite su telefono: ");
        telefonoUsurio=tecldo.nextLine();



         //PROBLEMA DEL PROBLEMA
        String distancia="20";//esto es un texto
        //debo hacer parceo de la variable distancia
        //parceo=cambiar o modificar el tipo de datos de una variable
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer costoTotal=distanciaEnEntero*costoPorKilometro;

        //slidas del problema
        System.out.println("\u001B[30m senor ussuario:"+nombreUsuario+"\u001B[0m" );
        System.out.println("\u001B[30m el costo de su vieje es: $"+costoTotal+"\u001B[0m");










    }


}