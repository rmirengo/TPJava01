package TPJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TomaDatos {
    //Declaracion de Variables
    public static void main(String[] args){
        String Name;
        String lastName;
        Integer Age;
        String Pastimes;
        String Editor;
        String OS;


        try (Scanner entrada = new Scanner(System.in)) {

            //Se le pide al usuario que ingrese su nombre
            System.out.println("Ingrese su nombre: ");
            Name = entrada.nextLine();

            //Se le pide al usuario que ingrese su apellido
            System.out.println("Ingrese su apellido:");
            lastName = entrada.nextLine();

            //Se le pide al usuario que ingrese su edad
            System.out.println("¿Cuántos años tienes?");
            Age = entrada.nextInt();

            //Se limpia el buffer del Scanner
            entrada.nextLine();

            //Se le pide al usuario que ingrese su hobbie
            System.out.println("¿Cuál es tu Hobbie favorito?:");
            Pastimes = entrada.nextLine();

            //Se le pide al usuario que ingrese su editor de código favorito
            System.out.println("¿Cuál es tu Editor de código favorito?:");
            Editor  = entrada.nextLine();

            //Se le pide al usuario que ingrese su Sistema Operativo
            System.out.println("¿Cuál es tu Sistema Operativo?:");
            OS  = entrada.nextLine();
        }

        //Se imprimen por consola los datos ingresados por el usuario
        System.out.println("Hola "+Name+" "+lastName);
        System.out.println("tienes "+Age+" años");
        System.out.println("tu hobbie favorito es: "+Pastimes);
        System.out.println("tu editor de código favorito es: "+Editor);
        System.out.println("tu Sistema Operativo es: "+OS);
    }
}
