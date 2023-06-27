/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author sofiv
 */
public class Cuenta {

    private String cliente;
    private double iva;
    private ArrayList<Menu> listaMenu;
    private double subtotal;
    private double total;

    public Cuenta(String cli, ArrayList<Menu> lm, double i) {
        cliente = cli;
        listaMenu = lm;
        iva = i;
    }

    public void establecerCliente(String cli) {
        cliente = cli;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void establecerLista(ArrayList<Menu> lista) {
        listaMenu = lista;
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < listaMenu.size(); i++) {
            suma += listaMenu.get(i).obtenerValorTotal();
        }

        subtotal = suma;
    }

    public void establecerTotal() {
        double add = (subtotal * iva) / 100;
        total = subtotal + add;
    }

    public String obtenerCliente() {
        return cliente;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }

    public ArrayList<Menu> obtenerLista() {
        return listaMenu;
    }

    @Override
    public String toString() {
        String Cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                cliente);

        for (int i = 0; i < listaMenu.size(); i++) {
            Cadena = String.format("%s%s", Cadena, listaMenu.get(i));
        }
        Cadena = String.format("%sSubtotal: %.1f\n"
                + "IVA: %.1f\n"
                + "Total a Pagar: %.3f\n",
                Cadena, subtotal, iva, total);

        return Cadena;
    }

}
