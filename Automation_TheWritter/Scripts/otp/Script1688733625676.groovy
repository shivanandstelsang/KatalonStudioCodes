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

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-armeabi-v7a-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Otp/android.widget.FrameLayout'), 0)

Mobile.swipe(500, 1000, 0, 0)

Mobile.swipe(500, 1000, 0, 0)

Mobile.swipe(500, 1000, 0, 0)

Mobile.swipe(500, 1000, 0, 0)

Mobile.tap(findTestObject('Object Repository/Otp/android.view.ViewGroup'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Otp/android.widget.EditText - 9876543210'), '9999933333')

Mobile.tap(findTestObject('Object Repository/Otp/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Otp/android.view.ViewGroup (1)'), 0)

Mobile.swipe(200, 500, 0, 0)

not_run: Mobile.tap(findTestObject('Object Repository/Otp/android.widget.TextView - Resend code'), 0)

Mobile.tap(findTestObject(''), 8)

Mobile.sendKeys(findTestObject(''), '8')

Mobile.sendKeys(findTestObject('Object Repository/Otp/android.widget.EditText (2)'), '5')

Mobile.sendKeys(findTestObject('Object Repository/Otp/android.widget.EditText (3)'), '6')

Mobile.sendKeys(findTestObject('Object Repository/Otp/android.widget.EditText (4)'), '8')

Mobile.tap(findTestObject('Object Repository/Otp/android.widget.TextView - Resend code (1)'), 0)

Mobile.closeApplication()

