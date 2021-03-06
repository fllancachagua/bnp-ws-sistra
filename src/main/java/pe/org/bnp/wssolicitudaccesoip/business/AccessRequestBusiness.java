package pe.org.bnp.wssolicitudaccesoip.business;

import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

public interface AccessRequestBusiness {
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput);
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequestInput publicInformationAccessRequestInput);
}
