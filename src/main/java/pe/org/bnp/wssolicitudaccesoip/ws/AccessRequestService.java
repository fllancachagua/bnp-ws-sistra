package pe.org.bnp.wssolicitudaccesoip.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

@WebService
public interface AccessRequestService {
//    @WebMethod(operationName="createAccessRequestPI")
//    @WebResult(name = "accessRequestPIResponse")            
//    PublicInformationAccessRequestResponse createAccessRequest( @WebParam(name="accessRequestPI")PublicInformationAccessRequest publicInformationAccessRequest);           
//
    @WebMethod(operationName="getListAccessRequestPI")
    @WebResult(name = "listAccessRequestPIResponse")            
    PublicInformationAccessRequestListResponse getListAccessRequestPublicInformation( @WebParam(name="accessRequestFilterInput") PublicInformationAccessRequestFilterInput publicInformationAccessRequestFilterInput);           

    @WebMethod(operationName="example")
    @WebResult(name = "resultado")            
    String example();           
    
}
