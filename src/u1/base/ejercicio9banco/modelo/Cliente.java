/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.base.ejercicio9banco.modelo;

/**
 *
 * @author camil
 */
public class Cliente {

    private String nombre;
    private String correo;
    private int saldo;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, int saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
