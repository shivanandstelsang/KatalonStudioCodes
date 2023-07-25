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

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Get Started'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText -  Enter mobile number'), 
    '9865785410')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView -'), 0)

Mobile.scrollToText('Request OTP')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Request OTP'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Register Now'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - File Manager'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Choose Operator'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Aman Aviation  Aerospace Solutions Pvt. Ltd'), 
    0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - 04'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - 05'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - INR'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Next'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText'), 'L12345BV1234BVM123456')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Upload Incorporation'), 
    0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Gallery'), 5)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - File Manager'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('android.widget.ImageView (1)'), 10)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (3)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (1)'), '12ABCDE1234F1Z5')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Upload GSTIN'), 
    0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Gallery'), 5)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - File Manager'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.ImageView (1)'), 10)

Mobile.tap(findTestObject('Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (3)'), 5)

Mobile.tap(findTestObject('Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - ADD'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (2)'), 'Hanuman')

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - CEO'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (3)'), '7785465410')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Next (1)'), 
    0)

Mobile.tap(findTestObject('Start_TO_CreateFlight/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Incorportion_to_Adding_BankDetails/android.widget.TextView - Bank Name'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Axis Bank Ltd'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (4)'), '9170100000000319')

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (5)'), 'Hyderabad')

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (6)'), 'UTIB0000008')

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (7)'), 'Hyderabad')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Upload Cancelled Cheque'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (8)'), 'Darshan')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Asst. Ops Manager'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (9)'), '8974561230')

Mobile.sendKeys(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.EditText (10)'), 
    'hanuamn@yopmail.com')

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Next (2)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - Upload AOP'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Monday_17_7_Complete_RegisterNow_Flow/android.widget.TextView - (6)'), 0)

//Mobile.closeApplication()

Mobile.closeApplication()