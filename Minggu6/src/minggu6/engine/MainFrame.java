/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.engine;

import java.awt.event.ActionEvent;

/**
 *
 * @author Cloud
 */
public class MainFrame extends javax.swing.JFrame implements java.awt.event.ActionListener {
    
    minggu6.engine.Panel panel = null;
    
    public MainFrame() {
        inisialisasi();
    }
    
    final void inisialisasi() {
        setTitle("Interaktif Grafik");
        setSize(1000,500);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panel = new minggu6.engine.Panel();
        getContentPane().add(panel);
        addKeyListener(panel); // kita menerima masukan dari keyboard diteruskan ke panel
        javax.swing.Timer timer = new javax.swing.Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        repaint();
    }
}
