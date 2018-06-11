package pe.org.bnp.wssolicitudaccesoip.ioc;

import pe.org.bnp.wssolicitudaccesoip.business.PublicInformationAccessRequestBusiness;
import pe.org.bnp.wssolicitudaccesoip.dao.PublicInformationAccestRequestDAO;

public class ContainerIoC {

    private static ContainerIoC containerIoC;

    static {
        containerIoC = new ContainerIoC();
    }
    public static ContainerIoC getInstance(){
        return containerIoC;
    }
    
    public PublicInformationAccestRequestDAO getInstancePublicInformationAccestRequestDAO(){
        return new PublicInformationAccestRequestDAO();
    }
    public PublicInformationAccessRequestBusiness getInstancePublicInformationAccessRequestBusiness(){
        return new PublicInformationAccessRequestBusiness();
    }

}
