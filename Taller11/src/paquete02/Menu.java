/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author sofiv
 */
public abstract class Menu {

    protected String nombre;
    protected double valorInicial;
    protected double valorTotal;

    public Menu(String n, double v) {
        nombre = n;
        valorInicial = v;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerValorInicial(double v) {
        valorInicial = v;
    }

    public abstract void calcularTotal();

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {

        String mensaje = String.format("\tPlato: %s\n"
                + "\tValor inicial: %.2f\n", obtenerNombre(),
                obtenerValorInicial());

        return mensaje;

    }

}
