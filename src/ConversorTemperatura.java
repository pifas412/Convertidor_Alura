import javax.swing.*;

public class ConversorTemperatura {
    private static final String[] OPCIONES_TEMPERATURAS = {
            "Celsius",
            "Kelvin",
            "Fahrenheit"
    };

    public void realizarConversion() {
        String temperaturaOrigen = mostrarInputDialogConOpciones("Ingrese la temperatura de origen:", OPCIONES_TEMPERATURAS);
        String temperaturaDestino = mostrarInputDialogConOpciones("Ingrese la temperatura de destino:", OPCIONES_TEMPERATURAS);
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura a convertir"));

        double gradosConvertido = convertirTemperatura(temperaturaOrigen, temperaturaDestino, cantidad);

        JOptionPane.showMessageDialog(null, cantidad + " " + temperaturaOrigen + " = " + gradosConvertido + " " + temperaturaDestino);
    }

    private String mostrarInputDialogConOpciones(String mensaje, String[] opciones) {
        return (String) JOptionPane.showInputDialog(null, mensaje, "Conversión",
                JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
    }

    private double convertirTemperatura(String temperaturaOrigen, String temperaturaDestino, double cantidad) {
        double cantidadConvertida = 0.0;

        if (temperaturaOrigen.equals("Celsius")) {
            if (temperaturaDestino.equals("Kelvin")) {
                cantidadConvertida = cantidad + 273.15;
            } else if (temperaturaDestino.equals("Fahrenheit")) {
                cantidadConvertida = (cantidad * 9 / 5) + 32;
            }
        } else if (temperaturaOrigen.equals("Kelvin")) {
            if (temperaturaDestino.equals("Celsius")) {
                cantidadConvertida = cantidad - 273.15;
            } else if (temperaturaDestino.equals("Fahrenheit")) {
                cantidadConvertida = (cantidad - 273.15) * 9 / 5 + 32;
            }
        } else if (temperaturaOrigen.equals("Fahrenheit")) {
            if (temperaturaDestino.equals("Celsius")) {
                cantidadConvertida = (cantidad - 32) * 5 / 9;
            } else if (temperaturaDestino.equals("Kelvin")) {
                cantidadConvertida = (cantidad - 32) * 5 / 9 + 273.15;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conversión no soportada.");
            return 0.0;
        }

        return cantidadConvertida;
    }
}
