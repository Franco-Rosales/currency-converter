package Principal;

import java.util.*;

public class Menu {
    private static final Map<Integer, List<String>> opcionesMenu = new LinkedHashMap<>();

    static {
        opcionesMenu.put(1, Arrays.asList("Dolar", "Peso Argentino"));
        opcionesMenu.put(2, Arrays.asList("Peso Argentino", "Dolar"));
        opcionesMenu.put(3, Arrays.asList("Dolar", "Real Brasileño"));
        opcionesMenu.put(4, Arrays.asList("Real Brasileño", "Dolar"));
        opcionesMenu.put(5, Arrays.asList("Dolar", "Peso Colombiano"));
        opcionesMenu.put(6, Arrays.asList("Peso Colombiano", "Dolar"));
        opcionesMenu.put(7, Collections.singletonList("Salir"));
    }

    public void mostrarMenu() {
        System.out.println("****************************************************************************************");
        System.out.println("");
        System.out.println("Sea bienvenido/a al conversor de moneda =]");
        System.out.println("");
        opcionesMenu.forEach((key, value) -> {
            if (value.size() == 1) {
                System.out.println(key + ") " + value.get(0));
            } else {
                System.out.println(key + ") " + value.get(0) + " ==>> " + value.get(1));
            }
        });
        System.out.println("");
        System.out.println("Elija una opcion valida: ");
    }

    public int leerOpcion(Scanner lectura) {
        int opcion = 0;
        while (true) {
            try {
                opcion = Integer.parseInt(lectura.nextLine());
                if (opcionesMenu.containsKey(opcion)) {
                    break;
                } else {
                    System.out.println("Por favor, elija una opción válida entre 1 y 7: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, elija una opción válida: ");
            }
        }
        return opcion;
    }

    public double leerCantidad(Scanner lectura) {
        double cantidad = 0.0;
        while (true) {
            try {
                System.out.println("Ahora cuál es la cantidad que desea convertir: ");
                cantidad = Double.parseDouble(lectura.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido: ");
            }
        }
        return cantidad;
    }
}