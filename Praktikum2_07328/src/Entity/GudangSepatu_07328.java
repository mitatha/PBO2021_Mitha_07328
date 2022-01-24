package Entity;

import java.util.Scanner;

public class GudangSepatu_07328 
{
    private static Scanner input_mitha = new Scanner(System.in);
    private static AdminEntity_07328[] adminEntity_mitha = new AdminEntity_07328[100];
    private static DataSepatu1_07328[] dataSepatu1_mitha = new DataSepatu1_07328[100];
    private static Sepatu1_07328[] sepatu1_mitha = new Sepatu1_07328[100];
    private static int pilSepatu_mitha;
    private static int jumSepatu_mitha = 0;
    private static int cekAdmin_mitha;
  
    public static void main(String[] args) 
    {
     dataAdmin_07328();
        int pil_mitha;
        
        do{
            System.out.println("Jumlah Sepatu : " + jumSepatu_mitha);
            System.out.println("1. Login Admin");
            System.out.println("2. Lihat Data Sepatu");
            System.out.println("3. Lihat Data Admin");
            
            pil_mitha = input_mitha.nextInt();
            input_mitha.nextLine();
            switch(pil_mitha)
            {
                case 1 :
                    loginAdmin_07328();
                    break;
                case 2 : 
                    viewSepatu_07328();
                    break;
                case 3 :
                    viewAdmin_07328();
                    break;
            }
        }while(pil_mitha != 0);
    }
    
    static int dataAdmin_07328()
    {
        String namaAdmin[] = {"Mitha", "Tasya", "Laily", "Amel"};
        String passAdmin[] = {"09", "10", "11", "12"};
        String noTelpAdmin[] = {"089", "087", "081", "085"};
        String alamatAdmin[] = {"Surabaya", "Madura", "Surabaya", "Lamongan"};
        
        for(int i_mitha = 0; i_mitha < namaAdmin.length; i_mitha++){
            adminEntity_mitha[i_mitha] = new AdminEntity_07328(namaAdmin[i_mitha], noTelpAdmin[i_mitha], alamatAdmin[i_mitha], passAdmin[i_mitha] );
        }
        return namaAdmin.length;
    }
    
    static void loginAdmin_07328()
    {
        System.out.println("Nama : ");
        String nama_mitha = input_mitha.next();
        System.out.println("Password : ");
        String password_mitha = input_mitha.next();
        cekAdmin_mitha = login_07328(nama_mitha, password_mitha);
        System.out.println("Selamat Datang " + adminEntity_mitha[cekAdmin_mitha].getNama_07328());
        
        int pil_mitha;
        
        do{
            System.out.println("Jumlah Peserta : " + jumSepatu_mitha);
            System.out.println("1. Masukkan Data Sepatu");
            System.out.println("2. Ubah Data Sepatu");
            System.out.println("3. Lihat Data Sepatu");
            System.out.println("4. Hapus Data Sepatu");
            System.out.println("0. Log Out ");
            pil_mitha = input_mitha.nextInt();
            input_mitha.nextLine();
            
            switch (pil_mitha){
                case 1: 
                    insertSepatu_07328();
                    break;
                case 2: 
                    updateSepatu_07328();
                    break;
                case 3: 
                    viewSepatu_07328();
                    break;
                case 4: 
                    deleteSepatu_07328();
                    break;
            }
            
        }while(pil_mitha != 0);
    }
    
    static int login_07328(String nama_mitha, String password_mitha)
    {
        int loop_mitha = 0;
        for (int i_mitha = 0; i_mitha <= dataAdmin_07328(); i_mitha++) {
            if (adminEntity_mitha[i_mitha].getNama_07328().equals(nama_mitha) && adminEntity_mitha[i_mitha].getPassword_07328().equals(password_mitha)) 
            {
                break;
            }
            else{
                loop_mitha++;
            }
        }
        return loop_mitha;
    }
    
