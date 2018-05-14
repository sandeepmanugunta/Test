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

'Open Url\r\n'
WebUI.navigateToUrl('https://tm.test1.avoka.com/manager/login.htm')

WebUI.setText(findTestObject('MainPage/input_j_username'), 'smanugunta@avoka.com')

WebUI.setText(findTestObject('MainPage/input_j_password'), 'Unicorn!23')

WebUI.click(findTestObject('MainPage/input_btn btn-primary'))

WebUI.click(findTestObject('MainPage/a_Form Spaces'))

WebUI.setText(findTestObject('MainPage/input_searchField'), 'test')

WebUI.click(findTestObject('MainPage/input_search'))

WebUI.click(findTestObject('MainPage/a_Home'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('MainPage/a_Organizations'))

WebUI.click(findTestObject('MainPage/input_Save'))

WebUI.click(findTestObject('MainPage/a_Home'))

WebUI.click(findTestObject('MainPage/a_Import Application'))

WebUI.click(findTestObject('MainPage/input_upload'))

WebUI.click(findTestObject('MainPage/a_Home'))

WebUI.click(findTestObject('MainPage/a_Import Form'))

WebUI.click(findTestObject('MainPage/form_Form Version Archive File'))

WebUI.click(findTestObject('MainPage/input_upload'))

WebUI.click(findTestObject('MainPage/a_Home'))

WebUI.click(findTestObject('MainPage/a_Logout'))

WebUI.closeBrowser()

