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

//Open the browser and go to the webpage
WebUI.openBrowser('https://docs.google.com/forms/d/e/1FAIpQLSdDgXY8YQMs2ogVEOTfPqV3u_65a_impOoXqXWRRlMQHzdTGQ/viewform')

//Maximize the browser
WebUI.maximizeWindow()

//Create funtion to select among test objects a random option then click that option.
String selectRandomOption(List<String> options) {
	Random rand = new Random()
	String randomPath = options.get(rand.nextInt(options.size()))
	WebUI.click(findTestObject(randomPath))
	return randomPath
}
//---------------------------------------------------------------------------------------------------------
//Question 1
//Call the funtion to select a random object.
selectRandomOption(Arrays.asList('Formulario/Pregunta1/Opcion1', 'Formulario/Pregunta1/Opcion2', 'Formulario/Pregunta1/Opcion3', 
    'Formulario/Pregunta1/Opcion4', 'Formulario/Pregunta1/Opcion5', 'Formulario/Pregunta1/Opcion6', 'Formulario/Pregunta1/Opcion7'));

//-----------------------------------------------------------------------------------------------------------
//PREGUNTA 2
//Call the funtion to select a random object.
selectRandomOption(Arrays.asList('Formulario/Pregunta2/Opcion1', 'Formulario/Pregunta2/Opcion2', 'Formulario/Pregunta2/Opcion3'));

//-----------------------------------------------------------------------------------------------------------
//PREGUNTA 3
//Click on textbox and select a random option then type it.
WebUI.click(findTestObject('Formulario/pregunta3/textbox'))

List<String> sector = Arrays.asList('Almirante', 'Zona Colonial', 'Almarosa', 'San Isidro', 'Bella Vista', 'Boca Chica', 
    'Pintura', 'Pantoja', 'Los girasoles', 'Piantini')

Random rand3 = new Random()
String randomPath3 = sector.get(rand3.nextInt(sector.size()))

WebUI.setText(findTestObject('Formulario/pregunta3/textbox'), randomPath3)
//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 4
//save the value of the variable and call the funtion to select a random object.
String x = selectRandomOption(Arrays.asList('Formulario/Pregunta4/Opcion1', 'Formulario/Pregunta4/Opcion2'));

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 5
//method to verify the value of the variable and call the funtion to select a random object.
if (x == 'Formulario/Pregunta4/Opcion1') {
    selectRandomOption(Arrays.asList('Formulario/Pregunta5/Opcion1', 'Formulario/Pregunta5/Opcion2', 'Formulario/Pregunta5/Opcion3', 'Formulario/Pregunta5/Opcion4'));
}

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 6
//method to verify the value of the variable and call the funtion to select a random object.
if (x == 'Formulario/Pregunta4/Opcion1') {
    String y =selectRandomOption(Arrays.asList('Formulario/Pregunta6/Opcion1', 'Formulario/Pregunta6/Opcion2', 'Formulario/Pregunta6/Opcion3'));

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 7
//method to verify the value of the variable and call the funtion to select a random object.
if ((y == 'Formulario/Pregunta6/Opcion2') || (y == 'Formulario/Pregunta6/Opcion3')) {
        selectRandomOption(Arrays.asList('Formulario/Pregunta7/Opcion1', 'Formulario/Pregunta7/Opcion2', 'Formulario/Pregunta7/Opcion3', 'Formulario/Pregunta7/Opcion4'));
    }}
else{
    WebUI.click(findTestObject('Formulario/Pregunta6/Opcion4'))
}

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 8
//Call the funtion and select a random object.
selectRandomOption(Arrays.asList('Formulario/Pregunta8/Opcion1', 'Formulario/Pregunta8/Opcion2', 'Formulario/Pregunta8/Opcion3', 
    'Formulario/Pregunta8/Opcion4'));

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 10
//Call the funtion and select a random object.
selectRandomOption(Arrays.asList('Formulario/Pregunta10/Opcion1', 'Formulario/Pregunta10/Opcion2', 'Formulario/Pregunta10/Opcion3', 
    'Formulario/Pregunta10/Opcion4', 'Formulario/Pregunta10/Opcion5'));

//-------------------------------------------------------------------------------------------------------------
//PREGUNTA 11
//Call the funtion and select a random object.
selectRandomOption(Arrays.asList('Formulario/Pregunta11/Opcion1', 'Formulario/Pregunta11/Opcion2', 'Formulario/Pregunta11/Opcion3', 
    'Formulario/Pregunta11/Opcion4'));

//--------------------------------------------------------------------------------------------------------------

//Press the button "Enviar"
WebUI.click(findTestObject('Formulario/BotonEnviar'))

//Wait 5 seconds for the page to load
WebUI.waitForPageLoad(5)

// Close the browser
WebUI.closeBrowser()

