package pe.org.bnp.wssolicitudaccesoip.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder = { "documentNumber","documentName","issue","remark","claimant","fileName"})
public class PublicInformationAccessRequestInput {
    private String issue;
    private String remark;
    private String documentNumber;
    private String documentName;    
    private String claimant;
    private String fileName;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


}
