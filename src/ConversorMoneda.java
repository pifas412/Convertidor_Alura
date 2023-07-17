import javax.swing.*;

public class ConversorMoneda {
    private static final String[] OPCIONES_MONEDAS = {
            "Pesos",
            "Dólares",
            "Euros",
            "Libras",
            "Yenes",
            "Won Coreano"
    };

    public void realizarConversion() {
        String monedaOrigen = mostrarInputDialogConOpciones("Ingrese la moneda de origen:", OPCIONES_MONEDAS);
        String monedaDestino = mostrarInputDialogConOpciones("Ingrese la moneda de destino:", OPCIONES_MONEDAS);
        double cantidad = obtenerCantidadValida();

        if (cantidad != Double.MIN_VALUE) {
            double cantidadConvertida = convertirMoneda(monedaOrigen, monedaDestino, cantidad);
            JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " = " + cantidadConvertida + " " + monedaDestino);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida (número).");
        }
    }

    private double obtenerCantidadValida() {
        double cantidad = Double.MIN_VALUE;
        boolean entradaValida = false;

        while (!entradaValida) {
            String input = JOptionPane.showInputDialog("Ingrese la cantidad a convertir:");
            try {
                cantidad = Double.parseDouble(input);
                entradaValida = true;
            } catch (NumberFormatException e) {
                // La entrada no es un número válido, se mostrará un mensaje de error y se solicitará nuevamente.
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida (número).");
            }
        }

        return cantidad;
    }



    private String mostrarInputDialogConOpciones(String mensaje, String[] opciones) {
        return (String) JOptionPane.showInputDialog(null, mensaje, "Conversión",
                JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
    }

    private double convertirMoneda(String monedaOrigen, String monedaDestino, double cantidad) {
        double cantidadConvertida = 0.0;

        if (monedaOrigen.equals("Pesos")) {
            if (monedaDestino.equals("Dólares")) {
                cantidadConvertida = cantidad / 20; // Suponiendo una tasa de cambio de 1 USD = 20 MXN
            } else if (monedaDestino.equals("Euros")) {
                cantidadConvertida = cantidad / 22; // Suponiendo una tasa de cambio de 1 EUR = 22 MXN
            } else if (monedaDestino.equals("Libras")) {
                cantidadConvertida = cantidad / 24; // Suponiendo una tasa de cambio de 1 GBP = 24 MXN
            } else if (monedaDestino.equals("Yenes")) {
                cantidadConvertida = cantidad / 0.18; // Suponiendo una tasa de cambio de 1 JPY = 0.18 MXN
            } else if (monedaDestino.equals("Won Coreano")) {
                cantidadConvertida = cantidad / 0.016; // Suponiendo una tasa de cambio de 1 KRW = 0.016 MXN
            }
        } else if (monedaOrigen.equals("Dólares")) {
            if (monedaDestino.equals("Pesos")) {
                cantidadConvertida = cantidad * 20; // Suponiendo una tasa de cambio de 1 USD = 20 MXN
            } else if (monedaDestino.equals("Euros")) {
                cantidadConvertida = cantidad * 0.91; // Suponiendo una tasa de cambio de 1 EUR = 0.91 USD
            } else if (monedaDestino.equals("Libras")) {
                cantidadConvertida = cantidad * 0.81; // Suponiendo una tasa de cambio de 1 GBP = 0.81 USD
            } else if (monedaDestino.equals("Yenes")) {
                cantidadConvertida = cantidad * 110.45; // Suponiendo una tasa de cambio de 1 JPY = 110.45 USD
            } else if (monedaDestino.equals("Won Coreano")) {
                cantidadConvertida = cantidad * 1159.86; // Suponiendo una tasa de cambio de 1 KRW = 1159.86 USD
            }
        } else if (monedaOrigen.equals("Euros")) {
            if (monedaDestino.equals("Pesos")) {
                cantidadConvertida = cantidad * 22; // Suponiendo una tasa de cambio de 1 EUR = 22 MXN
            } else if (monedaDestino.equals("Dólares")) {
                cantidadConvertida = cantidad * 1.10; // Suponiendo una tasa de cambio de 1 EUR = 1.10 USD
            } else if (monedaDestino.equals("Libras")) {
                cantidadConvertida = cantidad * 0.89; // Suponiendo una tasa de cambio de 1 GBP = 0.89 EUR
            } else if (monedaDestino.equals("Yenes")) {
                cantidadConvertida = cantidad * 128.69; // Suponiendo una tasa de cambio de 1 JPY = 128.69 EUR
            } else if (monedaDestino.equals("Won Coreano")) {
                cantidadConvertida = cantidad * 1356.08; // Suponiendo una tasa de cambio de 1 KRW = 1356.08 EUR
            }
        } else if (monedaOrigen.equals("Libras")) {
            if (monedaDestino.equals("Pesos")) {
                cantidadConvertida = cantidad * 24; // Suponiendo una tasa de cambio de 1 GBP = 24 MXN
            } else if (monedaDestino.equals("Dólares")) {
                cantidadConvertida = cantidad * 1.23; // Suponiendo una tasa de cambio de 1 GBP = 1.23 USD
            } else if (monedaDestino.equals("Euros")) {
                cantidadConvertida = cantidad * 1.12; // Suponiendo una tasa de cambio de 1 EUR = 1.12 GBP
            } else if (monedaDestino.equals("Yenes")) {
                cantidadConvertida = cantidad * 145.46; // Suponiendo una tasa de cambio de 1 JPY = 145.46 GBP
            } else if (monedaDestino.equals("Won Coreano")) {
                cantidadConvertida = cantidad * 1530.95; // Suponiendo una tasa de cambio de 1 KRW = 1530.95 GBP
            }
        } else if (monedaOrigen.equals("Yenes")) {
            if (monedaDestino.equals("Pesos")) {
                cantidadConvertida = cantidad * 0.18; // Suponiendo una tasa de cambio de 1 JPY = 0.18 MXN
            } else if (monedaDestino.equals("Dólares")) {
                cantidadConvertida = cantidad * 0.009; // Suponiendo una tasa de cambio de 1 USD = 0.009 JPY
            } else if (monedaDestino.equals("Euros")) {
                cantidadConvertida = cantidad * 0.0078; // Suponiendo una tasa de cambio de 1 EUR = 0.0078 JPY
            } else if (monedaDestino.equals("Libras")) {
                cantidadConvertida = cantidad * 0.0069; // Suponiendo una tasa de cambio de 1 GBP = 0.0069 JPY
            } else if (monedaDestino.equals("Won Coreano")) {
                cantidadConvertida = cantidad * 10.55; // Suponiendo una tasa de cambio de 1 KRW = 10.55 JPY
            }
        } else if (monedaOrigen.equals("Won Coreano")) {
            if (monedaDestino.equals("Pesos")) {
                cantidadConvertida = cantidad * 0.016; // Suponiendo una tasa de cambio de 1 KRW = 0.016 MXN
            } else if (monedaDestino.equals("Dólares")) {
                cantidadConvertida = cantidad * 0.00086; // Suponiendo una tasa de cambio de 1 USD = 0.00086 KRW
            } else if (monedaDestino.equals("Euros")) {
                cantidadConvertida = cantidad * 0.00074; // Suponiendo una tasa de cambio de 1 EUR = 0.00074 KRW
            } else if (monedaDestino.equals("Libras")) {
                cantidadConvertida = cantidad * 0.00065; // Suponiendo una tasa de cambio de 1 GBP = 0.00065 KRW
            } else if (monedaDestino.equals("Yenes")) {
                cantidadConvertida = cantidad * 0.095; // Suponiendo una tasa de cambio de 1 JPY = 0.095 KRW
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conversión no soportada.");
            return 0.0;
        }

        return cantidadConvertida;
    }
}


