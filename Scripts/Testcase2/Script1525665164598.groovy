import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tm.test1.avoka.com/manager/login.htm')

WebUI.setText(findTestObject('Page_Manager - Avoka Transact/input_j_username'), 'smanugunta@avoka.com')

WebUI.setText(findTestObject('Page_Manager - Avoka Transact/input_j_password'), 'Unicorn!23')

WebUI.click(findTestObject('Page_Manager - Avoka Transact/input_btn btn-primary'))

WebUI.click(findTestObject('Page_Manager - Avoka Transact/a_Forms2'))

WebUI.navigateToUrl('https://tm.test1.avoka.com/manager/admin/form/form-search.htm?_wid=15')

WebUI.click(findTestObject('Page_Manager - Avoka Transact/Navigate'))

WebUI.switchToWindowTitle('18.04 for Stuart')

WebUI.click(findTestObject('Page_18.04 for Stuart/span_Continue'))

WebUI.click(findTestObject('Page_18.04 for Stuart/span_Submit'))

WebUI.switchToWindowTitle('Manager - Avoka Transact')

WebUI.click(findTestObject('Page_Manager - Avoka Transact/a_Operations'))

WebUI.navigateToUrl('https://tm.test1.avoka.com/manager/admin/submission/submission-search.htm?_wid=31')

WebUI.click(findTestObject('Page_Manager - Avoka Transact/a_Logout'))

WebUI.closeBrowser()