    static void insertSepatu_07328()
    {
        System.out.println("Masukkan Merk : ");
        String merk_mitha = input_mitha.nextLine();
        System.out.println("Masukkan Model : ");
        String model_mitha = input_mitha.nextLine();
        System.out.println("Masukkan Warna : ");
        String warna_mitha = input_mitha.nextLine();
        System.out.println("Masukkan Ukuran : ");
        String ukuran_mitha = input_mitha.nextLine();
        
        sepatu1_mitha[jumSepatu_mitha] = new Sepatu1_07328(model_mitha, merk_mitha, ukuran_mitha, warna_mitha);
        
        insertSepatuPil_07328();
    }
 
    
    static void insertSepatuPil_07328()
    {
        System.out.println("Sepatu : ");
        for (int i_mitha = 0; i_mitha < SepatuPilihEntity_07328.sepatu_mitha.length; i_mitha++) {
            System.out.println(i_mitha + ". " + SepatuPilihEntity_07328.sepatu_mitha[i_mitha]);
        }
        System.out.println("Pilih Sepatu : ");
        pilSepatu_mitha = input_mitha.nextInt();
        System.out.println("Masukkan Kode Sepatu : ");
        String KodeSepatu = input_mitha.next();
        //dataSepatu1_mitha[jumSepatu_mitha] = new DataSepatu1_07328(sepatu1_mitha[jumSepatu_mitha], pilSepatu_mitha, kodeSepatu_mitha);
        dataSepatu1_mitha[jumSepatu_mitha] = new DataSepatu1_07328(sepatu1_mitha[jumSepatu_mitha],pilSepatu_mitha ,KodeSepatu);
        jumSepatu_mitha = jumSepatu_mitha + 1;
    }
    
    static void updateSepatu_07328()
    {
        System.out.println("Masukkan Kode Sepatu yang mau di EDIT : ");
        String search = input_mitha.next();
        int cari_mitha = 0;
        do {
            if (cari_mitha == jumSepatu_mitha) {
                System.err.println("Tidak ada data");
                break;
            }
            else if (dataSepatu1_mitha[cari_mitha].getKodeSepatu_07328().equals(search)) 
            {
            int pilEdit_mitha;
                do {
                    System.out.println("Pilih data yang ingin diubah : ");
                    System.out.println("1. Lihat Data Sepatu");
                    System.out.println("2. Merk");
                    System.out.println("3. Model");
                    System.out.println("4. Warna");
                    System.out.println("5. Ukuran");
                    System.out.println("6. Sepatu");
                    System.out.println("0. Exit");
                    
                    pilEdit_mitha = input_mitha.nextInt();
                    input_mitha.nextLine();
                    
                    if (pilEdit_mitha == 1) {
                        System.out.println("=============================================");
                        System.out.println("Kode Sepatu : " + dataSepatu1_mitha[cari_mitha].getKodeSepatu_07328());
                        System.out.println("=============================================");
                        System.out.println("Merk : " + sepatu1_mitha[cari_mitha].getMerk_07328() + 
                                           "\n Model : " + sepatu1_mitha[cari_mitha].getModel_07328() + 
                                           "\n Warna : " + sepatu1_mitha[cari_mitha].getWarna_07328() + 
                                           "\n Ukuran : " + sepatu1_mitha[cari_mitha].getUkuran_07328() + 
                                           "\n Sepatu : " + SepatuPilihEntity_07328.sepatu_mitha[dataSepatu1_mitha[cari_mitha].getIndexSepatu_07328()]);
                        System.out.println("=============================================");
                    }
                    else if (pilEdit_mitha == 2) {
                        System.out.println("Ubah Merk Sepatu : ");
                        String editMerk = input_mitha.nextLine();
                        sepatu1_mitha[cari_mitha].setMerk_07328(editMerk);
                    }
                    else if (pilEdit_mitha == 3) {
                        System.out.println("Ubah Model Sepatu : ");
                        String editModel = input_mitha.nextLine();
                        sepatu1_mitha[cari_mitha].setModel_07328(editModel);
                    }
                    else if (pilEdit_mitha == 4) {
                        System.out.println("Ubah Warna Sepatu : ");
                        String editWarna = input_mitha.nextLine();
                        sepatu1_mitha[cari_mitha].setWarna_07328(editWarna);
                    }
                    else if (pilEdit_mitha == 5) {
                        System.out.println("Ubah Ukuran Sepatu : ");
                        String editUkuran = input_mitha.nextLine();
                        sepatu1_mitha[cari_mitha].setUkuran_07328(editUkuran);
                    }
                    else if (pilEdit_mitha == 6) {
                        System.out.println("Pilih Sepatu : ");
                        for (int i = 0; i < SepatuPilihEntity_07328.sepatu_mitha.length; i++) 
                        {
                            System.out.println(i + ". " + SepatuPilihEntity_07328.sepatu_mitha[i]);
                        }
                        System.out.println("Pilih Sepatu Lagi : ");
                        int editLomba = input_mitha.nextInt();
                        dataSepatu1_mitha[cari_mitha].setIndexSepatu_07328(editLomba);
                    }
                } while (pilEdit_mitha != 0);
                break;
            }
            else
            {
                cari_mitha = cari_mitha + 1;
            }
        } while (true);
        
    }
    
