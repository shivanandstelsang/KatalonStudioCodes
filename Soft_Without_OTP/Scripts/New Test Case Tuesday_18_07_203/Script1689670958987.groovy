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

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (2)'), '012345678901234')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (3)'), 'Bangalore')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (4)'), 'BARB0HYDXYZ')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (5)'), 'majestic')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (7)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - File Manager (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (8)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (6)'), 'Kumar')

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Accountable Manager'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (7)'), '9656232120')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (8)'), 'kumar@yopmail.com')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (10)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

