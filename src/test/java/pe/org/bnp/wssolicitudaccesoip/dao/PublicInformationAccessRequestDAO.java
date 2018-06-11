package pe.org.bnp.wssolicitudaccesoip.dao;

import java.sql.Connection;
import pe.org.bnp.wssolicitudaccesoip.db.SQLDataBaseOperation;

public class PublicInformationAccessRequestDAO {

    public static void main(String[] args) {
        //Assert.assertEquals(2,1+3);
        Connection connection;
        //connection = SQLDataBaseOperation.getConnectionJDBC();
        connection = SQLDataBaseOperation.getConnectionJNDI();
    }
}
