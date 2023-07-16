import javax.swing.*;

public class ConversorTemperatura {
    private static final String [] OPCIONES_TEMPERATURAS = {
        "Celsius",
        "Kelvin",
        "Fahrenheit"
    };

    public void realizarConversion(){
        String temperaturaOrigen = mostrarInputDialogConOpciones("Ingrese la temperatura de origen:", OPCIONES_TEMPERATURAS);
        String temperaturaDestino = mostrarInputDialogConOpciones("Ingrese la temperatura de destino:", OPCIONES_TEMPERATURAS);
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura a convertir"));


    }

    private String mostrarInputDialogConOpciones(String mensaje,String[]opciones){
        return (String) JOptionPane.showInputDialog(null, mensaje, "Conversión",
                JOptionPane.DEFAULT_OPTION, null,opciones,opciones[0]);

    }

}
