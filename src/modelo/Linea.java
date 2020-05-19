/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Barbero
 */
public class Linea {
    
    private int codigo;
    private String denominacion;
    private int frecuencia;
    private Parada primera;
    private Parada ultima;
    private ArrayList<Parada>paradasintermedias;

    public Linea() {
        paradasintermedias = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public Parada getPrimera() {
        return primera;
    }

    public Parada getUltima() {
        return ultima;
    }

    public ArrayList<Parada> getParadasintermedias() {
        return paradasintermedias;
    }
    
    
    
}
