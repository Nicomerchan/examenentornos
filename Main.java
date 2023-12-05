// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcion;
        System.out.println("Menú de opciones:");
        System.out.println("1. Área triángulo");
        System.out.println("2. Área círculo");
        System.out.println("3. Área del cono");
        System.out.print("Seleccione una opción: ");

        opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la base del triángulo: ");
                        double baseTriangulo = sc.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double alturaTriangulo = sc.nextDouble();

                        break;
                    case 2:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radioCirculo = sc.nextDouble();

                        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
                        System.out.print("el area del circulo es " +areaCirculo);
                        break;
                    case 3:
                        System.out.print("Ingrese el radio de la base del cono: ");
                        double radioCono = sc.nextDouble();
                        
                        double alturaCono = sc.nextDouble();

                        break;

                    default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
        sc.close();
    }
}