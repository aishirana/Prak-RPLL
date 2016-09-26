import java.sql.Connection;
import java.sql.DriverManager;
public class clsConnection
{
     public static Connection conn;
                        String db = "studentregistration";
			String url = "jdbc:mysql://localhost/" +db;
			String usr = "root";
			String pwd = "";

    public clsConnection(){
        try{
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,usr,pwd);
				System.out.println("Anda berhasil terkoneksi dengan database");
			}
			catch(ClassNotFoundException e){
				System.out.println("Error #1: " +e.getMessage());
				System.exit(0);
			}
			catch(Exception ex){
				System.out.println("Error #2: " +ex.getMessage());
				System.exit(0);
			
		
	}
	}
        
    }
