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

WebUI.openBrowser('')

WebUI.navigateToUrl('gist.github.com')

WebUI.maximizeWindow()

//WebUI.takeScreenshot()
description ='test test'
edit 		= 'Yes'
delete 		= 'Yes'
//login
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'), 0)

WebUI.click(findTestObject('Object Repository/Page_Discover gists  GitHub/a_Signin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/p_Sign in to GitHub'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/label_Username or email address'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/label_Username or email address'),
	 'Username or email address')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Username or email address_login'),
	GlobalVariable.email)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/label_Password'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/label_Password'), 'Password')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_Password_password'), GlobalVariable.password)

//WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/a_Forgot password'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_signIn_commit'), 0)

WebUI.click(findTestObject('Object Repository/Page_Sign in to GitHub  GitHub/input_signIn_commit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Discover gists/summary_Sign out_Header-link name'), 0)
WebUI.click(findTestObject('Object Repository/Page_Discover gists/summary_Sign out_Header-link name'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Discover gists/a_Your gists'), 0)
WebUI.click(findTestObject('Object Repository/Page_Discover gists/a_Your gists'))

//WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_indahkireinaonnas gists/a_All gists'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_indahkireinaonnas gists/create'), 0)
WebUI.click(findTestObject('Object Repository/Page_indahkireinaonnas gists/create'))

//WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/input_gistdescription'), 0)
WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_gistdescription'), description)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/input_gistcontentsname'), 0)
WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_gistcontentsname'), description)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/select_SpacesTabs'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/select_indent size'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/select_No wrap'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/button_Add file'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/div_1'), 0)
WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1'),'test test test')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/button_Create secret gist'), 0)
//WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Page_Create a new Gist/button_Create secret gist'))


WebUI.verifyElementPresent(findTestObject('Object Repository/Page_test1/a_Code'), 0)

if(edit=='Yes'){
	WebUI.click(findTestObject('Object Repository/Page_ Gist/btn_edit'))
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/input_gistdescription'), 0)
	WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/input_gistdescription'), description+' edit')
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/button_Add file'), 0)
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Create a new Gist/div_1'), 0)
	WebUI.setText(findTestObject('Object Repository/Page_Create a new Gist/div_1'),'test edit edit')
	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ Gist/btn_canceledit'),0)
	//WebUI.takeScreenshot()
	WebUI.click(findTestObject('Object Repository/Page_ Gist/btn_update gits'))
}
//WebUI.takeScreenshot()
if(delete=='Yes'){
	WebUI.click(findTestObject('Object Repository/Page_ Gist/btn_delete'))
	WebUI.sendKeys(null, Keys.chord(Keys.ENTER))
	WebUI.delay(2)
	WebUI.takeScreenshot()
}

//logout
WebUI.click(findTestObject('Object Repository/Page_Discover gists/summary_Sign out_Header-link name'))

WebUI.click(findTestObject('Object Repository/Page_ Gist/button_Sign out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Sign out/h1_Are you sure you want to sign out'), 0)
WebUI.click(findTestObject('Object Repository/Page_Sign out/input_signout'))

WebUI.closeBrowser()


