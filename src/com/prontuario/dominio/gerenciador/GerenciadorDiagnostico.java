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
public class GerenciadorDiagnostico {

    public GerenciadorDiagnostico() {

    }

    public void gerenciarDiagnostico(GerenciadorDeDoencas gerenciadorPrincipal,String sintoma) {
        gerenciadorPrincipal.diagnostico(sintoma);
    }
    

}
