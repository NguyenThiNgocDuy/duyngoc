import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Open Browser'
WebUI.openBrowser('')
'Maximize browser'
WebUI.maximizeWindow()
'Navigate to URL'
WebUI.navigateToUrl('https://the-internet.herokuapp.com/login')
// Input username
WebUI.setText(findTestObject('Object Repository/Object_BT2/txt_Username2'), 'tomsmith');
//Input password
WebUI.setText(findTestObject('Object Repository/Object_BT2/txt_Password2'), 'SuperSecretPassword!')
// CLick Dang Nhap
WebUI.click(findTestObject('Object Repository/Object_BT2/btn_DangNhap2'));
// Verify login successful
WebUI.verifyElementText(findTestObject('Object Repository/Object_BT2/txt_Lable'),"Welcome to the Secure Area. When you are done click logout below.");
// Close browser
WebUI.closeBrowser()