    static void viewSepatu_07328()
    {
        if (jumSepatu_mitha == 0) {
            System.out.println("Belum ada Data Sepatu Masuk");
        }
        else{
            for (int i_mitha = 0; i_mitha < jumSepatu_mitha; i_mitha++) {
                System.out.println("=============================================");
                System.out.println("Kode Sepatu : " + dataSepatu1_mitha[i_mitha].getKodeSepatu_07328());
                System.out.println("=============================================");
                System.out.println("Merk : " + sepatu1_mitha[i_mitha].getMerk_07328() + 
                                   "\n Model : " + sepatu1_mitha[i_mitha].getModel_07328() + 
                                   "\n Warna : " + sepatu1_mitha[i_mitha].getWarna_07328() + 
                                   "\n Ukuran : " + sepatu1_mitha[i_mitha].getUkuran_07328() +
                                   "\n Sepatu : " + SepatuPilihEntity_07328.sepatu_mitha[dataSepatu1_mitha[i_mitha].getIndexSepatu_07328()]);
                System.out.println("=============================================");
            }
        }
    }
    
    static void viewAdmin_07328(){
        for (int i_mitha = 0; i_mitha < dataAdmin_07328(); i_mitha++) {
            System.out.println("=============================================");
            System.out.println("Nama : " + adminEntity_mitha[i_mitha].getNama_07328() +
                               "\n No.Telp : " + adminEntity_mitha[i_mitha].getNoTelp_07328() +
                               "\n Alamat : " + adminEntity_mitha[i_mitha].getAlamat_07328());
            System.out.println("=============================================");
        }
    }
    
     static void deleteSepatu_07328(){
        System.out.println("Masukkan Kode Sepatu yang akan di HAPUS : ");
        String search = input_mitha.next();
        input_mitha.nextLine();
        int cari_mitha = 0;
        do {
            if (cari_mitha == jumSepatu_mitha) {
                System.err.println("Tidak Ada Data!");
                break;
            }
            else if (dataSepatu1_mitha[cari_mitha].getKodeSepatu_07328().equals(search)) {
                if (cari_mitha == jumSepatu_mitha - 1) {
                    jumSepatu_mitha = jumSepatu_mitha - 1;
                }
                else{
                    for (int i = cari_mitha; i < jumSepatu_mitha; i++) {
                        dataSepatu1_mitha[i] = dataSepatu1_mitha[i+1];
                        sepatu1_mitha[i] = sepatu1_mitha[i+1];
                    }
                    jumSepatu_mitha = jumSepatu_mitha - 1;
                }
                break;
            }
            else{
                cari_mitha = cari_mitha + 1;
            }
        } while (true);
        
    }
}
