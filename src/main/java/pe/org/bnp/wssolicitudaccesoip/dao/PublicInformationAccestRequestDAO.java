package pe.org.bnp.wssolicitudaccesoip.dao;

import com.microsoft.sqlserver.jdbc.SQLServerCallableStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.org.bnp.wssolicitudaccesoip.db.SQLDataBaseOperation;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

public class PublicInformationAccestRequestDAO implements AccessRequestDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublicInformationAccessRequestListResponse.class);

    @Override
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        String cursorStoreProcedure = "{call dbo.PA_sel_TransparenciaCargarListadoDocumentosRegistrados(?,?,?)}";

        PublicInformationAccessRequestListResponse publicInformationAccessRequestListResponse = new PublicInformationAccessRequestListResponse();

        List<PublicInformationAccessRequest> listPublicInformationAccessRequest = new ArrayList<PublicInformationAccessRequest>();
        try {
            connection = SQLDataBaseOperation.getConnectionJNDI();
            LOGGER.info("listAccessRequest: connection instance generated");

            callableStatement = connection.prepareCall(cursorStoreProcedure);
            callableStatement.setString(1, publicInformationAccessRequestFilterInput.getStartPeriod());
            callableStatement.setString(2, publicInformationAccessRequestFilterInput.getEndPeriod());
            callableStatement.setString(3, publicInformationAccessRequestFilterInput.getSistraId());
            //callableStatement.registerOutParameter(4, java.sql.Types.VARCHAR);
            resultSet = callableStatement.executeQuery();
            LOGGER.info("dbo.PA_sel_TransparenciaCargarListadoDocumentosRegistrados executed");
            while (resultSet.next()) {
                PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
                publicInformationAccessRequest.setDocumentNumber(resultSet.getString(1));
                publicInformationAccessRequest.setId(resultSet.getString(2));
                publicInformationAccessRequest.setRequestDate(resultSet.getDate(3));
                publicInformationAccessRequest.setUser(resultSet.getString(4));
                publicInformationAccessRequest.setOriginTypeName(resultSet.getString(5));
                publicInformationAccessRequest.setOriginTypeCode(resultSet.getString(6));
                publicInformationAccessRequest.setProcedureName(resultSet.getString(7));
                publicInformationAccessRequest.setProcedureCode(resultSet.getString(8));
                publicInformationAccessRequest.setFolios(resultSet.getString(9));
                publicInformationAccessRequest.setRemark(resultSet.getString(10));
                publicInformationAccessRequest.setIssue(resultSet.getString(11));
                publicInformationAccessRequest.setClassificationName(resultSet.getString(12));
                publicInformationAccessRequest.setClassificationCode(resultSet.getString(13));
                publicInformationAccessRequest.setDocumentName(resultSet.getString(14));
                publicInformationAccessRequest.setDocumentTypeName(resultSet.getString(15));
                publicInformationAccessRequest.setDocumentTypeCode(resultSet.getString(16));
                publicInformationAccessRequest.setOriginOfficeName(resultSet.getString(17));
                publicInformationAccessRequest.setOriginOfficeCode(resultSet.getString(18));
                publicInformationAccessRequest.setClaimant(resultSet.getString(19));
                publicInformationAccessRequest.setDeadLine(resultSet.getString(20));
                publicInformationAccessRequest.setFilePath(resultSet.getString(21));
                publicInformationAccessRequest.setFileName(resultSet.getString(22));
                publicInformationAccessRequest.setDestinationTypeName(resultSet.getString(23));
                publicInformationAccessRequest.setDestinationTypeCode(resultSet.getString(24));
                publicInformationAccessRequest.setStateName(resultSet.getString(25));
                publicInformationAccessRequest.setStateCode(resultSet.getString(26));
                publicInformationAccessRequest.setDestinationOfficeName(resultSet.getString(27));
                publicInformationAccessRequest.setDestinationOfficeCode(resultSet.getString(28));
                listPublicInformationAccessRequest.add(publicInformationAccessRequest);
            }
            publicInformationAccessRequestListResponse.setListPublicInformationAccessRequest(listPublicInformationAccessRequest);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            SQLDataBaseOperation.closeResultSet(resultSet);
            SQLDataBaseOperation.closeCallableStatement(callableStatement);
            SQLDataBaseOperation.closeConnection(connection);
        }
        return publicInformationAccessRequestListResponse;
    }

    @Override
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequestInput publicInformationAccessRequestInput) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        SQLServerCallableStatement sqlServerCallableStatement = null;
        String cursorStoreProcedure = "{call dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno(?,?,?,?,?,?,?,?)}";
        PublicInformationAccessRequestResponse publicInformationAccessRequestResponse = new PublicInformationAccessRequestResponse();

        try {
            connection = SQLDataBaseOperation.getConnectionJNDI();
            LOGGER.info("PA_ins_TransparenciaGuardarNuevoDocumentoExterno: connection instance generated");

            callableStatement = connection.prepareCall(cursorStoreProcedure);
            callableStatement.setString(1, publicInformationAccessRequestInput.getDocumentNumber());
            callableStatement.setString(2, publicInformationAccessRequestInput.getIssue());
            callableStatement.setString(3, publicInformationAccessRequestInput.getDocumentName());
            callableStatement.setString(4, publicInformationAccessRequestInput.getRemark());
            callableStatement.setString(5, publicInformationAccessRequestInput.getClaimant());
            callableStatement.setString(6, publicInformationAccessRequestInput.getFileName());
            callableStatement.registerOutParameter(7, java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter(8, java.sql.Types.VARCHAR);
//            sqlServerCallableStatement = (SQLServerCallableStatement) callableStatement;
//            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - Response buffering mode is: " + sqlServerCallableStatement.getResponseBuffering());
//            sqlServerCallableStatement.execute();
//            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno executed");
//            publicInformationAccessRequestResponse.setMessage(callableStatement.getString(7));
//            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - msj: " + publicInformationAccessRequestResponse.getMessage());
//            publicInformationAccessRequestResponse.setId(callableStatement.getString(8));
//            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - msj: " + publicInformationAccessRequestResponse.getId());
//            connection.commit();
//            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - transaction commited");
            callableStatement.execute();
            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno executed");
            publicInformationAccessRequestResponse.setMessage(callableStatement.getString(7));
            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - msj: " + publicInformationAccessRequestResponse.getMessage());
            publicInformationAccessRequestResponse.setId(callableStatement.getString(8));
            LOGGER.info("dbo.PA_ins_TransparenciaGuardarNuevoDocumentoExterno - msj: " + publicInformationAccessRequestResponse.getId());
            connection.commit();
            return publicInformationAccessRequestResponse;
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            SQLDataBaseOperation.closeSQLServerCallableStatement(sqlServerCallableStatement);
            SQLDataBaseOperation.closeCallableStatement(callableStatement);
            SQLDataBaseOperation.closeConnection(connection);
        }
        return publicInformationAccessRequestResponse;
    }

}
