package pe.org.bnp.wssolicitudaccesoip.dto;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "startPeriod", "endPeriod","sistraId"})
public class PublicInformationAccessRequestFilterInput {
    private String startPeriod;
    private String endPeriod;
    private String sistraId;

    @WebResult(name="sistra_number")
    public String getSistraId() {
        return sistraId;
    }

    public void setSistraId(String sistraId) {
        this.sistraId = sistraId;
    }

    public String getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    
}
