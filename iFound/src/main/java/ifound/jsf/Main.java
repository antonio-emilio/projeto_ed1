package ifound.jsf;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.rpc.holders.StringHolder;
@RequestScoped
@ManagedBean
public class Main extends Thread {

    public static Connection db;        // A connection to the database
    public static Statement sql;       // Our statement to run queries with
    public static DatabaseMetaData dbmd;      // This is basically info the driver delivers

    static String username = "postgres";
    static String password = "10052019";
    static String database1 = "";
    static Integer TempoCiclo = 10;
    static StringHolder db1 = new StringHolder();



    public static void main(String args[]) {
        Connection db;        // A connection to the database
        Statement sql;       // Our statement to run queries with
        DatabaseMetaData dbmd;      // This is basically info the driver delivers

        BD basedados;
        basedados = new BD();
        database1 = "" + db1.value;
        if (!database1.equals("null")) {
            while (!basedados.ConectarBD());
        }
    }
}
