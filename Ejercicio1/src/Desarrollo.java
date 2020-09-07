import javax.swing.*;
import java.awt.*;


public class Desarrollo {

    private int dinero;

    public Desarrollo() {
        dinero = 0;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void pedir(){

        int aPagar;
        int descuento;

        dinero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "¿Cuanto gasto la persona?"));

        if (dinero > 120000)
            descuento = ((20*dinero)/100);
        else
            descuento=0;

        aPagar = (dinero-descuento);

        JOptionPane.showMessageDialog(null,"El valor bruto es: " + dinero +"\n"+
                                      "Es valor del descuento es: " + descuento + "\n" +
                                       "El valor a pagar es: " + aPagar);


    }
}
