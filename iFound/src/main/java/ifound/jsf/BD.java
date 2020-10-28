package ifound.jsf;

import java.sql.*;

public class BD {

    public static boolean ConectarBD() {
        //Método responsável pela conexão direta com o banco de dados.
        try {
            Class.forName("org.postgresql.Driver");
            String sConnectionString = "jdbc:postgresql://35.222.222.223:5432/ed1";
            Main.db = DriverManager.getConnection(sConnectionString, Main.username, Main.password);
            Main.dbmd = Main.db.getMetaData();
            Main.sql = Main.db.createStatement();
            return true;
        } catch (ClassNotFoundException ex) {
            return false;
        } catch (SQLException ex) {
            return false;
        }

    }
}
