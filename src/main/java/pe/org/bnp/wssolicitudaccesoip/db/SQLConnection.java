package pe.org.bnp.wssolicitudaccesoip.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SQLConnection {

    private static final Logger LOGGER = LoggerFactory.getLogger(Connection.class);
    private static InitialContext initialContext;
    private static HashMap<String, DataSource> cache = new HashMap<String, DataSource>();

    static {
        try {
            initialContext = new InitialContext();
        } catch (NamingException exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static Connection getConnectionJDBC() throws Exception {
        String connectionURL = "jdbc:sqlserver://172.16.8.119:1433;databaseName=SISTRA_;"
                + "user=sa;"
                + "password=bnp2018$$;";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL);
            connection.setAutoCommit(false);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnectionJNDI(String jndi) throws Exception {
        Connection connection = getDataSource(jndi).getConnection();
        connection.setAutoCommit(false);
        return connection;
    }

    private static DataSource getDataSource(String jndi) throws Exception {
        DataSource dataSource = null;
        try {
            dataSource = (DataSource) cache.get(jndi);
            if (dataSource == null) {
                dataSource = (DataSource) initialContext.lookup(jndi);
                cache.put(jndi, dataSource);
            }
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
        return dataSource;
    }
}
