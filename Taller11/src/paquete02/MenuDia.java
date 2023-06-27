/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author sofiv
 */
public class MenuDia extends Menu {

    private double bebida;
    private double postre;

    public MenuDia(String n, double v, double b, double p) {
        super(n, v);
        bebida = b;
        postre = p;
    }

    public void establecerBebida(double b) {
        bebida = b;
    }

    public void establecerPostre(double p) {
        postre = p;
    }

    @Override
    public void calcularTotal() {
        valorTotal = valorInicial + bebida + postre;
    }

    public double obtenerBebida() {
        return bebida;
    }

    public double obtenerPostre() {
        return postre;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu del dia:\n"
                + "%s"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del menu: %.2f\n\n", super.toString(),
                bebida, postre, valorTotal);

        return mensaje;
    }

}
