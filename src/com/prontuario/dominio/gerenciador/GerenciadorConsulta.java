/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.gerenciador;

import com.prontuario.dominio.entity.Consulta;

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
    
    public boolean addConsulta(Consulta consulta) {
        if (!isFullConsultas()) {
            consultas[size] = consulta;
            size++;
            return true;
        }
        return false;
    }
    
    public void imprimi() {
        for (int i = 0; i < size; i++) {
            System.out.println("Nome do Paciente: " + consultas[i].getPaciente().getNome());
            System.out.println("Idade: " + consultas[i].getPaciente().getIdade());
            System.out.println("CPF: " + consultas[i].getPaciente().getCpf());
            System.out.println("Médico responsável: " + consultas[i].getMedico().getNome());
            System.out.println("Horário da Consulta: " + consultas[i].getHoraDiaConsulta());
        }
    }

    public boolean isFullConsultas() {
        if (size != consultas.length) {
            return false;
        }
        return true;
    }
}
