/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.entity;

import java.util.Date;

/**
 *
 * @author tadeu
 */
public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private Date horaDiaConsulta;
    private boolean ativa;
    
    public Consulta(){
        
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getHoraDiaConsulta() {
        return horaDiaConsulta;
    }

    public void setHoraDiaConsulta(Date horaDiaConsulta) {
        this.horaDiaConsulta = horaDiaConsulta;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    
}
