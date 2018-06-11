package pe.org.bnp.wssolicitudaccesoip.ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.business.AccessRequestBusiness;
import pe.org.bnp.wssolicitudaccesoip.business.PublicInformationAccessRequestBusiness;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;
import pe.org.bnp.wssolicitudaccesoip.ioc.ContainerIoC;

@WebService(endpointInterface = "pe.org.bnp.wssolicitudaccesoip.ws.AccessRequestService")
public class PublicInformationAccessRequestService implements AccessRequestService {

    private ContainerIoC containerIoC;

    @Override
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequest publicInformationAccessRequest) {
        //PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
        PublicInformationAccessRequestResponse publicInformationAccessRequestResponse = new PublicInformationAccessRequestResponse();
        publicInformationAccessRequestResponse.setId("1000");
        publicInformationAccessRequestResponse.setMessage("Registrado con exito");
        return publicInformationAccessRequestResponse;
    }

    @Override
    public PublicInformationAccessRequestListResponse getListAccessRequestPublicInformation(PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput) {
        // return containerIoC.getInstancePublicInformationAccessRequestBusiness().listAccessRequest(publicInformationAccessRequestFilterInput);
        PublicInformationAccessRequestListResponse publicInformationAccessRequestListResponse = new PublicInformationAccessRequestListResponse();
        PublicInformationAccessRequestBusiness publicInformationAccessRequestBusiness = new PublicInformationAccessRequestBusiness();
        publicInformationAccessRequestListResponse = publicInformationAccessRequestBusiness.listAccessRequest(publicInformationAccessRequestFilterInput);

        return publicInformationAccessRequestListResponse;
    }

    @Override
    public String helloWorld() {
        return "Hello cruel world";
    }

}
