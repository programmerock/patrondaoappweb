package ar.org.centro8.curso.java.aplicaciones.clase_1;

import java.util.ArrayList;
import java.util.List;

public class Clase01 {
    public static void main(String[] args) {
        List<String> lista= new ArrayList();
        lista.add("lunes");
        lista.forEach(System.out::println);
        System.out.println("Hola Mundo!");
    }
}
