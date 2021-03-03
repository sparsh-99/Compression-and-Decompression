/*
 * Main.java
 *
 * Created on May 7, 2009, 10:30 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package wingph;

/**
 *
 * @author admin
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
          
    }
          /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gph().setVisible(true);
    }
            
          });
        // TODO code application logic here
    }
    
}

    
