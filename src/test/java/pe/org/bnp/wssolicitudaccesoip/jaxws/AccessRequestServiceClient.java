package pe.org.bnp.wssolicitudaccesoip.jaxws;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequest;
import pe.org.bnp.wssolicitudaccesoip.dto.PublicInformationAccessRequestResponse;

public class AccessRequestServiceClient {
	private static final Logger LOG = 
			LoggerFactory.getLogger(AccessRequestServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
		URL url;
		
//		url = new File("accessRequestService.wsdl").toURI().toURL();
		url = AccessRequestServiceClient.class.getClassLoader().getResource("accessRequestService.wsdl");
		//url = new URL("http://localhost:8081/timeService?wsdl");
		QName qname = new QName(
				"http://jaxws.wssolicitudaccesoip.bnp.org.pe/", 
				"PublicInformationAccessRequestService");
		Service service = Service.create(url, qname);
		AccessRequestService servicePort = service.getPort(AccessRequestService.class);
		setupIpService((BindingProvider)servicePort);
                
                PublicInformationAccessRequest publicInformationAccessRequest = new PublicInformationAccessRequest();
		PublicInformationAccessRequestResponse publicInformationAccessRequestResponse = servicePort.createAccessRequest(publicInformationAccessRequest);
		LOG.info("Resultado: "+publicInformationAccessRequestResponse.toString() );
	}
	
	private static void setupIpService(BindingProvider provider){
		Map<String, Object> map =provider.getRequestContext();
		map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				"http://172.16.88.136:8081/accessRequestService");
	}
}
