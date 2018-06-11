package pe.org.bnp.wssolicitudaccesoip.ws;

import pe.org.bnp.wssolicitudaccesoip.ws.AccessRequestService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestFilterInput;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestListResponse;

public class AccessRequestServiceClient {
	private static final Logger LOG = 
			LoggerFactory.getLogger(AccessRequestServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
            URL url;
//		url = new File("accessRequestService.wsdl").toURI().toURL();
//		url = AccessRequestServiceClient.class.getClassLoader().getResource("accessRequestService.wsdl");
            url = new URL("http://172.16.88.136:8081/wsaccessrequestPI?wsdl");
            QName qname = new QName(
                            "http://ws.wssolicitudaccesoip.bnp.org.pe/", 
                            "PublicInformationAccessRequestServiceService");
            Service service = Service.create(url, qname);
            AccessRequestService servicePort = service.getPort(AccessRequestService.class);
            setupIpService((BindingProvider)servicePort);

            //String resultado = servicePort.helloWorld();
            PublicInformationAccessRequestListResponse publicInformationAccessRequestListResponse = servicePort.getListAccessRequestPublicInformation(new PublicInformationAccessRequestFilterInput() );
            for (int i = 0; i < publicInformationAccessRequestListResponse.getListPublicInformationAccessRequest().size(); i++) {
                PublicInformationAccessRequest publicInformationAccessRequest =  publicInformationAccessRequestListResponse.getListPublicInformationAccessRequest().get(i);
                LOG.info(publicInformationAccessRequest.toString() );

            }
           // LOG.info("Resultado: "+resultado );
                
	}
	
	private static void setupIpService(BindingProvider provider){
		Map<String, Object> map =provider.getRequestContext();
		map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				"http://172.16.88.136:8081/wsaccessrequestPI");
	}
}
