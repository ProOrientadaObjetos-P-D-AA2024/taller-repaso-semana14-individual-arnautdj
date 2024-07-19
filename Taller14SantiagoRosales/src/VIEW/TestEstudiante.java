package VIEW;

import MODEL.Estudiante;
import CONTROLER.ProcesarEstudiantes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEstudiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String id;
        String nombre;
        double nota1;
        double nota2;
        ArrayList<Estudiante> lstEst = new ArrayList<>();
        ProcesarEstudiantes procesarEstudiantes = new ProcesarEstudiantes(lstEst);

        int opcion = 0;
        do {
            System.out.println("Ingrese un numero de acuerdo a la accion que se desea ejecutar");
            System.out.println("\t1. Insertar datos");
            System.out.println("\t2. Leer datos");
            System.out.println("\t3. Actualizar la base de datos");
            System.out.println("\t4. Borrar datos");
            System.out.println("\t5. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("* Ingrese el nombre del estudiante: ");
                    nombre = entrada.nextLine();
                    System.out.print("* Ingrese su primera nota: ");
                    nota1 = entrada.nextDouble();
                    System.out.print("* Ingrese su segunda nota: ");
                    nota2 = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("* Ingrese su ID universitario: ");
                    id = entrada.nextLine();

                    Estudiante estudiante = new Estudiante(nombre, nota1, nota2, id);
                    procesarEstudiantes.setLstEstudiantes(estudiante);
                    
                    procesarEstudiantes.insertarEstudiante(estudiante);

                    System.out.println("El estudiante ha sido guardado en la base de datos.\n");
                    break;
                case 2:
                    ArrayList<Estudiante> lstEst2 = procesarEstudiantes.getLstEstudiantes();
                    for (Estudiante est : lstEst2) {
                        System.out.println(est);
                    }
                    break;
                case 3:
                    System.out.println("* Ingrese el ID del estudiante al cual se le desee actualizar su información");
                    id = entrada.nextLine();

                    boolean found = false;

                    for (int i = 0; i < procesarEstudiantes.getLstEstudiantes().size(); i++) {
                        Estudiante est = procesarEstudiantes.getLstEstudiantes().get(i);
                        if (est.getId().equals(id)) {
                            found = true;
                            System.out.println("* Ingrese el dato que se quiere cambiar");
                            System.out.println("\t1) Nombre");
                            System.out.println("\t2) Nota 1");
                            System.out.println("\t3) Nota 2");
                            int eleccion = entrada.nextInt();
                            entrada.nextLine();
                            switch (eleccion) {
                                case 1:
                                    System.out.print("Ingrese su nombre actualizado: ");
                                    nombre = entrada.nextLine();
                                    est.setNombreEst(nombre);
                                    procesarEstudiantes.setLstEstudiantes(est);
                                    System.out.println("Nombre actualizado en el objeto: " + est.getNombreEst());
                                    break;
                                case 2:
                                    System.out.print("Ingrese la nota 1 actualizada: ");
                                    nota1 = entrada.nextDouble();
                                    entrada.nextLine();
                                    est.setNota1(nota1);
                                    procesarEstudiantes.setLstEstudiantes(est);
                                    break;
                                case 3:
                                    System.out.print("Ingrese la nota 2 actualizada: ");
                                    nota2 = entrada.nextDouble();
                                    entrada.nextLine();
                                    est.setNota2(nota2);
                                    procesarEstudiantes.setLstEstudiantes(est);
                                    break;
                                default:
                                    System.out.println("El número ingresado está fuera del rango de las opciones.");
                                    break;
                            }
                            procesarEstudiantes.updateEstudiante(est);
                        }
                    }

                    if (!found) {
                        System.out.println("No se ha encontrado un estudiante que posea la ID ingresada.");
                    }
                    break;
                case 4:
                    System.out.println("* Ingrese el ID del estudiante al cual se desea eliminar.");
                    id = entrada.nextLine();

                    procesarEstudiantes.deletedEstudiante(id);
                    break;
                case 5:
                    System.out.println("Usted ha salido del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 5);
        
    }
}
