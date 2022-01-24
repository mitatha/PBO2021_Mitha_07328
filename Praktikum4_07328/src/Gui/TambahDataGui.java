package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class TambahDataGui extends ComponentGui
{
    public TambahDataGui() {
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelnama.setBounds(35, 95, 40, 25);
        add(labelnama);
        fieldnama.setBounds(130, 95, 130, 25);
        add(fieldnama);
        
        labelumur.setBounds(35, 140, 80, 25);
        add(labelumur);
        fieldumur.setBounds(130, 140, 130, 25);
        add(fieldumur);
        
        labelnotelp.setBounds(35, 185, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 185, 130, 25);
        add(fieldnotelp);
        
        btninsert.setBounds(80, 350, 140, 25);
        btninsert.setBorder(null);
        btninsert.setBackground(Color.black);
        btninsert.setForeground(Color.white);
        btninsert.setFocusPainted(false);
        add(btninsert);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        btninsert.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btninsert.setForeground(Color.black);
                btninsert.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btninsert.setForeground(Color.white);
                btninsert.setBackground(Color.black);
            }
        });
        
        btninsert.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama = fieldnama.getText();
                String umur = fieldumur.getText();
                String notelp = fieldnotelp.getText();
                if(nama.length() != 0 && umur.length() != 0 && notelp.length() != 0){
                    AllObjectController.murid.insert_07328(nama, umur, notelp);
                    JOptionPane.showMessageDialog(null, "Data Berhasil ditambah");
                    dispose();
                    new Menu().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
        
        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.yellow);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.black);
            }
        });
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }
        });
    }
}
