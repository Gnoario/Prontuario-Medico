/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.gerenciador;

import com.prontuario.dominio.entity.Paciente;

/**
 *
 * @author tadeu
 */
public class GerenciadorPaciente {

    private Paciente pacientes[];
    private int size;

    public GerenciadorPaciente(int max) {
        pacientes = new Paciente[max];
        size = 0;
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public boolean addPaciente(Paciente p) {
        if (!isFullPacientes()) {
            pacientes[size] = p;
            size++;
            return true;
        }
        return false;
    }

    public boolean isFullPacientes() {
        if (size != pacientes.length) {
            return false;
        }
        return true;
    }

    public void imprimi() {
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println("_______________________________________________________");
            System.out.println("Número do paciente: " + i + 1);
            System.out.println("Nome do paciente: " + pacientes[i].getNome());
            System.out.println("CPF: " + pacientes[i].getCpf());
            System.out.println("Idade: " + pacientes[i].getIdade());
            System.out.println("_______________________________________________________");
        }
    }

    public int getSize() {
        return size;
    }
}
