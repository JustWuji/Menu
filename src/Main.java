
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> nombres = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       int opcion = 0;
       
       while (opcion != 5) {
           String[] opciones = {
               "1. Agregar Nombre 🐢",
               "2. Eliminar Nombre ¬_¬",
               "3. Actualizar Nombre O.O",
               "4. Mostrar Nombres φ(*￣0￣)",
               "5. Salir －O－"
           
           };
           
           System.out.println("\n----- MENU ------");
           for (String item : opciones) {
               System.out.println(item);
           }
           
           System.out.print("Selecciona una rey ;D: ");
           opcion = Integer.parseInt(scanner.nextLine());
           
           switch (opcion) {
               case 1:
                   System.out.println("Ingresa el nombre paps: ");
                   String nombreAgregar = scanner.nextLine();
                   nombres.add(nombreAgregar);
                   System.out.println("Lito Agregau");
                   break;
                   
               case 2:
                   System.out.print("El nombre q eliminaras es .w.?: ");
                   String nombreEliminar = scanner.nextLine();
                   boolean eliminado = false;
                   for (int i = 0; i < nombres.size(); i++) {
                       if (nombres.get(i).equalsIgnoreCase(nombreEliminar)){
                           nombres.remove(i);
                           eliminado = true;
                           System.out.println("Eliminau papito");
                           break;
                       }
                   }
                   if (!eliminado) {
                       System.out.println("No lo encuentro ;-;.");
                   }
                   break;
               
               case 3:
                   System.out.print("El name que quieras actulizar :>: ");
                   String nombreActualizar = scanner.nextLine();
                    boolean actualizado = false;
                    for (int i = 0; i < nombres.size(); i++) {
                        if (nombres.get(i).equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Ingresa el nuevo name C:: ");
                            String nuevoNombre = scanner.nextLine();
                            nombres.set(i, nuevoNombre);
                            actualizado = true;
                            System.out.println("Lito Actualizau.");
                            break;
                        }
                    }
                    if (!actualizado) {
                        System.out.println("No lo Encuentro ;-;");
                    }
                    break;
               
               case 4:
                   System.out.println("\n--- Lista de Nombre -w- ---");
                   if (nombres.isEmpty()) {
                       System.out.println("Eta vacio compai.");
                   } else {
                       for (String nombre : nombres) {
                           System.out.println("- " + nombre);
                       }
                   }
                   break;
                
               case 5:
                   System.out.println("Saliendo del chocoro ;C.");
                   break;
                   
               default:
                   System.out.println("No es valida. intenta de nuevo ._.");
                    
        }
           
       
       }
       
       scanner.close();
    }
    
}
