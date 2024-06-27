package Principal;

import Generadores.ConsultarAPI;
import Modelos.Moneda;

import java.util.*;

public class GestorConversion {
    private static final Map<String, String> conversiones = new HashMap<>();
    private ConsultarAPI consultarAPI;

    static {
        conversiones.put("1-USD-ARS", "USD a Peso Argentino");
        conversiones.put("2-ARS-USD", "Peso Argentino a USD");
        conversiones.put("3-USD-BRL", "USD a Real Brasileño");
        conversiones.put("4-BRL-USD", "Real Brasileño a USD");
        conversiones.put("5-USD-COP", "USD a Peso Colombiano");
        conversiones.put("6-COP-USD", "Peso Colombiano a USD");
    }

    public GestorConversion() {
        this.consultarAPI = new ConsultarAPI();
    }

    public void realizarConversion(int opcion, double cantidad) {
        String conversionKey = obtenerConversionKey(opcion);
        if (conversionKey == null) {
            System.out.println("Opción inválida.");
            System.out.println("****************************************************************************************");
            return;
        }

        String[] monedas = conversionKey.split("-");
        Moneda convertir = consultarAPI.buscarConvercionMonedas(monedas[1], monedas[2], cantidad);
        System.out.println("****************************************************************************************");
        System.out.println("El Valor " + cantidad + " [" + monedas[1] + "] corresponde al valor final de ==>> " + convertir.conversion_result() + " [" + monedas[2] + "]");

    }

    private String obtenerConversionKey(int opcion) {
        return conversiones.keySet().stream()
                .filter(key -> key.startsWith(String.valueOf(opcion)))
                .findFirst()
                .orElse(null);
    }
}