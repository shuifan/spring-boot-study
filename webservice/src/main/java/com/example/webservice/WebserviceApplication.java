package com.example.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.example.webservice", "com.chinacaring"})
@EnableAsync
@EnableCaching
public class WebserviceApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebserviceApplication.class, args);

//		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">" +
//				"   <soapenv:Header/>" +
//				"   <soapenv:Body>" +
//				"      <tem:DoTrans>" +
//				"         <!--Optional:-->" +
//				"         <tem:transCode>0000</tem:transCode>" +
//				"         <!--Optional:-->" +
//				"         <tem:inJsonString>{\"dicType\": \"EMPLOYEE\",\"dicCode\": \"ALL\"}</tem:inJsonString>" +
//				"      </tem:DoTrans>" +
//				"   </soapenv:Body>" +
//				"</soapenv:Envelope>";
//
//		String url = "http://172.17.10.233:18088/AppServiceCommon.asmx";
//		String resultXml =
//				soap(url, xml, "UTF-8");
//		System.out.println(resultXml);



	}
}
