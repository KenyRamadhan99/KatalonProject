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

WebUI.openBrowser('https://automationexercise.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('homePage/landingPage/verifyLandingPage'))

WebUI.click(findTestObject('homePage/landingPage/signUpAndLoginBtn'))

WebUI.verifyElementVisible(findTestObject('homePage/Login/loginToYourAccountText'))

WebUI.setText(findTestObject('homePage/Login/emailField'), 'kenny@gmail.com')

WebUI.setEncryptedText(findTestObject('homePage/Login/passwordField'), 'vOoj4tQjAWWJinfDy0fckw==')

WebUI.click(findTestObject('homePage/Login/loginBtn'))

WebUI.verifyElementVisible(findTestObject('homePage/Login/alertMessage'))

WebUI.acceptAlert()

