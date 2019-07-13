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
    public static Paciente pacientes[];
    private int size;
    public Paciente() {

    }
    

    
    public static void cadastrarPaciente(Paciente p) {

    	Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos pacientes deseja cadastrar: ");
		int qtd = entrada.nextInt();
		
		pacientes = new Paciente[qtd];
		
		
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome do paciente: ");
			p.setNome(entrada.next());

			System.out.println("Digite a idade do paciente: ");
			p.setIdade(entrada.nextInt());

			System.out.println("Digite o CPF do paciente: ");
			p.setCpf(entrada.next());

		}
		
	}
	
	public boolean addPaciente(Paciente p) {
		if (size >= 0 && size < pacientes.length) {
			pacientes[size] = p;
			size++;
			return true;
		}
		return false;
	}
	
	  public void imprimi() {
	        for (int i = 0; i < size; i++) {
	            System.out.println("pacientes: " + pacientes[i].getNome());
	            
	        }
	    }
    
     
    
}
