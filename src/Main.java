import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        do {
            String[] conversiones = {
                    "Conversión de moneda",
                    "Conversión de temperatura",
                    "Salir"
            };
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Conversión",
                    JOptionPane.DEFAULT_OPTION, null, conversiones, conversiones[0]);

            if (opcion != null) {
                switch (opcion) {
                    case "Conversión de moneda":
                        ConversorMoneda conversorMoneda = new ConversorMoneda();
                        conversorMoneda.realizarConversion();
                        break;
                    case "Conversión de temperatura":
                        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
                        conversorTemperatura.realizarConversion();
                        break;
                    case "Salir":
                        continuar = false;
                        break;
                }
            } else {
                continuar = false;
            }

            if (continuar) {
                int opcionDialogo = mostrarDialogoContinuar();
                if (opcionDialogo == JOptionPane.NO_OPTION || opcionDialogo == JOptionPane.CANCEL_OPTION) {
                    continuar = false;
                }
            }

        } while (continuar);

        mostrarMensajeFinalizado();
    }

    private static int mostrarDialogoContinuar() {
        Object[] options = {"Yes", "No", "Cancel"};
        return JOptionPane.showOptionDialog(
                null,
                "¿Desea continuar?",
                "Continuar",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
    }

    private static void mostrarMensajeFinalizado() {
        JOptionPane.showMessageDialog(null, "Programa Finalizado");
    }
}
