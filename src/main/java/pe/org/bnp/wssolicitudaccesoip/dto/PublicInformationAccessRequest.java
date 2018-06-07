package pe.org.bnp.wssolicitudaccesoip.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(name="abcde",propOrder = { "id", "documentNumber","requestDate","documentName","user","issue","originTypeCode","procedureCode","folios","remark","originOfficeName","sectorCode","entityCode","claimant","classification","documentTypeCode","destinationTypeCode","fileName"})
public class PublicInformationAccessRequest {
    private String id;
    private String documentNumber;
    private Date requestDate;
    private String documentName;    
    private String user;
    private String issue;
    private Integer originTypeCode;
    private Integer procedureCode;
    private Integer folios;
    private String remark;
    private String originOfficeName;
    private Integer sectorCode;
    private Integer entityCode;
    private String claimant;
    private String classification;
    private String documentTypeCode;
    private String destinationTypeCode;
    private String fileName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Integer getOriginTypeCode() {
        return originTypeCode;
    }

    public void setOriginTypeCode(Integer originTypeCode) {
        this.originTypeCode = originTypeCode;
    }

    public Integer getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(Integer procedureCode) {
        this.procedureCode = procedureCode;
    }

    public Integer getFolios() {
        return folios;
    }

    public void setFolios(Integer folios) {
        this.folios = folios;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOriginOfficeName() {
        return originOfficeName;
    }

    public void setOriginOfficeName(String originOfficeName) {
        this.originOfficeName = originOfficeName;
    }

    public Integer getSectorCode() {
        return sectorCode;
    }

    public void setSectorCode(Integer sectorCode) {
        this.sectorCode = sectorCode;
    }

    public Integer getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(Integer entityCode) {
        this.entityCode = entityCode;
    }

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public String getDestinationTypeCode() {
        return destinationTypeCode;
    }

    public void setDestinationTypeCode(String destinationTypeCode) {
        this.destinationTypeCode = destinationTypeCode;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
