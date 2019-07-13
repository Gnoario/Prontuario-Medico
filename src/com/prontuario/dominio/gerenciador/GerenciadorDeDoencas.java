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

    GerenciadorDeDoencas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addDoenca(Doenca doenca) {
        if (!isFullMedicamentos()) {
            doencas[size] = doenca;
            size++;
            return true;
        }
        return false;
    }

    public boolean isFullMedicamentos() {
        if (size != doencas.length) {
            return false;
        }
        return true;
    }

    public void imprimi() {
        for (int i = 0; i < size; i++) {
            System.out.println("Doença: " + doencas[i].getNome());
            doencas[i].imprimiSintomas();
            doencas[i].imprimiMedicamentos();
        }
    }

    public void diagnostico(String sintoma) {
        for (int i = 0; i < size; i++) {
            if (doencas[i].localizarDoencas(sintoma)) {
                System.out.println(doencas[i].getNome());
            }

        }
    }
    
    public static void cadastrarDoenca(Doenca d) {

		do {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite o nome da doenca: ");
			d.setNome(entrada.next());

		} while (d.getNome()== null);

	}

}
