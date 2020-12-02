import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.automationtesting.in/')

WebUI.click(findTestObject('Object Repository/button_Skip Sign In'))

WebUI.setText(findTestObject('Object Repository/input_Full Name_form-control ng-pristine ng_10dee7'), 'haviz')

WebUI.setText(findTestObject('Object Repository/input_Full Name_form-control ng-untouched n_438cb8'), 'fatah')

WebUI.setText(findTestObject('Object Repository/textarea_Address_form-control ng-untouched _b1abf7'), 'jl. nurtanio blok ch no.7')

WebUI.setText(findTestObject('Object Repository/input_Email address_form-control ng-untouch_b58296'), 'havizabdulfatah@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Phone_form-control ng-untouched ng-in_c98163'), '0218576712')

WebUI.click(findTestObject('Object Repository/input_Male_radiooptions'))

WebUI.click(findTestObject('Object Repository/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/a_Indonesian'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Skills                       _fcf818'), 'C++', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select Country                      _cc64b6'), 'Indonesia', 
    true)

WebUI.click(findTestObject('Object Repository/span_Select Country _select2-selection sele_4ca78e'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_year                             191_0e56cb'), '1990', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Month                               _920c21'), 'August', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Day                                 _6d848d'), '23', 
    true)

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_firstpassword'), '6CwHGnxEIFjJ4clzMrjK3A==')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Confirm Password_secondpassword'), '6CwHGnxEIFjJ4clzMrjK3A==')

WebUI.click(findTestObject('Object Repository/button_Submit'))

WebUI.click(findTestObject('Object Repository/a_WebTable'))

WebUI.doubleClick(findTestObject('Object Repository/button_Allen_btn btn-danger btn-xs'))

WebUI.click(findTestObject('Object Repository/button_Cancel'))

WebUI.rightClick(findTestObject('Object Repository/button_Allen_btn btn-xs btn-custom'))

WebUI.click(findTestObject('Object Repository/button_Delete'))

WebUI.mouseOver(findTestObject('Object Repository/a_SwitchTo'))

WebUI.mouseOver(findTestObject('Object Repository/a_Alerts'))

WebUI.click(findTestObject('Object Repository/a_Alerts'))

WebUI.click(findTestObject('Object Repository/button_click the button to display an  alert box'))

WebUI.mouseOver(findTestObject('Object Repository/a_Interactions'))

WebUI.mouseOver(findTestObject('Object Repository/a_Drag and Drop'))

WebUI.mouseOver(findTestObject('Object Repository/a_Static'))

WebUI.click(findTestObject('Object Repository/a_Static'))

WebUI.closeBrowser()

