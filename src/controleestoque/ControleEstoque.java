package controleestoque;

import Interfaces.Inicio;
import javax.swing.JFrame;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ControleEstoque {

    public static void main(String[] args) {
        String userhome = System.getProperty("user.home");
        PropertyConfigurator.configure(userhome + "\\Desktop\\ProjetoIntegrador\\log4j.properties");
        Logger logger = Logger.getLogger("file");
	logger.info("Iniciando a aplicação");
        Inicio ini = new Inicio();
        ini.setLocationRelativeTo(null);
        ini.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ini.setVisible(true);
    }
    
}
