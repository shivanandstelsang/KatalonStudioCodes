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

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-arm64-v8a-release (1).apk', true)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/RegisterNow_Screen/android.widget.EditText -  Enter mobile number'), '9856235210')

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Request OTP'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Air Car Airline Pvt. Ltd'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - 02'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - 05'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - INR'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/RegisterNow_Screen/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Upload Incorporation'), 
    0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Upload GSTIN'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText'), 'kapil')

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - CEO'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (1)'), '9658784510')

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Next (1)'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Next (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText - DFFFFindiaL12345BV123'), 
    'L12345BV1234BVM123456')

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (3)'), '22ABCDE1234F1Z5')

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Next (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Bank Name'), 0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Bank of India'), 
    0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Bank of Baroda'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (4)'), '012345678901234')

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (5)'), 'Hyderabad')

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (6)'), 'BARB0HYDXYZ')

Mobile.sendKeys(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.EditText (7)'), 'Hyderabad')

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - Upload Cancelled Cheque'), 
    0)

Mobile.tap(findTestObject('Object Repository/Incorportion_to_Adding_BankDetails/android.widget.TextView - (2)'), 0)

Mobile.closeApplication()

