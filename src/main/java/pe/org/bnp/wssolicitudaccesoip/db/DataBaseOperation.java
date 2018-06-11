package pe.org.bnp.wssolicitudaccesoip.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public interface DataBaseOperation {
    
    public void closeResultSet(ResultSet resultSet);

    public void closePreparedStatement(PreparedStatement preparedStatement);

    public void closeStatement(Statement statement);

    public void closeCallableStatement(CallableStatement callableStatement);

    public Connection getConnection();

    public void closeConnection(Connection connection);

    public void commitTransaction(Connection connection);

    public void rollbackTransaction(Connection connection);
}
