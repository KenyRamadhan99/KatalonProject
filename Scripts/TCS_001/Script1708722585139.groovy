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

WebUI.verifyElementVisible(findTestObject('homePage/newUserSignUp/newUserSignUpText'))

WebUI.setText(findTestObject('homePage/newUserSignUp/usernameField'), 'Kenny')

WebUI.setText(findTestObject('homePage/newUserSignUp/emailField'), 'kenny@gmail.com')

WebUI.click(findTestObject('homePage/newUserSignUp/signUpBtn'))

WebUI.waitForElementPresent(findTestObject('homePage/formInputNewUser/enterAccountInformationText'), 10)

WebUI.verifyElementVisible(findTestObject('homePage/formInputNewUser/enterAccountInformationText'))

WebUI.click(findTestObject('homePage/formInputNewUser/radioButtonGenderMr'))

WebUI.setEncryptedText(findTestObject('homePage/formInputNewUser/passwordField'), 'hNry9Acrdy4=')

/*
 * String xpath_spanDash =
 * "//div[@class='selector']//select[@id='days']//option[@value='$date']"
 * 
 * println('>>> the span dash xpath is: ' + xpath_spanDash)
 * 
 * TestObject toSpanDash = new TestObject('span_Dash2')
 * 
 * toSpanDash.addProperty('xpath', ConditionType.EQUALS, xpath_spanDash)
 */
WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/date/dropDownDays'))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/date/dateOptions', [('index') : date]))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/months/dropDownMonths'))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/months/monthsOption', [('months') : months]))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/years/dropDownYears'))

WebUI.scrollToElement(findTestObject('homePage/formInputNewUser/dateOfBirth/years/yearsOption', [('years') : months]), 0)

WebUI.waitForElementClickable(findTestObject('homePage/formInputNewUser/dateOfBirth/years/yearsOption', [('years') : years]), 
    0)

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/years/yearsOption', [('years') : years]))

WebUI.scrollToElement(findTestObject('homePage/formInputNewUser/addressField2'), 10)

WebUI.click(findTestObject('homePage/formInputNewUser/checkBox1'))

WebUI.click(findTestObject('homePage/formInputNewUser/checkBox2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('homePage/formInputNewUser/firstNameField'), 'Kenzy')

WebUI.setText(findTestObject('homePage/formInputNewUser/lastNameField'), 'Roc')

WebUI.setText(findTestObject('homePage/formInputNewUser/companyField'), 'ABC')

WebUI.setText(findTestObject('homePage/formInputNewUser/addressField1'), 'JKRT')

WebUI.setText(findTestObject('homePage/formInputNewUser/addressField2'), 'JAKSEL')

WebUI.click(findTestObject('homePage/formInputNewUser/dropDownCountry'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('homePage/formInputNewUser/countryOption'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('homePage/formInputNewUser/stateField'), 'JKT')

WebUI.setText(findTestObject('homePage/formInputNewUser/cityField'), 'BKS')

WebUI.setText(findTestObject('homePage/formInputNewUser/zipcodeField'), '1234')

WebUI.setText(findTestObject('homePage/formInputNewUser/mobileNumberField'), '02139192')

WebUI.click(findTestObject('homePage/formInputNewUser/createAccountBtn'))

WebUI.waitForElementVisible(findTestObject('accountCreatedOrDeleted/accountCreatedText'), 0)

WebUI.click(findTestObject('accountCreatedOrDeleted/continueBtn'))

WebUI.waitForElementVisible(findTestObject('homePage/landingPage/loggedInAsButton'), 0)

WebUI.click(findTestObject('homePage/landingPage/deleteAccountBtn'))

WebUI.waitForElementVisible(findTestObject('accountCreatedOrDeleted/accountDeletedText'), 0)

WebUI.click(findTestObject('accountCreatedOrDeleted/continueBtn'))

