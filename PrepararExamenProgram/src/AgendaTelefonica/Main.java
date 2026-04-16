package AgendaTelefonica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contacto> agenda = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Contacto ana = new Persona("Ana", 999999999, "01/01/1990");
        Contacto empresa = new Empresa("ACME", 900111222, "https://acme.com");

        agenda.add(ana);
        agenda.add(empresa);
        
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce el teléfono:");
        int telefono = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el cumpleaños:");
        String cumpleanos = sc.nextLine();

        Contacto nuevo = new Persona(nombre, telefono, cumpleanos);

        if (!agenda.contains(nuevo)) {
            agenda.add(nuevo);
            System.out.println("Contacto añadido.");
        } else {
            System.out.println("Ese contacto ya está en la agenda.");
        }

        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }
}