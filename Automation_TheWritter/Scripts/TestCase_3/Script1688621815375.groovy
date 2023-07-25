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

Mobile.sendKeys(findTestObject('Object Repository/IamWritter_Registeration/android.widget.EditText - 9876543210'), '8889997777')

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - Proceed'), 0)

Mobile.closeApplication()

Mobile.startApplication('C:\\Users\\Administrator\\Downloads\\app-armeabi-v7a-release.apk', true)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - IM A WRITER'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - Register Now'), 0)

WebUI.acceptAlert()

Mobile.scrollToText('First name')

Mobile.sendKeys(findTestObject('Object Repository/IamWritter_Registeration/android.widget.EditText'), 'Puneet')

Mobile.sendKeys(findTestObject('Object Repository/IamWritter_Registeration/android.widget.EditText (1)'), 'Kumar')

Mobile.sendKeys(findTestObject('Object Repository/IamWritter_Registeration/android.widget.EditText (2)'), 'PuneetKumar')

Mobile.sendKeys(findTestObject('Object Repository/IamWritter_Registeration/android.widget.EditText (3)'), 'puneet@yopmail.com')

Mobile.tapAndHold(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - (1)'), 0, 0)

Mobile.pressBack()

Mobile.tapAndHold(findTestObject(''), 0, 0)

Mobile.pressBack()

Mobile.tapAndHold(findTestObject(''), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - 2023'), 0, 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - 2011'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/IamWritter_Registeration/android.view.View - July'), 0, 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - January'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - 1'), 0)

Mobile.scrollToText('Years of experience')

Mobile.tapAndHold(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - (2)'), 0, 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - 3'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - (3)'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - male'), 0)

Mobile.tap(findTestObject('Object Repository/IamWritter_Registeration/android.widget.TextView - Continue'), 0)

Mobile.closeApplication()

