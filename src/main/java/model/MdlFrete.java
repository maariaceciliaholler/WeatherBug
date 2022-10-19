/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author a gente
 */
public class MdlFrete {
    
    protected String tipoVeiculo;
    protected String placaVeiculo;
    protected double valorFrete;

    public MdlFrete(String tipoVeiculo, String placaVeiculo, double valorFrete, List<MdlUsuario> usuarios, List<MdlFrete> fretes) {
        this.tipoVeiculo = tipoVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.valorFrete = valorFrete;
    }

    //Permite o usuário modificar o valor do frete e valida se é igual ao anterior
    public void setValor(double valorFrete) {
        if (this.valorFrete != valorFrete) {
            this.valorFrete = valorFrete;
        } else if (valorFrete == valorFrete) {
            System.out.println("Insira um valor de frete diferente do anterior");
        }
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public double getValorFrete() {
        return valorFrete;
    }
    
}
