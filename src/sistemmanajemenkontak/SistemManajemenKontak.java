/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemmanajemenkontak;

import javax.swing.JFrame;

/**
 *
 * @author Advie Rifaldy
 */
public class SistemManajemenKontak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KontakForm frame = new KontakForm();
        frame.setVisible(true);
        frame.setTitle("Sistem Infromasi Kontak");

        frame.fetchKontak();
        frame.fetchKategori();
    }
    
}
