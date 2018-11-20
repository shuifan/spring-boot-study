package com.example.webservice;

import com.example.webservice.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebserviceApplicationTests {

	@Autowired
	private TestService testService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() throws InterruptedException {
//		char[] baseString={'0','1','2','3',
//				'4','5','6','7','8','9',
//				'a','b','c','d','e',
//				'f','g','h','i','j',
//				'k','l','m','n','o',
//				'p','q','r','s','t',
//				'u','v','w','x','y',
//				'z','A','B','C','D',
//				'E','F','G','H','I',
//				'J','K','L','M','N',
//				'O','P','Q','R','S',
//				'T','U','V','W','X','Y','Z'};
//		String random = RandomStringUtils.random(10, baseString);
//		System.out.println("随机字符串 -- " + random);
//		System.out.println(StringUtils.isEmpty("aa"));

//		String s = "<QueryInvoiceInfoSoap>\n" +
//				"    <result>\n" +
//				"        <returnCode>1</returnCode>\n" +
//				"        <returnDesc></returnDesc>\n" +
//				"    </result>\n" +
//				"    <Data>\n" +
//				"        <QueryInvoiceInfo>\n" +
//				"            <PATIENT_ID>0002020916</PATIENT_ID>\n" +
//				"            <PATIENT_NAME>耿明利</PATIENT_NAME>\n" +
//				"            <RECEIPT_NO>000180569406</RECEIPT_NO>\n" +
//				"            <PAY_DATE>2017-12-08T05:45:17+08:00</PAY_DATE>\n" +
//				"            <ACCOUNT_FLAG>1</ACCOUNT_FLAG>\n" +
//				"            <ACCOUNT_SUM1>162.83</ACCOUNT_SUM1>\n" +
//				"            <ORDER_NO>000180569408</ORDER_NO>\n" +
//				"            <PAY_CHANNEL>1</PAY_CHANNEL>\n" +
//				"            <INVOICE_TYPE>普通门诊</INVOICE_TYPE>\n" +
//				"            <VISIT_DATE>2017-12-08T05:21:46+08:00</VISIT_DATE>\n" +
//				"            <VISIT_NO>15215212</VISIT_NO>\n" +
//				"            <CARD_NO>0002020916</CARD_NO>\n" +
//				"            <INSUR_TYPE>现金</INSUR_TYPE>\n" +
//				"            <INSUR_PAY>0</INSUR_PAY>\n" +
//				"            <ACCOUNT_PAY>0</ACCOUNT_PAY>\n" +
//				"            <MYSELF_PAY>162.83</MYSELF_PAY>\n" +
//				"            <INSUR_SELF_PAY>162.83</INSUR_SELF_PAY>\n" +
//				"            <CLASS_SELF_PAY>0</CLASS_SELF_PAY>\n" +
//				"            <OTHER_APY>0</OTHER_APY>\n" +
//				"            <DIAGNOSIS_CODE xml:space=\"preserve\">6</DIAGNOSIS_CODE>\n" +
//				"            <DIAGNOSIS_NAME>泌尿系感染</DIAGNOSIS_NAME>\n" +
//				"        </QueryInvoiceInfo>\n" +
//				"        <QueryInvoiceInfo>\n" +
//				"            <PATIENT_ID>0002020916</PATIENT_ID>\n" +
//				"            <PATIENT_NAME>耿明利</PATIENT_NAME>\n" +
//				"            <RECEIPT_NO>000180569406</RECEIPT_NO>\n" +
//				"            <PAY_DATE>2017-12-08T05:45:17+08:00</PAY_DATE>\n" +
//				"            <ACCOUNT_FLAG>1</ACCOUNT_FLAG>\n" +
//				"            <ACCOUNT_SUM1>162.83</ACCOUNT_SUM1>\n" +
//				"            <ORDER_NO>000180569408</ORDER_NO>\n" +
//				"            <PAY_CHANNEL>1</PAY_CHANNEL>\n" +
//				"            <INVOICE_TYPE>普通门诊</INVOICE_TYPE>\n" +
//				"            <VISIT_DATE>2017-12-08T05:21:46+08:00</VISIT_DATE>\n" +
//				"            <VISIT_NO>15215212</VISIT_NO>\n" +
//				"            <CARD_NO>0002020916</CARD_NO>\n" +
//				"            <INSUR_TYPE>现金</INSUR_TYPE>\n" +
//				"            <INSUR_PAY>0</INSUR_PAY>\n" +
//				"            <ACCOUNT_PAY>0</ACCOUNT_PAY>\n" +
//				"            <MYSELF_PAY>162.83</MYSELF_PAY>\n" +
//				"            <INSUR_SELF_PAY>162.83</INSUR_SELF_PAY>\n" +
//				"            <CLASS_SELF_PAY>0</CLASS_SELF_PAY>\n" +
//				"            <OTHER_APY>0</OTHER_APY>\n" +
//				"            <DIAGNOSIS_CODE xml:space=\"preserve\">6</DIAGNOSIS_CODE>\n" +
//				"            <DIAGNOSIS_NAME>泌尿系感染</DIAGNOSIS_NAME>\n" +
//				"        </QueryInvoiceInfo>\n" +
//				"    </Data>\n" +
//				"\n" +
//				"</QueryInvoiceInfoSoap>";
//
//		QueryInvoiceInfoSoap queryInvoiceInfoSoap = JaxbXmlUtil.convertToJavaBean(s, QueryInvoiceInfoSoap.class);
//		System.out.println(queryInvoiceInfoSoap);
		testService.testAsync();
	}
}
