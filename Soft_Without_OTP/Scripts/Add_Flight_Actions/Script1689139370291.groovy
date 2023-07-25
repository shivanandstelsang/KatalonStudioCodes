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

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Add Flight'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Operator'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Pawan Hans Helicopters Pvt. Ltd'), 
    0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Aircraft Model'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Aircraft Regn'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - VT-ELD'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText - RW'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Manufacture Year'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - 1995'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText'), '5500')

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - 04'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - 04 (1)'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Upload COR'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Upload COA'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Upload ARC'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Valid upto'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - 26'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Next'), 0)

not_run: Mobile.sendKeys(findTestObject(''), '150000')

not_run: Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Base Location'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText (1)'), 'bangalore')

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Kempegowda International Airport'), 
    0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Bangalore'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Next (2)'), 0)

not_run: Mobile.sendKeys(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText - 1,500'), '150000')

not_run: Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText - 15,00,15'), '100000')

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Add_Flight_Actions/android.widget.EditText (2)'), 'heavy')

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.view.ViewGroup (1)'), 0)

Mobile.closeApplication()

