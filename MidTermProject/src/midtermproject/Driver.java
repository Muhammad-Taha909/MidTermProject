/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Driver{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager.getInstance().readAccessories();
        Admin.getInstance().readData();
        Login form = new Login();
        form.setVisible(true);
    }
}
