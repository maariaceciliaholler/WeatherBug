package controller;

import view.ViwSistema;

/**
 * @author a gente
 *
 */
public class CtrHome extends CtrGeneric{
	
    private ViwSistema viwSistema;

    public CtrHome(ViwSistema viwSistema){
        this.viwSistema = viwSistema;
        this.setListeners();
    }
    
    @Override
    protected void setListeners() {
        
    }
	
}
