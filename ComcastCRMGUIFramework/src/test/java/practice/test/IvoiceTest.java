package practice.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.comcast.crm.basetest.Base;

//@Listeners(com.comcast.crm.listenerutility.ListenerImpClass.class) because we wrote it in xml file (if we use here for every class we need to write so in xml file we write only once
public class IvoiceTest extends Base{
	
	/**@Test(retryAnalyzer = com.comcast.crm.listenerutility.RetryListenerImp.class)
	public void activateSim() {
		System.out.println("execute createInvoiceTest");
		
		Assert.assertEquals("", "Login");
		
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
	}**/
	
	@Test
	public void createInvoiceTest() {
		System.out.println("execute createInvoiceTest");
		
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, "Login");
		
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
	}
	
	@Test
	public void createInvoiceWithContactTest() {
		System.out.println("execute createInvoiceWithContactTest");
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
	} 

}
