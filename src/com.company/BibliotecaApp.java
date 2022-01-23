package com.company;


import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args)  {
        /* ingresar datos en una aplicación de una biblioteca para prestarse libros */

        System.out.println("Bienvenido alumno");
        System.out.println("¿Que libro desea?");
        List<Libro> libros= Registro.getProductos();
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero del libro.  ");
        System.out.print("si no desea ninguno presione cero ");




        System.out.println("Ingrese el Dni");


    }
}
