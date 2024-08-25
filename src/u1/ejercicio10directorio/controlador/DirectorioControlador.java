/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio10directorio.controlador;

import u1.ejercicio10directorio.modelo.Directorio;
import u1.ejercicio10directorio.vista.DirectorioVista;

/**
 *
 * @author borisperezg
 */
public class DirectorioControlador {

    private DirectorioVista frame;
    private Directorio directorio;

    public DirectorioControlador(DirectorioVista frame) {
        directorio = new Directorio();
        this.frame = frame;
    }

    public void agregarTelefono() {
        int telefono = Integer.parseInt(frame.getTxtTelefono().getText());
        directorio.agregarTelefono(telefono);
    }

    public void buscarTelefono() {

        int posicion = Integer.parseInt(frame.getTxtPosicion().getText());
        String telefono = directorio.buscarTelefono(posicion);
        frame.setTxtEncontrado(telefono);
    }

    public void eliminarTelefono() {

        int telefono = Integer.parseInt(frame.getTxtTelefono().getText());
        directorio.eliminarTelefono(telefono);
    }

    public void eliminarTelefonoPorPosicion() {
        int posi = Integer.parseInt(frame.getTxtPosicion().getText());
        directorio.eliminarTelefonoPorPosicion(posi);
    }

}
