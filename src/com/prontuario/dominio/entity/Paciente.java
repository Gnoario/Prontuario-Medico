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
public class Paciente extends Pessoa {

    public Paciente() {

    }
    
    public static void cadastrarPaciente(Paciente p) {

		do {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Digite o nome do paciente: ");
			p.setNome(entrada.next());

			System.out.println("Digite a idade do paciente: ");
			p.setIdade(entrada.nextInt());

			System.out.println("Digite o CPF do paciente: ");
			p.setCpf(entrada.next());

		} while (p.getNome() == null && p.getIdade() == 0 && p.getCpf() == null);
	}
    
    
}
