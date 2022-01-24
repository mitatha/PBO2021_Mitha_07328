package Controller;

import Entity.MuridEntity_07328;
import java.util.ArrayList;

public class MuridController_07328 
{
    public void insert_07328(String nama_mitha,String umur_mitha, String noTelp_mitha)
    {
        AllObjectModel_07328.muridModel_mitha.insert(nama_mitha, umur_mitha ,noTelp_mitha);
    }
    
    public void delete_07328(String nama_mitha)
    {
        AllObjectModel_07328.muridModel_mitha.delete(nama_mitha);
    }
    
    public void updatenoTelp_07328(String noTelp_mitha,String nama_mitha)
    {
        AllObjectModel_07328.muridModel_mitha.UpdatenoTelp(noTelp_mitha,nama_mitha);
    }
    
     public void updateUmur_07328(String umur_mitha,String nama_mitha)
    {
        AllObjectModel_07328.muridModel_mitha.UpdateUmur(umur_mitha,nama_mitha);
    }
    
    
    public ArrayList<MuridEntity_07328>getDataMurid_07328()
    {
        return AllObjectModel_07328.muridModel_mitha.getMurid_07328();
    }
}
