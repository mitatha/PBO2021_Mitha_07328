package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ViewDataGui extends ComponentGui
{
    JTable tabelmahasiswa = new JTable();
    JScrollPane spmahasiswa = new JScrollPane(tabelmahasiswa);
    JTextField textpilih = new JTextField();
    String kode;
    
    public ViewDataGui() {
        initComponent();
    }
    
    void initComponent(){
        setTitle("View Data Kursus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setVisible(true);
        
        spmahasiswa.setBounds(20, 50, 500, 350);
        tabelmahasiswa.setModel(AllObjectController.murid.daftarMahasiswa());
        add(spmahasiswa);
        
        btnupdate.setBounds(540, 50, 110, 25);
        btnupdate.setFocusPainted(false);
        btnupdate.setBorder(null);
        btnupdate.setBackground(Color.black);
        btnupdate.setForeground(Color.white);
        add(btnupdate);
        
        btndelete.setBounds(540, 95, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        tabelmahasiswa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelmahasiswa.getSelectedRow();
                textpilih.setText(AllObjectController.murid.daftarMahasiswa().getValueAt(i, 0).toString());
            }
        });
        
        btnupdate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = textpilih.getText();
                dispose();
                new UpdateDataGui(kode).setVisible(true);
            }
        });
        
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = textpilih.getText();
                AllObjectController.murid.delete_07328(kode);
                tabelmahasiswa.setModel(AllObjectController.murid.daftarMahasiswa());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
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
