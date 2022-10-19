/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a gente
 */
public class MdlLocalidade {
    
    protected String nomeLocalidade;
    protected String ruaLocalidade;
    protected String cepLocalidade;
    protected int numeroLocalidade;
    protected String complementoLocalidade;
    protected boolean areaRisco;

    public MdlLocalidade(String nomeLocalidade, String ruaLocalidade, String cepLocalidade, int numeroLocalidade, String complementoLocalidade, boolean areaRisco) {
        this.nomeLocalidade = nomeLocalidade;
        this.ruaLocalidade = ruaLocalidade;
        this.cepLocalidade = cepLocalidade;
        this.numeroLocalidade = numeroLocalidade;
        this.complementoLocalidade = complementoLocalidade;
        this.areaRisco = areaRisco;
    }

    //Adiciona localidade
    public void addLocalidade(MdlLocalidade localidades){
        localidades.addLocalidade(localidades);
    }
    
    //Remover localidades
    public void removerLocalidade(MdlLocalidade localidades){
        localidades.removerLocalidade(localidades);
    }
    
    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public void setNomeLocalidade(String nomeLocalidade) {
        if(this.nomeLocalidade != nomeLocalidade){
            this.nomeLocalidade = nomeLocalidade;
        } else if(this.nomeLocalidade == nomeLocalidade) {
            System.out.println("Insira um nome de localidade diferente do anterior");
        }
    }

    public String getRuaLocalidade() {
        return ruaLocalidade;
    }

    public void setRuaLocalidade(String ruaLocalidade) {
        if(this.ruaLocalidade != ruaLocalidade){
            this.ruaLocalidade = ruaLocalidade;
        } else if(this.ruaLocalidade == ruaLocalidade) {
            System.out.println("Insira uma rua diferente da anterior");
        }
    }

    public String getCepLocalidade() {
        return cepLocalidade;
    }

    public void setCepLocalidade(String cepLocalidade) {
        if(this.cepLocalidade != cepLocalidade){
            this.cepLocalidade = cepLocalidade;
        } else if(this.cepLocalidade == cepLocalidade) {
            System.out.println("Insira um CEP diferente da anterior");
        }
    }

    public int getNumeroLocalidade() {
        return numeroLocalidade;
    }

    public void setNumeroLocalidade(int numeroLocalidade) {
        if(this.numeroLocalidade != numeroLocalidade){
            this.numeroLocalidade = numeroLocalidade;
        } else if(this.numeroLocalidade == numeroLocalidade) {
            System.out.println("Insira um número diferente da anterior");
        }
    }

    public String getComplementoLocalidade() {
        return complementoLocalidade;
    }

    public void setComplementoLocalidade(String complementoLocalidade) {
        if(this.complementoLocalidade != complementoLocalidade){
            this.complementoLocalidade = complementoLocalidade;
        } else if(this.complementoLocalidade == complementoLocalidade) {
            System.out.println("Insira um complemento diferente da anterior");
        }
    }

    public boolean isAreaRisco() {
        return areaRisco;
    }

    public void setAreaRisco(boolean areaRisco) {
        this.areaRisco = areaRisco;
    }

    @Override
    public String toString() {
        return "MdlLocalidade{" + "nomeLocalidade=" + nomeLocalidade + ", ruaLocalidade=" + ruaLocalidade + ", cepLocalidade=" + cepLocalidade + ", numeroLocalidade=" + numeroLocalidade + ", complementoLocalidade=" + complementoLocalidade + ", areaRisco=" + areaRisco + '}';
    }
}
