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
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir:"));

            double cantidadConvertida = convertirMoneda(monedaOrigen, monedaDestino, cantidad);

            JOptionPane.showMessageDialog(null, cantidad + " " + monedaOrigen + " = " + cantidadConvertida + " " + monedaDestino);
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
            } else if (monedaDestino.equals("Pesos")) {
                if (monedaOrigen.equals("Dólares")) {
                    cantidadConvertida = cantidad * 20; // Suponiendo una tasa de cambio de 1 USD = 20 MXN
                } else if (monedaOrigen.equals("Euros")) {
                    cantidadConvertida = cantidad * 22; // Suponiendo una tasa de cambio de 1 EUR = 22 MXN
                } else if (monedaOrigen.equals("Libras")) {
                    cantidadConvertida = cantidad * 24; // Suponiendo una tasa de cambio de 1 GBP = 24 MXN
                } else if (monedaOrigen.equals("Yenes")) {
                    cantidadConvertida = cantidad * 0.18; // Suponiendo una tasa de cambio de 1 JPY = 0.18 MXN
                } else if (monedaOrigen.equals("Won Coreano")) {
                    cantidadConvertida = cantidad * 0.016; // Suponiendo una tasa de cambio de 1 KRW = 0.016 MXN
                }
            } else {
                JOptionPane.showMessageDialog(null, "Conversión no soportada.");
                return 0.0;
            }

            return cantidadConvertida;
        }
    }


