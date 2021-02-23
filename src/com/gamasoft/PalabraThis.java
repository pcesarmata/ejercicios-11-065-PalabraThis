package com.gamasoft;

public class PalabraThis {
    public static void main(String[] args) {
        Persona objPersona = new Persona("César");
    }
}

class Persona{
    String nombre;
    Persona(String nombre){
        this.nombre = nombre;

        // Imprimir el objeto persona.
        Imprimir objImprimir = new Imprimir();
        objImprimir.imprimir(this); // This contiene la referencia al objeto persona.
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Argumento recibido:  = " + p); // Valor del objeto persona
        System.out.println("Ahora cambia el apuntador this: " + this);
    }
}