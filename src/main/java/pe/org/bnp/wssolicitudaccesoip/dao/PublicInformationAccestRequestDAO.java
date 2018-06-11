package pe.org.bnp.wssolicitudaccesoip.dao;

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
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;

public class PublicInformationAccestRequestDAO implements AccessRequestDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(PublicInformationAccessRequestListResponse.class);

    @Override
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        String cursorListAccessRequestPI = "{call dbo.PA_sel_TransparenciaCargarListadoDocumentosRegistrados(?,?,?,?)}";

        PublicInformationAccessRequestListResponse publicInformationAccessRequestListResponse = new PublicInformationAccessRequestListResponse();

        List<PublicInformationAccessRequest> listPublicInformationAccessRequest = new ArrayList<PublicInformationAccessRequest>();
        try {
            //connection = SQLDataBaseOperation.getConnectionJDBC();
            connection = SQLDataBaseOperation.getConnectionJNDI();
            LOGGER.info("connection instance generated");

            callableStatement = connection.prepareCall(cursorListAccessRequestPI);
            callableStatement.setString(1, publicInformationAccessRequestFilterInput.getStartPeriod());
            callableStatement.setString(2, publicInformationAccessRequestFilterInput.getEndPeriod());
            callableStatement.setString(3, publicInformationAccessRequestFilterInput.getSistraId());
//            callableStatement.setString(1, "01/01/2018");
//            callableStatement.setString(2, "01/07/2018");
//            callableStatement.setString(3, "");
            callableStatement.registerOutParameter(4, java.sql.Types.VARCHAR);
            resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
                publicInformationAccessRequest.setDocumentNumber(resultSet.getString(1));
                publicInformationAccessRequest.setId(resultSet.getString(2));
                publicInformationAccessRequest.setRequestDate(resultSet.getDate(3));
                publicInformationAccessRequest.setUser(resultSet.getString(4));
                publicInformationAccessRequest.setOriginTypeName(resultSet.getString(5));
                publicInformationAccessRequest.setProcedureName(resultSet.getString(6));
                publicInformationAccessRequest.setFolios(resultSet.getInt(7));
                publicInformationAccessRequest.setRemark(resultSet.getString(8));
                publicInformationAccessRequest.setIssue(resultSet.getString(9));
                publicInformationAccessRequest.setClassification(resultSet.getString(10));
                publicInformationAccessRequest.setDocumentName(resultSet.getString(11));
                publicInformationAccessRequest.setDocumentTypeName(resultSet.getString(12));
                publicInformationAccessRequest.setOriginOfficeName(resultSet.getString(13));
                publicInformationAccessRequest.setClaimant(resultSet.getString(14));
                publicInformationAccessRequest.setDeadLine(resultSet.getString(15));
                publicInformationAccessRequest.setFilePath(resultSet.getString(16));
                publicInformationAccessRequest.setFileName(resultSet.getString(17));
                publicInformationAccessRequest.setDestinationTypeName(resultSet.getString(18));
                publicInformationAccessRequest.setState(resultSet.getString(19));
                publicInformationAccessRequest.setDestinationOfficeName(resultSet.getString(20));
                listPublicInformationAccessRequest.add(publicInformationAccessRequest);
            }
            publicInformationAccessRequestListResponse.setListPublicInformationAccessRequest(listPublicInformationAccessRequest);

//            PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
//            publicInformationAccessRequest.setClaimant("Javier Quispe");
//            publicInformationAccessRequest.setDestinationTypeCode("TRAMITE");
//            publicInformationAccessRequest.setDocumentName("SRP000");
//            publicInformationAccessRequest.setFileName("documento0001.pdf");
//            publicInformationAccessRequest.setId("00001");
//            publicInformationAccessRequest.setSectorCode(2);
//            publicInformationAccessRequest.setIssue("Solicito el plan organizacional del 2016: rpta de SP (JNDI): " + answer);
//
//            PublicInformationAccessRequest publicInformationAccessRequest2 = new PublicInformationAccessRequest();
//            publicInformationAccessRequest2.setClaimant("DAnilo");
//            publicInformationAccessRequest2.setDestinationTypeCode("TRAMITE");
//            publicInformationAccessRequest2.setDocumentName("SRP000");
//            publicInformationAccessRequest2.setFileName("documento0002.pdf");
//            publicInformationAccessRequest2.setId("00002");
//            publicInformationAccessRequest2.setSectorCode(3);
//            publicInformationAccessRequest2.setIssue("Solicito el plan organizacional del 2017");
//
//            PublicInformationAccessRequest publicInformationAccessRequest3 = new PublicInformationAccessRequest();
//            publicInformationAccessRequest3.setClaimant("Manuel");
//            publicInformationAccessRequest3.setDestinationTypeCode("TRAMITE");
//            publicInformationAccessRequest3.setDocumentName("SRP000");
//            publicInformationAccessRequest3.setFileName("documento0003.pdf");
//            publicInformationAccessRequest3.setId("00003");
//            publicInformationAccessRequest3.setSectorCode(3);
//            publicInformationAccessRequest3.setIssue("Solicito el plan organizacional del 2018");
//            listPublicInformationAccessRequest.add(publicInformationAccessRequest2);
//            listPublicInformationAccessRequest.add(publicInformationAccessRequest3);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            SQLDataBaseOperation.closeResultSet(resultSet);
            SQLDataBaseOperation.closeCallableStatement(callableStatement);
            SQLDataBaseOperation.closeConnection(connection);
        }
        return publicInformationAccessRequestListResponse;
    }

}
