

import controller.CtrLogin;
import view.ViwSistema;
import javax.swing.SwingUtilities;

/**
 * @author a gente
 * 
 */
public class Index {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
                                    ViwSistema telaLogin = new ViwSistema();
                                    CtrLogin ctrLogin = new CtrLogin(telaLogin);
                                    
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
