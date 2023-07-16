
import javax.swing.*;

        public class Main {
            public static void main(String[] args) {
                String[] conversiones = {
                        "Conversión de moneda",
                        "Conversión de temperatura"
                };
                String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversión",
                        JOptionPane.DEFAULT_OPTION, null, conversiones, conversiones[0]);

                if (opcion != null) {
                    if (opcion.equals("Conversión de moneda")) {
                        ConversorMoneda conversorMoneda = new ConversorMoneda();
                        conversorMoneda.realizarConversion();
                    } else if (opcion.equals("Conversión de temperatura")) {
                        // Aquí puedes implementar la lógica para la conversión de temperatura
                        JOptionPane.showMessageDialog(null, "Conversión de temperatura no implementada.");
                    }
                }
            }
        }
