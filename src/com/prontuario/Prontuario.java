/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario;

import com.prontuario.dominio.entity.Doenca;
import com.prontuario.dominio.entity.Medicamento;
import com.prontuario.dominio.entity.Paciente;
import com.prontuario.dominio.entity.Sintoma;
import com.prontuario.dominio.gerenciador.GerenciadorDeDoencas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tadeu
 */
public class Prontuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doenca doenca = new Doenca(2, 2);
        Doenca doenca1 = new Doenca(2, 2);
        Doenca doenca2 = new Doenca(2, 2);
        Doenca doenca3 = new Doenca(2, 2);
        Doenca doenca4 = new Doenca(2, 2);
        Doenca doenca5 = new Doenca(2, 2);
        Doenca doenca6 = new Doenca(2, 2);
        Doenca doenca7 = new Doenca(2, 2);
        Doenca doenca8 = new Doenca(2, 2);

//        Sintoma sintoma = new Sintoma();
//        Sintoma sintoma2 = new Sintoma();
//        Medicamento medicamento = new Medicamento();
//        Medicamento medicamento2 = new Medicamento();
        GerenciadorDeDoencas gerenciadorD = new GerenciadorDeDoencas(1);
//
//        sintoma.setNome("dor");
//        sintoma2.setNome("oi");
//        medicamento.setNome("batata");
//        medicamento2.setNome("dsad");
//        doenca.setNome("Aoba");
//        doenca.addMedicamento(medicamento);
//        doenca.addSintoma(sintoma);
//        doenca.addMedicamento(medicamento2);
//        doenca.addSintoma(sintoma2);
//        gerenciadorD.addDoenca(doenca);
//        gerenciadorD.diagnostico("");
        char opcao;
        Paciente p;
        Medicamento m;
        Doenca d;
        Sintoma s;

        
        
        d = new Doenca(2, 2);
        s = new Sintoma();
        p = new Paciente();
        m = new Medicamento();

        doenca1.setNome("Alzheimer");
        doenca2.setNome("Depressão");
        doenca3.setNome("AVC (Acidente Vascular Cerebral");
        doenca4.setNome("Mal de Parkinson");
        doenca5.setNome("Asma");
        doenca6.setNome("DPOC (Doença pulmonar obstrutiva crônica)");
        doenca7.setNome("Hipertensão");
        doenca8.setNome("AIDS");
        doenca.setNome("Diabetes");

        gerenciadorD.addDoenca(doenca);
        gerenciadorD.addDoenca(doenca1);
        gerenciadorD.addDoenca(doenca2);
        gerenciadorD.addDoenca(doenca3);
        gerenciadorD.addDoenca(doenca4);
        gerenciadorD.addDoenca(doenca5);
        gerenciadorD.addDoenca(doenca6);
        gerenciadorD.addDoenca(doenca7);
        gerenciadorD.addDoenca(doenca8);

        do {
            opcao = menu();

            switch (opcao) {

                case 'a':
                case 'A':
                    p.cadastrarPaciente(p);
                    p.addPaciente(p);

                    break;

                case 'b':
                case 'B':

                    
                    break;

                case 'c':
                case 'C':
                    doenca.cadastrarSintoma(s);
                    doenca.addSintoma(s);

                    break;

                case 'd':
                case 'D':

                    gerenciadorD.cadastrarDoenca(d);
                    gerenciadorD.addDoenca(d);
                    doenca.cadastrarSintoma(s);
                    doenca.addSintoma(s);
                    doenca.cadastrarMedicamento(m);
                    doenca.addMedicamento(m);

                    break;

                case 'e':
                case 'E':
                	doenca.cadastrarMedicamento(m);
                    doenca.addMedicamento(m);

                    break;

                case 'f':
                case 'F':
                	
                	p.imprimi();
                    break;

                default:
                    if (opcao == 's' || opcao == 'S') {
                        System.out.println("vc saiu");
                    }
            }

        } while (opcao != 's' && opcao != 'S');

    }

    public static char menu() {

        char opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n A. Cadastrar um novo paciente "
                + "\n B. Cadastrar consulta"
                + "\n C. Cadastrar Sintoma"
                + "\n D. Cadastrar Doença"
                + "\n E. Cadastrar Medicamento"
                +" \n F. Listar Paciente"
                + "\n S. Sair do programa");

        opcao = entrada.next().charAt(0);
        return opcao;
    }

}
