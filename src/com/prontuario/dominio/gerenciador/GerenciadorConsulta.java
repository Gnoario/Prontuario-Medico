/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.gerenciador;

import com.prontuario.dominio.entity.Consulta;
import com.prontuario.dominio.entity.Paciente;

/**
 *
 * @author tadeu
 */
public class GerenciadorConsulta {

    GerenciadorDiagnostico diagnostico = new GerenciadorDiagnostico();
    Consulta consultas[];
    int size;

    public GerenciadorConsulta(int max) {
        consultas = new Consulta[max];
        size = 0;
    }

    public boolean addConsulta(Consulta consulta, Paciente pacientes[], int i) {
        if (!isFullConsultas()) {
            consultas[size] = consulta;
            consultas[size].setPaciente(pacientes[i - 1]);
            size++;
            return true;
        }
        return false;
    }

    public void imprimi() {
        for (int i = 0; i < size; i++) {
            System.out.println("__________________________________________________________________");
            System.out.println("Paciente de número: " + i + 1);
            System.out.println("Nome do Paciente: " + consultas[i].getPaciente().getNome());
            System.out.println("Idade: " + consultas[i].getPaciente().getIdade());
            System.out.println("CPF: " + consultas[i].getPaciente().getCpf());
            System.out.println("Médico responsável: " + consultas[i].getMedico().getNome());
            System.out.println("Horário da Consulta: " + consultas[i].getHoraDiaConsulta());
            System.out.println("__________________________________________________________________");
        }
    }

    public boolean isFullConsultas() {
        if (size != consultas.length) {
            return false;
        }
        return true;
    }

    public void get(int indice) {
        if (indice >= 0 && indice < size) {
            System.out.println("_______________________________________________________________________________");
            System.out.println("Você selecionou para consultar o paciente de número: " + indice + 1);
            System.out.println("Nome do Paciente: " + consultas[indice - 1].getPaciente().getNome());
            System.out.println("Idade: " + consultas[indice - 1].getPaciente().getIdade());
            System.out.println("CPF: " + consultas[indice - 1].getPaciente().getCpf());
            System.out.println("Médico responsável: " + consultas[indice - 1].getMedico().getNome());
            System.out.println("Horário da Consulta: " + consultas[indice - 1].getHoraDiaConsulta());
            System.out.println("_______________________________________________________________________________");
        }
    }

    public int getSize() {
        return size;
    }


    
}
