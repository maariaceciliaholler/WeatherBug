/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author a gente
 *
 */
@Entity
@Table(name = "tbusuario", schema = "shsistema")
public class MdlUsuario implements Comparable {

    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dsnome", columnDefinition = "varchar")
    protected String nomeUsuario;
    
    @Column(name = "dstelefone", columnDefinition = "varchar")
    protected String telefoneUsuario;
    
    @Column(name = "dssenha", columnDefinition = "varchar")
    protected String senhaUsuario;
    
    @Column(name = "dsemail", columnDefinition = "varchar")
    protected String emailUsuario;
    
    @Transient
    protected List<MdlAbrigo> abrigos; 
    
    @Transient
    protected List<MdlLocalidade> localidades; 
    
    @Transient
    protected List<MdlFrete> fretes;

    public MdlUsuario(){
        
    };
    
    public MdlUsuario(String nomeUsuario, String telefoneUsuario, String emailUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.senhaUsuario = senhaUsuario;
        this.emailUsuario = emailUsuario;
        this.localidades = new ArrayList<>();
    }

    public void addAbrigo(MdlAbrigo abrigo){
        abrigos.add(abrigo);
    }
    
    public void removerAbrigo(MdlAbrigo abrigo){
        for(MdlAbrigo abr : abrigos){
            if(abr == abrigo){
                abrigos.remove(abrigo);
            }
        }
    }

    public void addLocalidade(MdlLocalidade localidade){
        localidades.add(localidade);
    }

    public void removerLocalidade(MdlLocalidade localidade){
        localidades.remove(localidade);
    }
    
    public void addFrete(MdlFrete frete){
        fretes.add(frete);
    }
        
    public void removerFrete(String placaFrete) {
        for(MdlFrete f : fretes){
            if(f.getPlacaVeiculo().equals(placaFrete)){
                fretes.remove(f);
            }
        }
    }
    
    //Permite que o usuário modifique seu nome e valida se o novo nome inserido é igual ao anterior
    public void setNomeUsuario(String nomeUsuario) {
        if (!nomeUsuario.equals(this.nomeUsuario)) {
            this.nomeUsuario = nomeUsuario;
        } else if (nomeUsuario.equals(this.nomeUsuario)) {
            System.out.println("Insira um nome diferente do anterior");
        }
    }

    //Permite que o usuário modifique o telefone e valida se o telefone inserido é igual ao anterior
    public void setTelefoneUsuario(String telefoneUsuario) {
        if (!telefoneUsuario.equals(this.telefoneUsuario)) {
            this.telefoneUsuario = telefoneUsuario;
        } else if (telefoneUsuario.equals(this.telefoneUsuario)){
            System.out.println("Insira um telefone diferente do anterior");
        }
    }

    //Permite que o usuário modifique a senha e valida se a senha do usuário é igual a anterior
    public void setSenhaUsuario(String senhaUsuario) {
        if (!senhaUsuario.equals(this.senhaUsuario)) {
            this.senhaUsuario = senhaUsuario;
        } else if (senhaUsuario.equals(this.senhaUsuario)){
            System.out.println("Insira uma senha diferente da anterior");
        }
    }
    
    //Permite que o usuário altere o e-mail e valida se o e-mail do usuário é igual ao anterior
    public void setEmailUsuario(String emailUsuario) {
        if (!emailUsuario.equals(this.emailUsuario)) {
            this.emailUsuario = emailUsuario;
        }
        else if (emailUsuario.equals(this.emailUsuario)){
            System.out.println("Insira um e-mail diferente do anterior");
        }
    }

    @Override
    public int compareTo(Object o) {
       MdlAbrigo abrigo=(MdlAbrigo)o;
       
       for(MdlAbrigo abr : abrigos){
            if(abr == abrigo){
                abrigos.remove(abrigo);
                return 1;
            }
        }
       return 0;
    }
    
}
