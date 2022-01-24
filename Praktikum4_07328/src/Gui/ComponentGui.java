package Gui;
import javax.swing.*;

public class ComponentGui extends JFrame
{
    protected JButton btninsert = new JButton("TAMBAH DATA");
    protected JButton btnupdate = new JButton("UPDATE DATE");
    protected JButton btndelete = new JButton("DELETE DATA");
    protected JButton btnview = new JButton("VIEW DATA");
    protected JButton btnsimpan = new JButton("SIMPAN");
    protected JButton btnubahumur = new JButton("UBAH");
    protected JButton btnubahnotelp = new JButton("UBAH");
    protected JButton btnback = new JButton("<< BACK");
    
    protected JLabel labeldatamurid = new JLabel("DATA MURID");
    protected JLabel labeltambahdata = new JLabel("TAMBAH DATA");
    protected JLabel labelupdatedata = new JLabel("UPDATE DATA");
    protected JLabel labelview = new JLabel("VIEW");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelumur = new JLabel("UMUR");
    protected JLabel labelnotelp = new JLabel("NO TELP");
    
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldumur = new JTextField();
    protected JTextField fieldnotelp = new JTextField();
   
     void kosong()
     {
        fieldnama.setText(null);
        fieldumur.setText(null);
        fieldnotelp.setText(null);
    }
}
