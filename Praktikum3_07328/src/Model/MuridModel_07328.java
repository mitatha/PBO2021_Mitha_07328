package Model;

import Entity.MuridEntity_07328;


import Helper.KoneksiDb_07328;
import java.sql.*;
import java.util.ArrayList;

public class MuridModel_07328 
{
    private String sql_mitha;
    public Connection conn = KoneksiDb_07328.getconection();
    public ArrayList<MuridEntity_07328> getMurid_07328(){
        ArrayList<MuridEntity_07328> arrayListMurid = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql_mitha = "SELECT * FROM murid";
            ResultSet rs = stat.executeQuery(sql_mitha);
            while(rs.next()){
                MuridEntity_07328 muridEntity = new MuridEntity_07328();
                muridEntity.setId_07328(rs.getInt("id"));
                muridEntity.setNama_07328(rs.getString("nama"));
                muridEntity.setUmur_07328(rs.getString("umur"));
                muridEntity.setNoTelp_07328(rs.getString("noTelp"));
                muridEntity.setStatus_07328(rs.getInt("status"));
                arrayListMurid.add(muridEntity);
            }
        }catch(SQLException e){
            System.out.println(e);
        }return arrayListMurid;
    }
    
    public void insert (String nama_mitha,String umur_mitha,String noTelp_mitha)
    {
        try
        {
            sql_mitha="INSERT INTO murid (nama,umur,noTelp) values(?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql_mitha);
            pstm.setString(1, nama_mitha);
            pstm.setString(2, umur_mitha);
            pstm.setString(3, noTelp_mitha);
            int rows = pstm.executeUpdate();
            System.out.println(rows+"Data telah ditambahkan");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void delete(String nama_mitha)
    {
        try
        {
            sql_mitha="DELETE FROM murid WHERE nama=?";
            PreparedStatement pstm = conn.prepareStatement(sql_mitha);
            pstm.setString(1, nama_mitha);
            int rows = pstm.executeUpdate();
            System.out.println(rows+"Data Telah DiHapus");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void UpdateUmur(String umur_mitha,String nama_mitha)
    {
        try
        {
              sql_mitha="UPDATE murid SET umur=? WHERE nama=?";
              PreparedStatement pstm = conn.prepareStatement(sql_mitha);
              pstm.setString(1, umur_mitha);
              pstm.setString(2, nama_mitha);
              int rows = pstm.executeUpdate();
              System.out.println(rows+"Data Beerhasil DiUpdate");
        }catch(SQLException e)
        {
            System.out.println("Data GAGAL DiUpdate");
            System.out.println(e);
        }
    }
    public void UpdatenoTelp(String noTelp_mitha,String nama_mitha)
    {
        try
        {
              sql_mitha="UPDATE murid SET noTelp=? WHERE nama=?";
              PreparedStatement pstm = conn.prepareStatement(sql_mitha);
              pstm.setString(1, noTelp_mitha);
              pstm.setString(2, nama_mitha);
              int rows = pstm.executeUpdate();
              System.out.println(rows+"Data Beerhasil DiUpdate");
        }catch(SQLException e)
        {
            System.out.println("Data GAGAL DiUpdate");
            System.out.println(e);
        }
    }   
}
