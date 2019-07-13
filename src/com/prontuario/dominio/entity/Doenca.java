/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.entity;

import java.util.Scanner;

/**
 *
 * @author tadeu
 */
public class Doenca {

    private String nome;
    private int sizeMed;
    private int sizeSint;
    private Sintoma sintomas[];
    private Medicamento medicamentos[];

    public Doenca(int maxMedicamentos, int maxSintomas) {
        sintomas = new Sintoma[maxSintomas];
        medicamentos = new Medicamento[maxMedicamentos];
        sizeMed = 0;
        sizeSint = 0;
    }

    public boolean addSintoma(Sintoma sintoma) {
        if (!isFullSintomas()) {
            sintomas[sizeSint] = sintoma;
            sizeSint++;
            return true;
        }
        return false;
    }

    public boolean localizarDoencas(String sintoma) {
        for (int i = 0; i < sizeSint; i++) {
            if (sintomas[i].getNome().toUpperCase().contains(sintoma)) {
                return true;
            }
        }
        return false;
    }

    public boolean addMedicamento(Medicamento medicamento) {
        if (!isFullMedicamentos()) {
            medicamentos[sizeMed] = medicamento;
            sizeMed++;
            return true;
        }
        return false;
    }

    public boolean isFullMedicamentos() {
        if (sizeMed != sintomas.length) {
            return false;
        }
        return true;
    }

    public boolean isFullSintomas() {
        if (sizeSint != medicamentos.length) {
            return false;
        }
        return true;
    }

    public void cadastrarSintoma(Sintoma s) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de sintomas que deseja cadastrar: ");
        int qtd = entrada.nextInt();

        for (int i = 10; i < qtd + 10; i++) {
            System.out.println("Digite o nome do sintoma: ");
            s.setNome(entrada.next());
        }

    }

    public void cadastrarMedicamento(Medicamento m) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número de medicamentos que deseja cadastrar para esta doenca: ");
        int tam = entrada.nextInt();

        for (int i = 10; i < tam + 9; i++) {
            System.out.println("Digite o nome do medicamento: ");
            m.setNome(entrada.next());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sintoma[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(Sintoma[] sintomas) {
        this.sintomas = sintomas;
    }

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento[] medicamentos) {
        this.medicamentos = medicamentos;
    }

    public void imprimiMedicamentos() {
        for (int i = 0; i < sizeMed; i++) {
            System.out.println("Medicamentos: " + medicamentos[i].getNome());
        }
    }

    public void imprimiSintomas() {
        for (int i = 0; i < sizeMed; i++) {
            System.out.println("Sintomas: " + sintomas[i].getNome());
        }
    }

}
