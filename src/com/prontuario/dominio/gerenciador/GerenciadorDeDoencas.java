/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario.dominio.gerenciador;

import com.prontuario.dominio.entity.Doenca;
import java.util.Scanner;

/**
 *
 * @author tadeu
 */
public class GerenciadorDeDoencas {

    private Doenca doencas[];
    private int size;

    public GerenciadorDeDoencas(int max) {
        doencas = new Doenca[max];
        size = 0;
    }

    public GerenciadorDeDoencas() {

    }

    public boolean addDoenca(Doenca doenca) {
        if (!isFullDoencas()) {
            doencas[size] = doenca;
            size++;
            return true;
        }
        return false;
    }

    public boolean isFullDoencas() {
        if (size != doencas.length) {
            return false;
        }
        return true;
    }

    public void imprimi() {
        for (int i = 0; i < size; i++) {
            System.out.println("_____________________________________________________________________");
            System.out.println("Doença: " + doencas[i].getNome());
            doencas[i].imprimiSintomas();
            doencas[i].imprimiMedicamentos();
            System.out.println("_____________________________________________________________________");
        }
    }

    public void diagnostico(String sintoma) {
        System.out.println("\tPossíveis Doenças");
        for (int i = 0; i < size; i++) {
            if (doencas[i].localizarDoencas(sintoma)) {
                System.out.println("________________________________________");
                System.out.println(doencas[i].getNome());
                doencas[i].imprimiSintomas();
                doencas[i].imprimiMedicamentos();
                System.out.println("________________________________________");
            }

        }
    }

    public void cadastrarDoenca(Doenca d) {

        do {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o nome da doenca: ");
            d.setNome(entrada.nextLine());

        } while (d.getNome() == null);

    }

}
