package Principal;

import java.util.Scanner;

public class ConversorMoneda {
    private Menu menu;
    private GestorConversion gestorConversion;
    private Scanner lectura;

    public ConversorMoneda() {
        this.menu = new Menu();
        this.gestorConversion = new GestorConversion();
        this.lectura = new Scanner(System.in);
    }

    public void iniciar() {
        while (true) {
            menu.mostrarMenu();
            int opcion = menu.leerOpcion(lectura);
            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor de moneda. ¡Hasta luego!");
                break;
            }
            double cantidad = menu.leerCantidad(lectura);

            gestorConversion.realizarConversion(opcion, cantidad);
        }
        lectura.close();
    }
}