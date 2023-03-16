import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
/**
     * Convert code RGBA to Hexa
     * @param backgroundColor
     * @return
     */
public static String convertRGBAToHex(String backgroundColor) 
{ String[] hexValue = backgroundColor.split("[, rgba()]+")
	int hexValue1 = Integer.valueOf(hexValue[1])
	int hexValue2 = Integer.valueOf(hexValue[2])
	int hexValue3 = Integer.valueOf(hexValue[3])
	String result = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3)
	return result
}

'Open Browser'
WebUI.openBrowser('')
WebUI.navigateToUrl('https://atlassian.design/components/tooltip/examples')
'Maximize browser'
WebUI.maximizeWindow()
// Hover orver
WebUI.mouseOver(findTestObject('Object Repository/Object_BT4/btn_Hover'))
// Get Backgroundcolor when hover

String Backgroundcolor = WebUI.getCSSValue(findTestObject('Object Repository/Object_BT4/btn_Hover'),'background')
String hexbackgroundcolorwhenhover = convertRGBAToHex(Backgroundcolor)
println("background-after when hover: " + hexbackgroundcolorwhenhover)

//verify tooltip
WebUI.verifyElementText(findTestObject('Object Repository/Object_BT4/txt_Helloworld'),"Hello World")
// Get Backgroundcolor after hover
String backgroundColorAfterHover = WebUI.getCSSValue(findTestObject('Object Repository/Object_BT4/btn_Hover'),'background')
String hexbackgroundcolorafterhover = convertRGBAToHex(backgroundColorAfterHover)
// Get Backgroundcolor when hover
println("background-after after hover: " + hexbackgroundcolorafterhover)

//Verify backgroundcolorwhenhover: HEX #0065ff
WebUI.verifyEqual(hexbackgroundcolorwhenhover,'#0055cc')
//Verify backgroundcolorafterhover HEX #0052cc
WebUI.verifyEqual(hexbackgroundcolorafterhover,'#0055cc')

// Close browser
WebUI.closeBrowser()

