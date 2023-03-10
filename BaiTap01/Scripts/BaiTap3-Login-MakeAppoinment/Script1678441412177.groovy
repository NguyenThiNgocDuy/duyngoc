import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Open Browser'
WebUI.openBrowser('')
'Maximize browser'
WebUI.maximizeWindow()
'Navigate to URL'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')
// Input username
WebUI.setText(findTestObject('Object Repository/Object_BT3/txt_Username3'), 'John Doe');
// Input password
WebUI.setText(findTestObject('Object Repository/Object_BT3/txt_Password3'), 'ThisIsNotAPassword')
// Dang Nhap
WebUI.click(findTestObject('Object Repository/Object_BT3/btn_DangNhap3'));
// Verify dang nhap successful
WebUI.verifyElementText(findTestObject('Object Repository/Object_BT3/btn_BookAppoinment'), "Book Appointment");
WebUI.closeBrowser()

