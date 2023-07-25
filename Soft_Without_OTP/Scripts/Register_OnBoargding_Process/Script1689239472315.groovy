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

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-armeabi-v7a-release (1).apk', true)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText -  Enter mobile number'), 
    '9999956231')

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView -'), 0)

Mobile.scrollToText('Request OTP')

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Request OTP'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Register Now'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - File Manager'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.view.ViewGroup (2)'), 0)

List<String> airlineNames = ['Air Car Airline Pvt. Ltd', 'Another Airline', 'Yet Another Airline']
for (String airlineName : airlineNames) {v
    TestObject myDropdown = findTestObject("Object Repository/Register_OnBoargding_Process/android.widget.TextView", ['text': airlineName])
    Mobile.tap(myDropdown)
}

Mobile.scrollToText('Settings')

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - 08'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - 08 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - INR'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (4)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText'), 'L12345BV1234BVM123456')

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText (1)'), '12ABCDE1234F1Z5')

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Upload GSTIN'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Axis Bank Ltd'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText (2)'), '012345678901234')

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText (3)'), 'Hyderabad')

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText (4)'), 'BARB0SAMPLE1')

Mobile.sendKeys(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.EditText (5)'), 'Hyderabad')

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Upload Cancelled Cheque'), 
    0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - File Manager (1)'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (6)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Register_OnBoargding_Process/android.widget.TextView - Submit'), 0)

Mobile.closeApplication()

