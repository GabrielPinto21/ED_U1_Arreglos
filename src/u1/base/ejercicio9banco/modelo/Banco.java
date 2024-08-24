/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1.base.ejercicio9banco.modelo;

/**
 *
 * @author borisperezg
 */
public class Banco {

    Cliente[] clientes = new Cliente[20];

    public void crearCliente(String nombre, String correo, String sald) {

        int saldo = Integer.parseInt(sald);

        Cliente c1 = new Cliente(nombre, correo, saldo);
        for (int i = 0; i < clientes.length - 1; i++) {
            if (clientes[i] == null) {
                clientes[i] = c1;
                break;
            }
        }
    }

    public double promedioSaldo() {

        double sumatoria = 0;
        int clienteSumado = 0;

        for (int i = 0; i < clientes.length - 1; i++) {
            if (clientes[i] != null) {
                clienteSumado++;
                sumatoria += clientes[i].getSaldo();
            }
        }
        return (sumatoria / clienteSumado);
    }

    public int cantidadPerosnas() {

        int clienteSumado = 0;
        for (int i = 0; i < clientes.length - 1; i++) {
            if (clientes[i] != null) {
                clienteSumado++;
            }
        }
        return clienteSumado;
    }

    public int listarPersonasBajoPromediio() {

        int personasMenosPromedio = 0;
        double promedio = promedioSaldo();

        for (int i = 0; i < clientes.length - 1; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getSaldo() < promedio) {
                    personasMenosPromedio++;
                }
            }
        }
        return personasMenosPromedio;
    }

    public String listarPersonas() {

        String string = "";

        for (int i = 0; i < clientes.length - 1; i++) {
            if (clientes[i] != null) {
                string += clientes[i].getNombre() + " - " + clientes[i].getCorreo() + "\n";
            }
        }
        return string;
    }

}
