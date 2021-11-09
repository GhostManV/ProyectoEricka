/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.modulomantenimiento;

import java.util.Scanner;

/**
 *
 * @author ghostman
 */
public class Menus {

    public Scanner datos = new Scanner(System.in);

    public Menus() {
    }

    public void menuInicio() {

        Preguntas pregunta = new Preguntas();
        String opcionElejida = "";
        System.out.println("********************");
        System.out.println("*  Menu Principal  *");
        System.out.println("********************");
        System.out.println("* 1).Ver Preguntas *");
        System.out.println("* 2).Nueva Pregunta*");
        System.out.println("*      S).Exit     *");
        System.out.println("********************");
        opcionElejida = datos.nextLine();
        switch (opcionElejida.charAt(0)) {
            case '1': {
                pregunta.mostrarPreguntas();
                menuInicio();
                break;
            }
            case '2': {
                pregunta.nuevaPregunta();
                menuInicio();
                break;
            }
            case 'S': {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Opcion No Disponible Elija Nuevamente");
                menuInicio();
                break;
            }
        }
    }

    public String menuCategorias() {
        int catSeleccionada = 0;
        String categoria="";
        System.out.println("********************");
        System.out.println("*  Menu Categorias *");
        System.out.println("********************");
        System.out.println("*1)BASIC_COMMANDS  *");
        System.out.println("*2)SHELL_SCRIPTS   *");
        System.out.println("*3)SECURE_SHELL    *");
        System.out.println("*4)POSIX_SEMAPHORES*");
        System.out.println("*5)MAVEN           *");
        System.out.println("*6)JAVA_THREADS    *");
        System.out.println("*7)DOCKERS         *");
        System.out.println("********************");
        catSeleccionada = datos.nextInt();
        datos.nextLine();
        switch(catSeleccionada){
            case 1:{
                categoria = "BASIC_COMMANDS";
                break;
            }
            case 2:{
                categoria = "SHELL_SCRIPTS";
                break;
            }
            case 3:{
                categoria = "SECURE_SHELL";
                break;
            }
            case 4:{
                categoria= "POSIX_SEMAPHORES";
                break;
            }
            case 5:{
                categoria= "MAVEN";
                break;
            }
            case 6:{
                categoria= "JAVA_THREADS";
                break;
            }
            case 7:{
                categoria= "DOCKERS";
                break;
            }
            default:{
                System.out.println("Categoria no disponible Elija nuevamente...");
                menuCategorias();
                break;
            }
        }
        return categoria;
    }
}
