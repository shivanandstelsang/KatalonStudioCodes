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

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - ADD'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText'), 'Hanuman')

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - CEO'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (1)'), '9999888877')

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - Axis Bank Ltd'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (2)'), '9170100000000319')

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (3)'), 'Hyderabad')

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (4)'), 'UTIB0000008')

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (5)'), 'Hyderabad')

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - Gallery'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - File Manager'), 
    0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - ADD (1)'), 0)

Mobile.scrollToText('Next')

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (6)'), 'Rebel')

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - Accountable Manager'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (7)'), '9663366210')

Mobile.sendKeys(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.EditText (8)'), 'hanuman@yopmail.com')

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - (4)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - File Manager (1)'), 
    0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Tuesday_BoardOfDirectors_Add2End/android.widget.TextView - (5)'), 0)

Mobile.closeApplication()

