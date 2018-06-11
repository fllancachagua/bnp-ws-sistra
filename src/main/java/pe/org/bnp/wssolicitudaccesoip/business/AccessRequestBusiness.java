package pe.org.bnp.wssolicitudaccesoip.business;

import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;

public interface AccessRequestBusiness {
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput);
}
