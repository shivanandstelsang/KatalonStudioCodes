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

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Belgaum Sugars Pvt. Ltd'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 05 (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 03'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - INR (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Next (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText'), 'L12345BV1234BVM123456')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - File Manager'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (4)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (1)'), '22AAAAA0000A1Z5')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (5)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.closeApplication()

