package pe.org.bnp.wssolicitudaccesoip.dao;

import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

public interface AccessRequestDAO {
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput);
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequestInput publicInformationAccessRequestInput);
    
}
