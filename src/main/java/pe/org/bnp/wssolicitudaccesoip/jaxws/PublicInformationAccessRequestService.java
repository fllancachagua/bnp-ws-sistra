package pe.org.bnp.wssolicitudaccesoip.jaxws;

import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

@WebService(endpointInterface = "pe.org.bnp.wssolicitudaccesoip.jaxws.AccessRequestService")
public class PublicInformationAccessRequestService implements AccessRequestService {

    @Override
    public PublicInformationAccessRequestResponse createAccessRequest(PublicInformationAccessRequest publicInformationAccessRequest) {
        //PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
        PublicInformationAccessRequestResponse publicInformationAccessRequestResponse = new PublicInformationAccessRequestResponse();
        publicInformationAccessRequestResponse.setId("1000");
        publicInformationAccessRequestResponse.setMessage("Registrado con exito");
        return publicInformationAccessRequestResponse;
    }

    
}
