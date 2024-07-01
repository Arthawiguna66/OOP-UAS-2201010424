package pakanternak;
import java.sql.SQLException;

/**
 *
 * @author I Kadek Artha Wiguna/2201010424
 * tgl:22-06-2022
 */
public class PakanTernak {
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Jform jf = new Jform();
        jf.setResizable(false);
        jf.setAlwaysOnTop(true);
        jf.setVisible(true);
    } 
}
