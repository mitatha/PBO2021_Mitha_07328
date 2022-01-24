package Helper;
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDb_07328 
{
    public static Connection getconection()
    {
        Connection  conn=null;
        String driver_mitha="com.mysql.jdbc.Driver";
        String url_mitha="jdbc:mysql://localhost:3306/db_pendaftarankursus";
        String user_mitha="root";
        String pass_mitha="";
        try
        {
            Class.forName(driver_mitha);
            conn=DriverManager.getConnection(url_mitha,user_mitha,pass_mitha);
            System.out.println("Berhasil koneksi Database");
        }catch(Exception e)
        {
            System.out.println("Gagal koneksi Database");
            e.printStackTrace();  
        }
        return conn;
    }
}
