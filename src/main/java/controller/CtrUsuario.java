/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ObjectDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import model.MdlAbrigo;
import model.MdlFrete;
import model.MdlLocalidade;
import model.MdlUsuario;
import repository.ManutencaoUsuario;
import view.ViwSistema;

/**
 *
 * @author a gente
 */
public class CtrUsuario extends CtrGeneric implements ManutencaoUsuario {
    
    private ViwSistema viwSistema;
    private ObjectDao<MdlUsuario> DaoUsuario;

    public CtrUsuario(ViwSistema viwSistema){
        this.viwSistema = viwSistema;
        this.setListeners();
    }
    
    @Override
    protected void setListeners() {
        
        this.viwSistema.addListenerBtnGravarUsuario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, String> hashFields = viwSistema.getFieldsByPanel("panCadastroUsuario");
                
                MdlUsuario usuario = new MdlUsuario(
                        hashFields.get("txtNomeUsuario"),
                        hashFields.get("txtTelefoneUsuario"),
                        hashFields.get("txtEmailUsuario"),
                        hashFields.get("txtSenhaUsuario")
                );
                
                ObjectDao DaoUsuario = new ObjectDao<MdlUsuario>(MdlUsuario.class);
                
                try{
                    DaoUsuario.insert(usuario);
                }
                catch(Exception exception){
                    exception.printStackTrace();
                }
            }
        });
        
    }

    @Override
    public void addAbrigo(MdlAbrigo abrigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerAbrigo(MdlAbrigo abrigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addLocalidade(MdlLocalidade localidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerLocalidade(MdlLocalidade localidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addFrete(MdlFrete frete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerFrete(String placaFrete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
