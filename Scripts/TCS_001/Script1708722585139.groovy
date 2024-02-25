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

WebUI.setText(findTestObject('homePage/newUserSignUp/usernameField'), username)

WebUI.setText(findTestObject('homePage/newUserSignUp/emailField'), email)

WebUI.click(findTestObject('homePage/newUserSignUp/signUpBtn'))

WebUI.waitForElementPresent(findTestObject('homePage/formInputNewUser/enterAccountInformationText'), 10)

WebUI.verifyElementVisible(findTestObject('homePage/formInputNewUser/enterAccountInformationText'))

WebUI.click(findTestObject('homePage/formInputNewUser/radioButtonGenderMr'))

WebUI.setEncryptedText(findTestObject('homePage/formInputNewUser/passwordField'), password)

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/date/dropDownDays'))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/date/dateOptions', [('date') : date]))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/months/dropDownMonths'))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/months/monthsOption', [('months') : months]))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/years/dropDownYears'))

WebUI.click(findTestObject('homePage/formInputNewUser/dateOfBirth/years/yearsOption', [('years') : years]))

WebUI.scrollToElement(findTestObject('homePage/formInputNewUser/addressField2'), 10)

WebUI.click(findTestObject('homePage/formInputNewUser/checkBox1'))

WebUI.click(findTestObject('homePage/formInputNewUser/checkBox2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('homePage/formInputNewUser/firstNameField'), firstname)

WebUI.setText(findTestObject('homePage/formInputNewUser/lastNameField'), lastname)

WebUI.setText(findTestObject('homePage/formInputNewUser/companyField'), company)

WebUI.setText(findTestObject('homePage/formInputNewUser/addressField1'), address1)

WebUI.setText(findTestObject('homePage/formInputNewUser/addressField2'), address2)

WebUI.click(findTestObject('homePage/formInputNewUser/dropDownCountry'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('homePage/formInputNewUser/countryOption', [('country') : country]), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('homePage/formInputNewUser/stateField'), state)

WebUI.setText(findTestObject('homePage/formInputNewUser/cityField'), city)

WebUI.setText(findTestObject('homePage/formInputNewUser/zipcodeField'), zipcode)

WebUI.setText(findTestObject('homePage/formInputNewUser/mobileNumberField'), mobilenumber)

WebUI.click(findTestObject('homePage/formInputNewUser/createAccountBtn'))

WebUI.waitForElementVisible(findTestObject('accountCreatedOrDeleted/accountCreatedText'), 0)

WebUI.click(findTestObject('accountCreatedOrDeleted/continueBtn'))

WebUI.waitForElementVisible(findTestObject('homePage/landingPage/loggedInAsButton'), 0)

WebUI.click(findTestObject('homePage/landingPage/deleteAccountBtn'))

WebUI.waitForElementVisible(findTestObject('accountCreatedOrDeleted/accountDeletedText'), 0)

WebUI.click(findTestObject('accountCreatedOrDeleted/continueBtn'))

