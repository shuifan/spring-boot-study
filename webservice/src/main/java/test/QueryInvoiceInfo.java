
package test;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryInvoiceInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpatientid���Ե�ֵ��
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
     * ����patientid���Ե�ֵ��
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
     * ��ȡpatientname���Ե�ֵ��
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
     * ����patientname���Ե�ֵ��
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
     * ��ȡreceiptno���Ե�ֵ��
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
     * ����receiptno���Ե�ֵ��
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
     * ��ȡpaydate���Ե�ֵ��
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
     * ����paydate���Ե�ֵ��
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
     * ��ȡaccountflag���Ե�ֵ��
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
     * ����accountflag���Ե�ֵ��
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
     * ��ȡaccountsum1���Ե�ֵ��
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
     * ����accountsum1���Ե�ֵ��
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
     * ��ȡorderno���Ե�ֵ��
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
     * ����orderno���Ե�ֵ��
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
     * ��ȡpaychannel���Ե�ֵ��
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
     * ����paychannel���Ե�ֵ��
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
     * ��ȡinvoicetype���Ե�ֵ��
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
     * ����invoicetype���Ե�ֵ��
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
     * ��ȡvisitdate���Ե�ֵ��
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
     * ����visitdate���Ե�ֵ��
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
     * ��ȡvisitno���Ե�ֵ��
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
     * ����visitno���Ե�ֵ��
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
     * ��ȡcardno���Ե�ֵ��
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
     * ����cardno���Ե�ֵ��
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
     * ��ȡinsurtype���Ե�ֵ��
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
     * ����insurtype���Ե�ֵ��
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
     * ��ȡinsurpay���Ե�ֵ��
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
     * ����insurpay���Ե�ֵ��
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
     * ��ȡaccountpay���Ե�ֵ��
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
     * ����accountpay���Ե�ֵ��
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
     * ��ȡmyselfpay���Ե�ֵ��
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
     * ����myselfpay���Ե�ֵ��
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
     * ��ȡinsurselfpay���Ե�ֵ��
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
     * ����insurselfpay���Ե�ֵ��
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
     * ��ȡclassselfpay���Ե�ֵ��
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
     * ����classselfpay���Ե�ֵ��
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
     * ��ȡotherapy���Ե�ֵ��
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
     * ����otherapy���Ե�ֵ��
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
     * ��ȡdiagnosiscode���Ե�ֵ��
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
     * ����diagnosiscode���Ե�ֵ��
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
     * ��ȡdiagnosisname���Ե�ֵ��
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
     * ����diagnosisname���Ե�ֵ��
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
