
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>departMent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="departMent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sampleType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lisItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lisItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inceptTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acceptTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="approveTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="doctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printSeq" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="machineId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "departMent", propOrder = {
    "sampleType",
    "lisItemName",
    "lisItemCode",
    "sendTime",
    "inceptTime",
    "acceptTime",
    "reportStatus",
    "approveTime",
    "doctorCode",
    "doctorName",
    "printSeq",
    "machineId",
    "sampleId",
    "reportNo"
})
public class DepartMent {

    @XmlElement(required = true)
    protected String sampleType;
    @XmlElement(required = true)
    protected String lisItemName;
    @XmlElement(required = true)
    protected String lisItemCode;
    @XmlElement(required = true)
    protected String sendTime;
    @XmlElement(required = true)
    protected String inceptTime;
    @XmlElement(required = true)
    protected String acceptTime;
    @XmlElement(required = true)
    protected String reportStatus;
    @XmlElement(required = true)
    protected String approveTime;
    @XmlElement(required = true)
    protected String doctorCode;
    @XmlElement(required = true)
    protected String doctorName;
    @XmlElement(required = true)
    protected String printSeq;
    @XmlElement(required = true)
    protected String machineId;
    @XmlElement(required = true)
    protected String sampleId;
    @XmlElement(required = true)
    protected String reportNo;

    /**
     * ��ȡsampleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleType() {
        return sampleType;
    }

    /**
     * ����sampleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleType(String value) {
        this.sampleType = value;
    }

    /**
     * ��ȡlisItemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLisItemName() {
        return lisItemName;
    }

    /**
     * ����lisItemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLisItemName(String value) {
        this.lisItemName = value;
    }

    /**
     * ��ȡlisItemCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLisItemCode() {
        return lisItemCode;
    }

    /**
     * ����lisItemCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLisItemCode(String value) {
        this.lisItemCode = value;
    }

    /**
     * ��ȡsendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTime() {
        return sendTime;
    }

    /**
     * ����sendTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTime(String value) {
        this.sendTime = value;
    }

    /**
     * ��ȡinceptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptTime() {
        return inceptTime;
    }

    /**
     * ����inceptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptTime(String value) {
        this.inceptTime = value;
    }

    /**
     * ��ȡacceptTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptTime() {
        return acceptTime;
    }

    /**
     * ����acceptTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptTime(String value) {
        this.acceptTime = value;
    }

    /**
     * ��ȡreportStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportStatus() {
        return reportStatus;
    }

    /**
     * ����reportStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportStatus(String value) {
        this.reportStatus = value;
    }

    /**
     * ��ȡapproveTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveTime() {
        return approveTime;
    }

    /**
     * ����approveTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveTime(String value) {
        this.approveTime = value;
    }

    /**
     * ��ȡdoctorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * ����doctorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorCode(String value) {
        this.doctorCode = value;
    }

    /**
     * ��ȡdoctorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * ����doctorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoctorName(String value) {
        this.doctorName = value;
    }

    /**
     * ��ȡprintSeq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintSeq() {
        return printSeq;
    }

    /**
     * ����printSeq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintSeq(String value) {
        this.printSeq = value;
    }

    /**
     * ��ȡmachineId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineId() {
        return machineId;
    }

    /**
     * ����machineId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineId(String value) {
        this.machineId = value;
    }

    /**
     * ��ȡsampleId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleId() {
        return sampleId;
    }

    /**
     * ����sampleId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleId(String value) {
        this.sampleId = value;
    }

    /**
     * ��ȡreportNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * ����reportNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNo(String value) {
        this.reportNo = value;
    }

}
