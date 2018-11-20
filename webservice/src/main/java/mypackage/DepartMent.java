
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>departMent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取sampleType属性的值。
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
     * 设置sampleType属性的值。
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
     * 获取lisItemName属性的值。
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
     * 设置lisItemName属性的值。
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
     * 获取lisItemCode属性的值。
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
     * 设置lisItemCode属性的值。
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
     * 获取sendTime属性的值。
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
     * 设置sendTime属性的值。
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
     * 获取inceptTime属性的值。
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
     * 设置inceptTime属性的值。
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
     * 获取acceptTime属性的值。
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
     * 设置acceptTime属性的值。
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
     * 获取reportStatus属性的值。
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
     * 设置reportStatus属性的值。
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
     * 获取approveTime属性的值。
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
     * 设置approveTime属性的值。
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
     * 获取doctorCode属性的值。
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
     * 设置doctorCode属性的值。
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
     * 获取doctorName属性的值。
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
     * 设置doctorName属性的值。
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
     * 获取printSeq属性的值。
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
     * 设置printSeq属性的值。
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
     * 获取machineId属性的值。
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
     * 设置machineId属性的值。
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
     * 获取sampleId属性的值。
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
     * 设置sampleId属性的值。
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
     * 获取reportNo属性的值。
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
     * 设置reportNo属性的值。
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
