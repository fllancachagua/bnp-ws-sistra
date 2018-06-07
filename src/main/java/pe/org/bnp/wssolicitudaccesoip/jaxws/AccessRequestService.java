package pe.org.bnp.wssolicitudaccesoip.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

@WebService
public interface AccessRequestService {
    @WebMethod(operationName="createAccessRequest")
    @WebResult(name = "accessRequestResponse")            
    PublicInformationAccessRequestResponse createAccessRequest( @WebParam(name="accessRequest")PublicInformationAccessRequest publicInformationAccessRequest);           
}
