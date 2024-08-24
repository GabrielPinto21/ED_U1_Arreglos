/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio9banco.controlador;

import u1.base.ejercicio9banco.modelo.Banco;
import u1.ejercicio9banco.vista.BancoVista;

/**
 *
 * @author borisperezg
 */
public class BancoControlador {

    private BancoVista frame;
    private Banco banco;

    public BancoControlador(BancoVista frame) {
        banco = new Banco();
        this.frame = frame;
    }

    public void crearCliente() {

        String nombre = frame.getTxtNombre().getText();
        String correo = frame.getTxtCorreo().getText();
        String saldo = frame.getTxtSaldo().getText();

        banco.crearCliente(nombre, correo, saldo);
        calcularSaldoPromedio();
        cantidadPersonas();
        listarPersonasBajoPromediio();
        listarPersonas();
    }

    public void calcularSaldoPromedio() {

        String saldoPromedio = String.valueOf(banco.promedioSaldo());

        frame.setTxtPromedio(saldoPromedio);
    }

    public void cantidadPersonas() {

        String personas = String.valueOf(banco.cantidadPerosnas());

        frame.setTxtCantidadClientes(personas);

    }

    public void listarPersonasBajoPromediio() {
        String menoresDelPromedio = String.valueOf(banco.listarPersonasBajoPromediio());
        frame.setTxtCantidadClientes1(menoresDelPromedio);
    }

    public void listarPersonas() {
        frame.setTaListaClientes(banco.listarPersonas());
    }

}
