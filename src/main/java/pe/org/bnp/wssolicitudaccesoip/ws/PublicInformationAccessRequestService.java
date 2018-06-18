package pe.org.bnp.wssolicitudaccesoip.ws;

import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.business.PublicInformationAccessRequestBusiness;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

@WebService(endpointInterface = "pe.org.bnp.wssolicitudaccesoip.ws.AccessRequestService")
public class PublicInformationAccessRequestService implements AccessRequestService {

//    private ContainerIoC containerIoC;
//
//    @Override
//    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequest publicInformationAccessRequest) {
//        //PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
//        PublicInformationAccessRequestResponse publicInformationAccessRequestResponse = new PublicInformationAccessRequestResponse();
//        publicInformationAccessRequestResponse.setId("1000");
//        publicInformationAccessRequestResponse.setMessage("Registrado con exito");
//        return publicInformationAccessRequestResponse;
//    }
    @Override
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequestInput publicInformationAccessRequestInput) {
        PublicInformationAccessRequestBusiness publicInformationAccessRequestBusiness = new PublicInformationAccessRequestBusiness();
        return publicInformationAccessRequestBusiness.createAccessRequest(publicInformationAccessRequestInput);
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
    public String example() {
        return "Hello world";
    }


}
