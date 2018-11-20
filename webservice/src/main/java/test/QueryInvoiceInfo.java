
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryInvoiceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryInvoiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PATIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PATIENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RECEIPT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAY_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT_FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT_SUM1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORDER_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAY_CHANNEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVOICE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VISIT_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MYSELF_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INSUR_SELF_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLASS_SELF_PAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OTHER_APY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIAGNOSIS_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryInvoiceInfo", propOrder = {
    "patientid",
    "patientname",
    "receiptno",
    "paydate",
    "accountflag",
    "accountsum1",
    "orderno",
    "paychannel",
    "invoicetype",
    "visitdate",
    "visitno",
    "cardno",
    "insurtype",
    "insurpay",
    "accountpay",
    "myselfpay",
    "insurselfpay",
    "classselfpay",
    "otherapy",
    "diagnosiscode",
    "diagnosisname"
})
public class QueryInvoiceInfo {

    @XmlElement(name = "PATIENT_ID", required = true)
    protected String patientid;
    @XmlElement(name = "PATIENT_NAME", required = true)
    protected String patientname;
    @XmlElement(name = "RECEIPT_NO", required = true)
    protected String receiptno;
    @XmlElement(name = "PAY_DATE", required = true)
    protected String paydate;
    @XmlElement(name = "ACCOUNT_FLAG", required = true)
    protected String accountflag;
    @XmlElement(name = "ACCOUNT_SUM1", required = true)
    protected String accountsum1;
    @XmlElement(name = "ORDER_NO", required = true)
    protected String orderno;
    @XmlElement(name = "PAY_CHANNEL", required = true)
    protected String paychannel;
    @XmlElement(name = "INVOICE_TYPE", required = true)
    protected String invoicetype;
    @XmlElement(name = "VISIT_DATE", required = true)
    protected String visitdate;
    @XmlElement(name = "VISIT_NO", required = true)
    protected String visitno;
    @XmlElement(name = "CARD_NO", required = true)
    protected String cardno;
    @XmlElement(name = "INSUR_TYPE", required = true)
    protected String insurtype;
    @XmlElement(name = "INSUR_PAY", required = true)
    protected String insurpay;
    @XmlElement(name = "ACCOUNT_PAY", required = true)
    protected String accountpay;
    @XmlElement(name = "MYSELF_PAY", required = true)
    protected String myselfpay;
    @XmlElement(name = "INSUR_SELF_PAY", required = true)
    protected String insurselfpay;
    @XmlElement(name = "CLASS_SELF_PAY", required = true)
    protected String classselfpay;
    @XmlElement(name = "OTHER_APY", required = true)
    protected String otherapy;
    @XmlElement(name = "DIAGNOSIS_CODE", required = true)
    protected String diagnosiscode;
    @XmlElement(name = "DIAGNOSIS_NAME", required = true)
    protected String diagnosisname;

    /**
     * 获取patientid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTID() {
        return patientid;
    }

    /**
     * 设置patientid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTID(String value) {
        this.patientid = value;
    }

    /**
     * 获取patientname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTNAME() {
        return patientname;
    }

    /**
     * 设置patientname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTNAME(String value) {
        this.patientname = value;
    }

    /**
     * 获取receiptno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIPTNO() {
        return receiptno;
    }

    /**
     * 设置receiptno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIPTNO(String value) {
        this.receiptno = value;
    }

    /**
     * 获取paydate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYDATE() {
        return paydate;
    }

    /**
     * 设置paydate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYDATE(String value) {
        this.paydate = value;
    }

    /**
     * 获取accountflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTFLAG() {
        return accountflag;
    }

    /**
     * 设置accountflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTFLAG(String value) {
        this.accountflag = value;
    }

    /**
     * 获取accountsum1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTSUM1() {
        return accountsum1;
    }

    /**
     * 设置accountsum1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTSUM1(String value) {
        this.accountsum1 = value;
    }

    /**
     * 获取orderno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERNO() {
        return orderno;
    }

    /**
     * 设置orderno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERNO(String value) {
        this.orderno = value;
    }

    /**
     * 获取paychannel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYCHANNEL() {
        return paychannel;
    }

    /**
     * 设置paychannel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYCHANNEL(String value) {
        this.paychannel = value;
    }

    /**
     * 获取invoicetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVOICETYPE() {
        return invoicetype;
    }

    /**
     * 设置invoicetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVOICETYPE(String value) {
        this.invoicetype = value;
    }

    /**
     * 获取visitdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITDATE() {
        return visitdate;
    }

    /**
     * 设置visitdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITDATE(String value) {
        this.visitdate = value;
    }

    /**
     * 获取visitno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVISITNO() {
        return visitno;
    }

    /**
     * 设置visitno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVISITNO(String value) {
        this.visitno = value;
    }

    /**
     * 获取cardno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDNO() {
        return cardno;
    }

    /**
     * 设置cardno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDNO(String value) {
        this.cardno = value;
    }

    /**
     * 获取insurtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURTYPE() {
        return insurtype;
    }

    /**
     * 设置insurtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURTYPE(String value) {
        this.insurtype = value;
    }

    /**
     * 获取insurpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURPAY() {
        return insurpay;
    }

    /**
     * 设置insurpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURPAY(String value) {
        this.insurpay = value;
    }

    /**
     * 获取accountpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCOUNTPAY() {
        return accountpay;
    }

    /**
     * 设置accountpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCOUNTPAY(String value) {
        this.accountpay = value;
    }

    /**
     * 获取myselfpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMYSELFPAY() {
        return myselfpay;
    }

    /**
     * 设置myselfpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMYSELFPAY(String value) {
        this.myselfpay = value;
    }

    /**
     * 获取insurselfpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSURSELFPAY() {
        return insurselfpay;
    }

    /**
     * 设置insurselfpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSURSELFPAY(String value) {
        this.insurselfpay = value;
    }

    /**
     * 获取classselfpay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSSELFPAY() {
        return classselfpay;
    }

    /**
     * 设置classselfpay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSSELFPAY(String value) {
        this.classselfpay = value;
    }

    /**
     * 获取otherapy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERAPY() {
        return otherapy;
    }

    /**
     * 设置otherapy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERAPY(String value) {
        this.otherapy = value;
    }

    /**
     * 获取diagnosiscode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISCODE() {
        return diagnosiscode;
    }

    /**
     * 设置diagnosiscode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISCODE(String value) {
        this.diagnosiscode = value;
    }

    /**
     * 获取diagnosisname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIAGNOSISNAME() {
        return diagnosisname;
    }

    /**
     * 设置diagnosisname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIAGNOSISNAME(String value) {
        this.diagnosisname = value;
    }

}
