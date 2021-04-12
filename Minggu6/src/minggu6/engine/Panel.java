/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6.engine;

import java.awt.event.KeyEvent;

/**
 *
 * @author Cloud
 */
public class Panel extends javax.swing.JPanel implements java.awt.event.KeyListener{
    minggu6.character.Kotak kotak = null;
    public Panel() {
        inisialisasi();
        kotak = new minggu6.character.Kotak();
    }
    final void inisialisasi(){
        setPreferredSize(new java.awt.Dimension(1000,500));
    }
    
    
    
    @Override
    public void paint(java.awt.Graphics g){
        kotak.tampil(g);
    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent evt) {}

    @Override
    public void keyPressed(java.awt.event.KeyEvent evt) {
        switch (evt.getKeyCode()){
            case 37: // Panah Kiri
                kotak.kekiri();
                break;
            case 38: // atas
                kotak.keatas();
                break;
            case 39: // kanan
                kotak.kekanan();
                break;
            case 40: // bawah
                kotak.kebawah();
                break;
        }
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent evt) {}
    
}
