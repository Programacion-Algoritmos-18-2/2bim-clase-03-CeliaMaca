/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author USUARIO
 */
public class Main {

    public static void main(String[] args) {

        LeerArchivoTexto1 archivo = new LeerArchivoTexto1();
        OperacionData operaciones = new OperacionData();

        archivo.abrirArchivo();
        operaciones.agregarInformacion(archivo.leerRegistros());
        archivo.cerrarArchivo();
        System.out.printf("El promedio de capacidad es: %.2f\n", operaciones.obtenerPromedio());

    }
}
