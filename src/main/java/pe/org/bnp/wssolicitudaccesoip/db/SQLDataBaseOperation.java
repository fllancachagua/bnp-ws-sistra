package pe.org.bnp.wssolicitudaccesoip.db;

import com.microsoft.sqlserver.jdbc.SQLServerCallableStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SQLDataBaseOperation {

    private static final Logger LOGGER = LoggerFactory.getLogger(SQLDataBaseOperation.class);
    private static final String JNDI = "java:/ds_sistra";
    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException exception) {
            LOGGER.error("SQLException " + exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static void closePreparedStatement(PreparedStatement preparedStatement) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static void closeCallableStatement(CallableStatement callableStatement) {
        try {
            if (callableStatement != null) {
                callableStatement.close();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    
    public static void closeSQLServerCallableStatement(SQLServerCallableStatement sqlServerCallableStatement) {
        try {
            if (sqlServerCallableStatement != null) {
                sqlServerCallableStatement.close();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }    

    public static Connection getConnectionJNDI() {
        Connection connection = null;
        try {
            connection = SQLConnection.getConnectionJNDI(JNDI);
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
        return connection;
    }

    public static Connection getConnectionJDBC() {
        Connection connection = null;
        try {
            connection = SQLConnection.getConnectionJDBC();
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
        return connection;
    }    

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static void commitTransaction(Connection connection) {
        try {
            if (connection != null) {
                connection.commit();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    public static void rollbackTransaction(Connection connection) {
        try {
            if (connection != null) {
                connection.rollback();
            }
        } catch (SQLException exception) {
            LOGGER.error(exception.getMessage(), exception);
        } catch (Exception exception) {
            LOGGER.error(exception.getMessage(), exception);
        }
    }
}
