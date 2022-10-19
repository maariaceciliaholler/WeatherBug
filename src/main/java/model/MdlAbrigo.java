/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a gente
 */
public class MdlAbrigo {
    
    protected String nomeAbrigo;
    protected String bairroAbrigo;
    protected String ruaAbrigo;
    protected String cepAbrigo;
    protected int numeroAbrigo;
    protected String complemento;
    protected boolean levarBichos;
    protected double metrosQuadrados; 
    //protected fotos;

    public MdlAbrigo(String nomeAbrigo, String bairroAbrigo, String ruaAbrigo, String cepAbrigo, int numeroAbrigo, String complemento, boolean levarBichos, double metrosQuadrados) {
        this.nomeAbrigo = nomeAbrigo;
        this.bairroAbrigo = bairroAbrigo;
        this.ruaAbrigo = ruaAbrigo;
        this.cepAbrigo = cepAbrigo;
        this.numeroAbrigo = numeroAbrigo;
        this.complemento = complemento;
        this.levarBichos = levarBichos;
        this.metrosQuadrados = metrosQuadrados;
    }
    
    public String getNomeAbrigo() {
        return nomeAbrigo;
    }

    public void setNomeAbrigo(String nomeAbrigo) {
        if(this.nomeAbrigo != nomeAbrigo){
            this.nomeAbrigo = nomeAbrigo;
        } else if(this.nomeAbrigo == nomeAbrigo) {
            System.out.println("Insira um nome de abrigo diferente do anterior");
        }
    }

    public String getBairroAbrigo() {
        return bairroAbrigo;
    }

    public void setBairroAbrigo(String bairroAbrigo) {
        if(this.bairroAbrigo != bairroAbrigo){
            this.bairroAbrigo = bairroAbrigo;
        } else if(this.bairroAbrigo == bairroAbrigo) {
            System.out.println("Insira um bairro diferente do anterior");
        }
    }

    public String getRuaAbrigo() {
        return ruaAbrigo;
    }

    public void setRuaAbrigo(String ruaAbrigo) {
        if(this.ruaAbrigo != ruaAbrigo){
            this.ruaAbrigo = ruaAbrigo;
        } else if(this.ruaAbrigo == ruaAbrigo) {
            System.out.println("Insira uma rua diferente do anterior");
        }
    }

    public String getCepAbrigo() {
        return cepAbrigo;
    }

    public void setCepAbrigo(String cepAbrigo) {
        if(this.cepAbrigo != cepAbrigo){
            this.cepAbrigo = cepAbrigo;
        } else if(this.cepAbrigo == cepAbrigo) {
            System.out.println("Insira um CEP diferente do anterior");
        }
    }

    public int getNumeroAbrigo() {
        return numeroAbrigo;
    }

    public void setNumeroAbrigo(int numeroAbrigo) {
        if(this.numeroAbrigo != numeroAbrigo){
            this.numeroAbrigo = numeroAbrigo;
        } else if(this.numeroAbrigo == numeroAbrigo) {
            System.out.println("Insira um número diferente do anterior");
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean isLevarBichos() {
        return levarBichos;
    }

    public void setLevarBichos(boolean levarBichos) {
        this.levarBichos = levarBichos;
    }

    public double getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(double metrosQuadrados) {
        if(this.metrosQuadrados != metrosQuadrados){
            this.metrosQuadrados = metrosQuadrados;
        } else if(this.metrosQuadrados == metrosQuadrados) {
            System.out.println("Insira uma metragem diferente do anterior");
        }
    }

    public String toString() {
        return "ModelAbrigo{" + "nomeAbrigo=" + nomeAbrigo + ", bairroAbrigo=" + bairroAbrigo + ", ruaAbrigo=" + ruaAbrigo + ", cepAbrigo=" + cepAbrigo + ", numeroAbrigo=" + numeroAbrigo + ", complemento=" + complemento + ", levarBichos=" + levarBichos + ", metrosQuadrados=" + metrosQuadrados + '}';
    }

    
}
