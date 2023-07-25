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

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Mobile'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_to_Settings/android.widget.EditText -  Enter mobile number'), '8247001784')

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Add Flight'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Pawan Hans Helicopters Pvt. Ltd'), 
    0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - DAUPHIN 2'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup (4)'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - VT-ELI'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - 2000'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Start_to_Settings/android.widget.EditText'), '5000')

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - 08'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Minutes'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - 10'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Upload COR'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Upload COA'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Upload ARC'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Start_to_Settings/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Valid upto'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - 26'), 0)

Mobile.tap(findTestObject('Object Repository/Add_Flight_Actions/android.widget.TextView - Next'), 0)

Mobile.sendKeys(findTestObject('Object Repository/settings/android.widget.EditText - 0'), '100000')

Mobile.tap(findTestObject('Object Repository/settings/android.view.ViewGroup'), 0)

Mobile.sendKeys(findTestObject('Object Repository/settings/android.widget.EditText'), 'kempegowda')

Mobile.tap(findTestObject('Object Repository/settings/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/settings/android.widget.TextView - Kempegowda International Airport'), 0)

Mobile.tap(findTestObject('Object Repository/settings/android.widget.TextView -'), 0)

Mobile.sendKeys(findTestObject('Object Repository/settings/android.widget.EditText (1)'), 'Spice')

Mobile.tap(findTestObject('Object Repository/settings/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/settings/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Layouts_Code/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Layouts_Code/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Layouts_Code/android.widget.ImageView'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Layouts_Code/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Layouts_Code/android.widget.TextView - Done'), 0)

