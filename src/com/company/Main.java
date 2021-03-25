package com.company;
import Libreria.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        Consola obx = new Consola();
        obx.visualizar("Hola");

        Ventana obx1 = new Ventana();
        obx1.visualizar("Adios");
*/


        InterfaceMetodoComunes miSalida1,misalida2,misalida3,miEntrada1,miEntrada2;

        miSalida1= FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.CONSOLA);
        miSalida1.visualizar("Hola que tal estas");

        misalida2=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.VENTANA);
        misalida2.visualizar("Bien");

        misalida3=FactoriaDeSalidas.getProductoSalida(FactoriaDeSalidas.IMPRESORA);
        misalida3.visualizar("Imprimiendo por la impresora");

        miEntrada1= FactoriaDeEntradas.getProductoEntrada(FactoriaDeEntradas.CONSOLA);
        miEntrada1.introducirDatos();

        miEntrada2=FactoriaDeEntradas.getProductoEntrada(FactoriaDeEntradas.VENTANA);
        miEntrada2.introducirDatos();
    }
}
