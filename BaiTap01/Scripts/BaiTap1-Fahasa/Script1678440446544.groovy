import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
'Open Browser'
WebUI.openBrowser('')
'Maximize browser'
WebUI.maximizeWindow()
'Navigate to URL'
WebUI.navigateToUrl('https://www.fahasa.com/customer/account/create')
'Click Dang Nhap tab'
WebUI.click(findTestObject('Object_BT1/Tab_DangNhap'))
'Verify button “Đăng nhập” disabled'
WebUI.verifyElementNotClickable(findTestObject('Object_BT1/btn_DangNhap'))
'Input so dien thoai'
WebUI.setText(findTestObject('Object_BT1/txt_SoDT'), '1425345346')
'Input mat khau'
WebUI.setText(findTestObject('Object_BT1/txt_Password'), 'ThisIsNotAPassword')
'Verify button “Đăng nhập” enabled'
WebUI.verifyElementClickable(findTestObject('Object_BT1/btn_DangNhap'))
'Click Dang Nhap button'
WebUI.click(findTestObject('Object_BT1/btn_DangNhap'))
'Verify the text is displayed'
WebUI.verifyElementText(findTestObject('Object_BT1/lable_ValidateMessage'), 'Số điện thoại/Email hoặc Mật khẩu sai!')
'Take Screenshot'
WebUI.takeScreenshot()
'Close browser'
WebUI.closeBrowser()