import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.regex.Matcher as Matcher
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords

java.util.regex.Matcher

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-arm64-v8a-release33.apk', true)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.EditText -  Enter mobile number'), '8247001784')

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Request OTP'), 0)

Mobile.tap(findTestObject('Object Repository/Dummy_OTP_Sample_code/android.widget.EditText'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Dummy_OTP_Sample_code/android.widget.EditText (1)'), '6')

Mobile.sendKeys(findTestObject('Object Repository/Dummy_OTP_Sample_code/android.widget.EditText (2)'), '2')

Mobile.sendKeys(findTestObject('Object Repository/Dummy_OTP_Sample_code/android.widget.EditText (3)'), '2')

Mobile.sendKeys(findTestObject('Object Repository/Dummy_OTP_Sample_code/android.widget.EditText (4)'), '5')

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Add Flight'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Operator'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Aero Trans Services Pvt. Ltd'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Aircraft Model'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - BELL 505'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Aircraft Regn'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - VT-GHL'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Manufacture Year'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - 2005'), 0)

Mobile.sendKeys(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.EditText (4)'), '5500')

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - 08'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Minutes'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - 00'), 0)

Mobile.scrollToText('NEXT')

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - Upload COR'), 0)

Mobile.tap(findTestObject('Object Repository/SOFT_LOGIN_FLOW/android.widget.TextView - PDF'), 0)

Mobile.pressBack()

Mobile.closeApplication()

