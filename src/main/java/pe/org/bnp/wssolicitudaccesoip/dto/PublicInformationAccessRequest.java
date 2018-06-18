package pe.org.bnp.wssolicitudaccesoip.dto;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement
@XmlType(propOrder = { "id", "documentNumber","requestDate","documentName","user","issue","remark","originTypeName","originTypeCode","procedureName","procedureCode","folios","originOfficeName","originOfficeCode","destinationOfficeName","destinationOfficeCode","claimant","classificationName","classificationCode","documentTypeName","documentTypeCode","destinationTypeName","destinationTypeCode","fileName","filePath","deadLine","stateName","stateCode"})
public class PublicInformationAccessRequest {
    private String id;
    private String documentNumber;
    private Date requestDate;
    private String documentName;    
    private String user;
    private String issue;
    private String originTypeName;
    private String procedureName;
    private String folios;
    private String remark;
    private String originOfficeName;
    private String claimant;
    private String classificationName;
    private String documentTypeName;
    private String destinationTypeName;
    private String fileName;
    private String filePath;
    private String deadLine;
    private String stateName;
    private String destinationOfficeName;
    
    private String classificationCode;
    private String destinationOfficeCode;
    private String destinationTypeCode;
    private String documentTypeCode;
    private String originOfficeCode;
    private String originTypeCode;
    private String procedureCode;
    private String stateCode;

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

    public String getOriginTypeName() {
        return originTypeName;
    }

    public void setOriginTypeName(String originTypeName) {
        this.originTypeName = originTypeName;
    }

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getFolios() {
        return folios;
    }

    public void setFolios(String folios) {
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

    public String getClaimant() {
        return claimant;
    }

    public void setClaimant(String claimant) {
        this.claimant = claimant;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public String getDocumentTypeName() {
        return documentTypeName;
    }

    public void setDocumentTypeName(String documentTypeName) {
        this.documentTypeName = documentTypeName;
    }

    public String getDestinationTypeName() {
        return destinationTypeName;
    }

    public void setDestinationTypeName(String destinationTypeName) {
        this.destinationTypeName = destinationTypeName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getDestinationOfficeName() {
        return destinationOfficeName;
    }

    public void setDestinationOfficeName(String destinationOfficeName) {
        this.destinationOfficeName = destinationOfficeName;
    }

    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
    }

    public String getDestinationOfficeCode() {
        return destinationOfficeCode;
    }

    public void setDestinationOfficeCode(String destinationOfficeCode) {
        this.destinationOfficeCode = destinationOfficeCode;
    }

    public String getDestinationTypeCode() {
        return destinationTypeCode;
    }

    public void setDestinationTypeCode(String destinationTypeCode) {
        this.destinationTypeCode = destinationTypeCode;
    }

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    public String getOriginOfficeCode() {
        return originOfficeCode;
    }

    public void setOriginOfficeCode(String originOfficeCode) {
        this.originOfficeCode = originOfficeCode;
    }

    public String getOriginTypeCode() {
        return originTypeCode;
    }

    public void setOriginTypeCode(String originTypeCode) {
        this.originTypeCode = originTypeCode;
    }

    public String getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "PublicInformationAccessRequest{" + "id=" + id + ", documentNumber=" + documentNumber + ", requestDate=" + requestDate + ", documentName=" + documentName + ", user=" + user + ", issue=" + issue + ", originTypeName=" + originTypeName + ", procedureName=" + procedureName + ", folios=" + folios + ", remark=" + remark + ", originOfficeName=" + originOfficeName + ", claimant=" + claimant + ", classificationName=" + classificationName + ", documentTypeName=" + documentTypeName + ", destinationTypeName=" + destinationTypeName + ", fileName=" + fileName + ", filePath=" + filePath + ", deadLine=" + deadLine + ", stateName=" + stateName + ", destinationOfficeName=" + destinationOfficeName + ", classificationCode=" + classificationCode + ", destinationOfficeCode=" + destinationOfficeCode + ", destinationTypeCode=" + destinationTypeCode + ", documentTypeCode=" + documentTypeCode + ", originOfficeCode=" + originOfficeCode + ", originTypeCode=" + originTypeCode + ", procedureCode=" + procedureCode + ", stateCode=" + stateCode + '}';
    }



}
