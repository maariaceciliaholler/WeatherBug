/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.ViwSistema;

/**
 *
 * @author a gente
 */
public class CtrLogin extends CtrGeneric{
    
    private ViwSistema viwSistema;

    public CtrLogin(ViwSistema viwSistema){
        this.viwSistema = viwSistema;
        this.setListeners();
    }
    
    @Override
    protected void setListeners() {
        this.viwSistema.addListenerBtnEntrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, String> hashFields = viwSistema.getFieldsByPanel("panLogin");
                
                // VALIDAR USUARIO
                
                for(Map.Entry<String, String> map : hashFields.entrySet()){
                    System.out.println(map.getKey() + " = "
                                   + map.getValue());
                }
                
                CtrHome ctrHome = new CtrHome(viwSistema);
                viwSistema.setCurrentPanel("panHome");
                /*
                if (searchTerm != null && !"".equals(searchTerm)) {
                    JOptionPane.showMessageDialog(null,
                                    searchTerm, "Alous",
                                    JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                                    "Search term is empty", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                }
                */
            }
        });
        
        this.viwSistema.addListenerLinkCadastro(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                CtrUsuario ctrUsuario = new CtrUsuario(viwSistema);
                viwSistema.setCurrentPanel("panCadastroUsuario");
                /*
                if (searchTerm != null && !"".equals(searchTerm)) {
                    JOptionPane.showMessageDialog(null,
                                    searchTerm, "Alous",
                                    JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                                    "Search term is empty", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                }
                */
            }
        });
    }
}
