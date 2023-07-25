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

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.EditText -  Enter mobile number'), 
    '8247001784')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Request OTP'), 0)

not_run: Mobile.pressBack()

not_run: Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Verify'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (2)'), 0)
WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Pawan Hans Helicopters Pvt. Ltd'), 
    0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - BELL 505'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - VT-GHL'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - 2000'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.EditText'), '5000')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - 05'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - 10'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Upload COR'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Upload COA'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Upload ARC'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

not_run: Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.EditText - 0'), '150000')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.view.ViewGroup (2)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.EditText (1)'), 'hal')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Sardar Patel Heliport'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (9)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.EditText (2)'), 'Speed')

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.TextView - Gallery (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

not_run: Mobile.tap(findTestObject('Object Repository/Start_TO_CreateFlight/android.view.ViewGroup (4)'), 0)

Mobile.closeApplication()

