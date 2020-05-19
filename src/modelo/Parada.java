/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Barbero
 */
public class Parada {
    
    private int codigo;
    private String denominacion;

    public Parada(int codigo, String denominacion) {
        this.codigo = codigo;
        this.denominacion = denominacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    @Override
    public String toString() {
        return denominacion;
    }
}
