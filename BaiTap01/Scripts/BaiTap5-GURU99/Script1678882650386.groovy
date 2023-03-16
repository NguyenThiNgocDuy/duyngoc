import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Open Browser'
WebUI.openBrowser('')
WebUI.navigateToUrl('https://demo.guru99.com/V4')
'Maximize browser'
WebUI.maximizeWindow()

String email='phonui186@gmail.com'
// Click here hyperlink
WebUI.click(findTestObject('Object Repository/Object_BT5/Href_HereLink'));

// Nhap Email
WebUI.delay(5)
WebUI.waitForElementPresent(findTestObject('Object Repository/Object_BT5/txt_EmailID'), 30)
WebUI.setText(findTestObject('Object Repository/Object_BT5/txt_EmailID'), email);

// Click Submit button
WebUI.click(findTestObject('Object Repository/Object_BT5/btn_Submitbutton'));

//Get UserID
getusername = WebUI.getText(findTestObject('Object Repository/Object_BT5/txt_getUserID'));
	
//Get Password 
getpassword = WebUI.getText(findTestObject('Object Repository/Object_BT5/txt_getPassword'));

WebUI.navigateToUrl('https://demo.guru99.com/V4');

// Set UserID
WebUI.setText(findTestObject('Object Repository/Object_BT5/txt_InputUserID'), getusername);

//Set Password
WebUI.setText(findTestObject('Object Repository/Object_BT5/txt_InputPassword'), getpassword);

// Verify button Login enable
WebUI.verifyElementClickable(findTestObject('Object Repository/Object_BT5/btn_LoginAgain'));

// Click Dang nhap
WebUI.click(findTestObject('Object Repository/Object_BT5/btn_LoginAgain'));

//Verify message Wellcome
WebUI.verifyElementText(findTestObject('Object Repository/Object_BT5/txt_MessageWellcome'),"Welcome To Manager's Page of Guru99 Bank");

// Close browser
WebUI.closeBrowser()