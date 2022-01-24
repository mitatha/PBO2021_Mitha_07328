package praktikum3_07328;
import Controller.MuridController_07328;
import Entity.MuridEntity_07328;
import java.util.Scanner;

public class DataMurid_07328 
{
    private static Scanner input_mitha = new Scanner(System.in);
    public static MuridController_07328 murid = new MuridController_07328();
    
public static void main(String[] args) 
    {   
        int pil;
        do{
            System.out.println("1. Tambah Data \n2. Update Data \n3. Delete Data \n4. View");
            System.out.print("Masukan Pilihan:");
            pil=input_mitha.nextInt();
            switch (pil){
                case 1 :
                    input_mitha.nextLine();
                    System.out.print("Nama           = ");
                    String nama = input_mitha.nextLine();
                    System.out.print("Umur           = ");
                    String umur = input_mitha.nextLine();
                    System.out.print("Nomor Telepon         = ");
                    String noTelp = input_mitha.nextLine();
                    murid.insert_07328(nama, umur, noTelp);
                    break;
                    
                case 2:
                    int ubah;
                    input_mitha.nextLine();
                    System.out.print("Nama    = ");
                    String name = input_mitha.nextLine();
                    do
                    {
                        System.out.println("1. Umur \n2. Nomor Telepon \n0. Exit");
                        System.out.print("Pilih Data yang Ingin Diubah = ");
                        ubah = input_mitha.nextInt();
                        switch(ubah)
                        {                     
                            case 1:
                                input_mitha.nextLine();
                                System.out.print("Umur  = ");
                                String ubahumur = input_mitha.nextLine();
                                murid.updateUmur_07328(ubahumur, name);
                                break;

                            case 2:
                                input_mitha.nextLine();
                                System.out.print("NoTelp= ");
                                String ubahnoTelp = input_mitha.nextLine();
                                murid.updatenoTelp_07328(ubahnoTelp, name);
                                break;
                        }
                    }while(ubah != 0);
                    break;    
    
                    
                case 3:
                    input_mitha.nextLine();
                    System.out.print("Masukan Nama yang Ingin Dihapus = ");
                    String hapus = input_mitha.nextLine();
                    murid.delete_07328(hapus);
                    break;
                    
                case 4:
                    input_mitha.nextLine();
                    showData_07328();
            }
        }while (true);
        
    }
    
 static void showData_07328()
    {
        for(MuridEntity_07328 muridEntities:murid.getDataMurid_07328())
        {
            System.out.println("----------------------------------------------------");
            System.out.println("id="+muridEntities.getId_07328());
            System.out.println("nama="+muridEntities.getNama_07328());
            System.out.println("umur="+muridEntities.getUmur_07328());
            System.out.println("no telp="+muridEntities.getNoTelp_07328());
            System.out.println("status=");
            
            if(muridEntities.getStatus_07328()==0)
            {
                System.out.println("Unverified");
            }
            else
            {
                System.out.println("Verified");
            }
        }
    }
}
