package pe.org.bnp.wssolicitudaccesoip.business;

import pe.org.bnp.wssolicitudaccesoip.dao.PublicInformationAccestRequestDAO;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.ioc.ContainerIoC;

public class PublicInformationAccessRequestBusiness implements AccessRequestBusiness {

    private ContainerIoC containerIoC;

    @Override
    public PublicInformationAccessRequestListResponse listAccessRequest(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput) {
        //return containerIoC.getInstancePublicInformationAccestRequestDAO().listAccessRequest(publicInformationAccessRequestFilterInput);
        PublicInformationAccessRequestListResponse publicInformationAccessRequestListResponse = new PublicInformationAccessRequestListResponse();

        PublicInformationAccestRequestDAO publicInformationAccessRequestDAO = new PublicInformationAccestRequestDAO();
        publicInformationAccessRequestListResponse = publicInformationAccessRequestDAO.listAccessRequest(publicInformationAccessRequestFilterInput);

        return publicInformationAccessRequestListResponse;

    }

}
