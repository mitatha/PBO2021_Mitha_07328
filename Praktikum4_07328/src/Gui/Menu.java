package Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Menu extends ComponentGui
{
    public Menu() {
        initComponent();
    }
    
    void initComponent()
    {
        setTitle("Data Murid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        setVisible(true);
        
        btninsert.setBounds(80, 50, 140, 25);
        btninsert.setBorder(null);
        btninsert.setBackground(Color.black);
        btninsert.setForeground(Color.white);
        btninsert.setFocusPainted(false);
        add(btninsert);
        
        btnupdate.setBounds(80, 100, 140, 25);
        btnupdate.setBorder(null);
        btnupdate.setBackground(Color.black);
        btnupdate.setForeground(Color.white);
        btnupdate.setFocusPainted(false);
        add(btnupdate);
        
        btnview.setBounds(80, 150, 140, 25);
        btnview.setBorder(null);
        btnview.setBackground(Color.black);
        btnview.setForeground(Color.white);
        btnview.setFocusPainted(false);
        add(btnview);
        
        btninsert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                TambahDataGui tambahDataGui = new TambahDataGui();
                tambahDataGui.setVisible(true);
                dispose();
            }
        });
        
        btnupdate.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String cek = JOptionPane.showInputDialog("Massukkan Nama");
                    if(cek.length() > 0){
                        UpdateDataGui updateDataGui = new UpdateDataGui(cek);
                        updateDataGui.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex) {        
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
                
            }
        });
        
        btnview.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                ViewDataGui viewDataGui = new ViewDataGui();
                viewDataGui.setVisible(true);
                dispose();
            }
        });
    }
}


