package Gui;

import Entity.MuridEntity_07328;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class UpdateDataGui extends  ComponentGui
{
    String nama,umur,noTelp;
    public UpdateDataGui(String cek){
        initComponent(cek);
    }
    
    void initComponent(String cek){
        for(MuridEntity_07328 murid : AllObjectController.murid.getDataMurid_07328(cek)) {
            this.nama   = murid.getNama_07328();
            this.umur   = murid.getUmur_07328();
            this.noTelp = murid.getNoTelp_07328();
        }
        
        setTitle("PROGRAM VERIF MAHASISWA");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        labelnama.setBounds(25, 50, 40, 25);
        add(labelnama);
        fieldnama.setBounds(120, 50, 100, 25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);
        
        labelumur.setBounds(25, 90, 40, 25);
        add(labelumur);
        fieldumur.setBounds(120, 90, 100, 25);
        fieldumur.setText(umur);
        fieldumur.setEditable(false);
        add(fieldumur);
        
        labelnotelp.setBounds(25, 135, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(120, 135, 100, 25);
        fieldnotelp.setText(noTelp);
        fieldnotelp.setEditable(false);
        add(fieldnotelp);
        
        btnubahumur.setBounds(245, 90, 80, 25);
        btnubahnotelp.setBounds(245, 135, 80, 25);
        
        add(btnubahumur);
        add(btnubahnotelp);
        
        
        
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
                ViewDataGui viewDataGui = new ViewDataGui();
                viewDataGui.setVisible(true);
                dispose();
            }
        });
        
        btnubahumur.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputumur = JOptionPane.showInputDialog("Massukkan Umur Baru");
                    if(inputumur.length() > 0){
                        AllObjectController.murid.updateUmur_07328(inputumur, cek);
                        fieldumur.setText(inputumur);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnotelp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnotelp = JOptionPane.showInputDialog("Masukan Notelp Baru");
                    if(inputnotelp.length() > 0){
                        AllObjectController.murid.updatenoTelp_07328( inputnotelp, cek);
                        fieldnotelp.setText(inputnotelp);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
}
