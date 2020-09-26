package com.kevin;

public class Main {

    public static void main(String[] args) {
        Alumno kevin = new Alumno();
        double[] calificaciones = {89,75,80,89,95};
        kevin.setNombre("Kevin Yañez");
        kevin.setCalificaciones(calificaciones);
        kevin.imprimirResultados();
    }
}
