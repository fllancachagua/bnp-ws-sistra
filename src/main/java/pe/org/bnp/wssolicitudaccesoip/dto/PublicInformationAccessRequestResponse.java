package pe.org.bnp.wssolicitudaccesoip.dto;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "id", "message"})
public class PublicInformationAccessRequestResponse {
    private String id;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PublicInformationAccessRequestResponse{" + "id=" + id + ", message=" + message + '}';
    }
    
}
