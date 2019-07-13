/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prontuario;

import com.prontuario.dominio.entity.Consulta;
import com.prontuario.dominio.entity.Doenca;
import com.prontuario.dominio.entity.Medicamento;
import com.prontuario.dominio.entity.Medico;
import com.prontuario.dominio.entity.Paciente;
import com.prontuario.dominio.entity.Sintoma;
import com.prontuario.dominio.gerenciador.GerenciadorConsulta;
import com.prontuario.dominio.gerenciador.GerenciadorDeDoencas;
import com.prontuario.dominio.gerenciador.GerenciadorDiagnostico;
import com.prontuario.dominio.gerenciador.GerenciadorPaciente;
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

        char opcao;
        Paciente p = null;
        Medicamento m;
        Doenca d;
        Sintoma s;
        Medico medico = new Medico();

        d = new Doenca(100, 100);
        s = new Sintoma();
        m = new Medicamento();

        //Doencas
        Doenca doenca = new Doenca(100, 100);
        Doenca doenca1 = new Doenca(100, 100);
        Doenca doenca2 = new Doenca(100, 100);
        Doenca doenca3 = new Doenca(100, 100);
        Doenca doenca4 = new Doenca(100, 100);
        Doenca doenca5 = new Doenca(100, 100);
        Doenca doenca6 = new Doenca(100, 100);
        Doenca doenca7 = new Doenca(100, 100);
        Doenca doenca8 = new Doenca(100, 100);

        //Sintomas
        Sintoma sintoma1 = new Sintoma();
        Sintoma sintoma2 = new Sintoma();
        Sintoma sintoma3 = new Sintoma();
        Sintoma sintoma4 = new Sintoma();
        sintoma1.setNome("Dores");
        sintoma2.setNome("Febre");
        sintoma3.setNome("Tosse");
        sintoma4.setNome("Diarréia");

        //Medicamentos
        Medicamento medicamento1 = new Medicamento();
        Medicamento medicamento2 = new Medicamento();
        Medicamento medicamento3 = new Medicamento();
        Medicamento medicamento4 = new Medicamento();
        medicamento1.setNome("Clonazepan");
        medicamento2.setNome("Bunazepan");
        medicamento3.setNome("Shikamaruzepan");
        medicamento4.setNome("Narutozepan");

        //Gerenciadores
        GerenciadorDeDoencas gerenciadorD = new GerenciadorDeDoencas(1000);
        GerenciadorPaciente gerenciadorP = new GerenciadorPaciente(1000);
        GerenciadorConsulta gerenciadorC = new GerenciadorConsulta(1000);
        GerenciadorDiagnostico gerenciadorPrincipal = new GerenciadorDiagnostico();
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

        //Doencas iniciais
        doenca.setNome("Diabetes");
        doenca1.setNome("Alzheimer");
        doenca2.setNome("Depressão");
        doenca3.setNome("AVC (Acidente Vascular Cerebral");
        doenca4.setNome("Mal de Parkinson");
        doenca5.setNome("Asma");
        doenca6.setNome("DPOC (Doença pulmonar obstrutiva crônica)");
        doenca7.setNome("Hipertensão");
        doenca8.setNome("AIDS");

        //Sintomas e medicamentos de doenças iniciais
        doenca.addMedicamento(medicamento1);
        doenca.addSintoma(sintoma1);
        doenca1.addMedicamento(medicamento2);
        doenca1.addSintoma(sintoma2);
        doenca2.addMedicamento(medicamento1);
        doenca2.addSintoma(sintoma3);
        doenca3.addMedicamento(medicamento2);
        doenca3.addSintoma(sintoma2);
        doenca4.addMedicamento(medicamento3);
        doenca4.addSintoma(sintoma3);
        doenca5.addMedicamento(medicamento2);
        doenca5.addSintoma(sintoma2);
        doenca6.addMedicamento(medicamento3);
        doenca6.addSintoma(sintoma2);
        doenca7.addMedicamento(medicamento4);
        doenca7.addSintoma(sintoma4);
        doenca8.addMedicamento(medicamento4);
        doenca8.addSintoma(sintoma1);

        //Adicionando as doenças no gerenciador de doenças
        gerenciadorD.addDoenca(doenca);
        gerenciadorD.addDoenca(doenca1);
        gerenciadorD.addDoenca(doenca2);
        gerenciadorD.addDoenca(doenca3);
        gerenciadorD.addDoenca(doenca4);
        gerenciadorD.addDoenca(doenca5);
        gerenciadorD.addDoenca(doenca6);
        gerenciadorD.addDoenca(doenca7);
        gerenciadorD.addDoenca(doenca8);

        //Médico realizador de consultas
        medico.setNome("Claúdir da Silva Rosa");
        medico.setCpf("122.334.156-23");
        medico.setIdade(42);
        //gerenciadorD.diagnostico("dores".toUpperCase());
        gerenciadorPrincipal.gerenciarDiagnostico(gerenciadorD, "febre".toUpperCase());
        //Interface texto de interação com o usuário
        do {
            opcao = menu();

            switch (opcao) {

                case 'a':
                case 'A':
                    Scanner entrada = new Scanner(System.in);
                    System.out.println("Digite quantos pacientes deseja cadastrar: ");
                    int qtd = entrada.nextInt();
                    for (int i = 0; i < qtd; i++) {
                        p = new Paciente();
                        System.out.println("Digite o nome do paciente: ");
                        p.setNome(entrada.next());

                        System.out.println("Digite a idade do paciente: ");
                        p.setIdade(entrada.nextInt());

                        System.out.println("Digite o CPF do paciente: ");
                        p.setCpf(entrada.next());
                        gerenciadorP.addPaciente(p);
                    }
                    break;

                case 'b':
                case 'B':
                    int aux;
                    Scanner consult = new Scanner(System.in);
                    Consulta consulta = new Consulta();
                    System.out.println("Digite o dia da consulta e a hora Dia/Mes/Ano/Horário: ");
                    consulta.setHoraDiaConsulta(consult.nextLine());
                    consulta.setMedico(medico);
                    System.out.println("Digite o número do paciente para marcar a consulta: ");
                    gerenciadorP.imprimi();
                    aux = consult.nextInt();
                    gerenciadorC.addConsulta(consulta, gerenciadorP.getPacientes(), aux);
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

                    gerenciadorP.imprimi();
                    break;

                case 'g':
                case 'G':
                    gerenciadorC.imprimi();
                    break;

                case 'h':
                case 'H':
                    if (gerenciadorP.getSize() <= 0 || gerenciadorC.getSize() <= 0) {
                        System.out.println("Por favor cadastre pacientes e consultas para realizar uma consulta.");
                    } else {
                        Scanner realizarConsulta = new Scanner(System.in);
                        String sintoma;
                        System.out.println("Digite o número da consulta que deseja realizar: ");
                        gerenciadorC.imprimi();
                        aux = realizarConsulta.nextInt();
                        gerenciadorC.get(aux);
                        System.out.println("Digite o sintoma que deseja pesquisar: ");
                        sintoma = realizarConsulta.nextLine();
                        gerenciadorPrincipal.gerenciarDiagnostico(gerenciadorD, sintoma.toUpperCase());
                    }
                    break;

                case 'i':
                case 'I':
                    gerenciadorD.imprimi();
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
                + "\n F. Listar Paciente"
                + "\n G. Listar Consultas"
                + "\n H. Realizar Consulta"
                + "\n I. Listar Doenças"
                + "\n S. Sair do programa");

        opcao = entrada.next().charAt(0);
        return opcao;
    }
}
