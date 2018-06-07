package pe.org.bnp.wssolicitudaccesoip.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

@WebService
public interface AccessRequestService {
    @WebMethod(operationName="createAccessRequestPI")
    @WebResult(name = "accessRequestPIResponse")            
    PublicInformationAccessRequestResponse createAccessRequest( @WebParam(name="accessRequestPI")PublicInformationAccessRequest publicInformationAccessRequest);           

    @WebMethod(operationName="getListAccessRequestPI")
    @WebResult(name = "listAccessRequestPIResponse")            
    PublicInformationAccessRequestResponse createAccessRequest( @WebParam(name="registrationPeriod")String period, @WebParam(name="id") String id);           
    
}
