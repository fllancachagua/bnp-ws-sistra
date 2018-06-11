package pe.org.bnp.wssolicitudaccesoip.ws;

import pe.org.bnp.wssolicitudaccesoip.ws.PublicInformationAccessRequestService;
import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessRequestServicePublisher {
	private static final Logger LOG = LoggerFactory
			.getLogger(AccessRequestServicePublisher.class);

	public static void main(String[] args) {
		Endpoint.publish("http://172.16.88.136:8081/wsaccessrequestPI",
				new PublicInformationAccessRequestService());
		LOG.info("Servicio desplegado");
	}
}
