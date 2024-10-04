/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.ejercicio10directorio.modelo;

/**
 *
 * @author borisperezg
 */
public class Directorio {

    ClienteDirectorio[] telefono = new ClienteDirectorio[10];

    public void agregarTelefono(int tel) {

        ClienteDirectorio t1 = new ClienteDirectorio(tel);

        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] == null) {
                telefono[i] = t1;
                break;
            }
        }
    }

    public String buscarTelefono(int posicion) {

        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] != null && i == posicion - 1) {
                return String.valueOf(telefono[i].getTelefono());
            }
        }
        return "";
    }

    public void eliminarTelefono(int tele) {

        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] != null && telefono[i].getTelefono() == tele) {
                telefono[i] = null;
                break;
            }
        }
    }

    public void eliminarTelefonoPorPosicion(int posi) {

        for (int i = 0; i < telefono.length; i++) {
            if (telefono[i] != null && i == posi - 1) {
                telefono[i] = null;
                break;
            }
        }
    }

}
