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

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-arm64-v8a-release33.apk', true)

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.EditText -  Enter mobile number'), 
    '8297661020')

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.TextView - Request OTP'), 0)

Mobile.tap(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.EditText'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/Extract_OTP_From_Keyboard/android.widget.EditText (1)'), 0)

Mobile.closeApplication()

