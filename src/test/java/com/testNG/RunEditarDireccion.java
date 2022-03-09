package com.testNG;

import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import PagObjet.PagObjectCerrarSesion;
import PagObjet.PagObjectDatos;
import PagObjet.PagObjectSelectElement;
import PagObjet.PagObjectTarjeta;
//import PagObjet.PagObjetAlerts;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import org.testng.annotations.AfterClass;

public class RunEditarDireccion

{
	private AppiumDriver<MobileElement> driver;

	PagObjectDatos datos;
	PagObjectTarjeta tarjeta;
	PagObjectCerrarSesion sesion;
	ClaseBase claseBase;
	PagObjectSelectElement element;

	GenerarReportePdf generarReportepdf;
	String Pagos1;
	String valorA;

	@SuppressWarnings("unchecked")
	@BeforeClass
	@Parameters({ "rutaImagenReporte", "rutaOutut", "platformName", "deviceName", "platformVersion", "appPackage",
			"appActivity", "noReset", "autoGrantPermissior" })

	public void beforeClass(String rutaImagenReporte, @Optional("default") String rutaOutut,
			@Optional("default") String platformName, @Optional("default") String deviceName,
			@Optional("default") String platformVersion, @Optional("default") String appPackage,
			@Optional("default") String appActivity, @Optional("default") String noReset,
			@Optional("default") String autoGrantPermissior) {

		driver = ClaseBase.chromeDriverConnection(platformName, deviceName, platformVersion, appPackage, appActivity,
				noReset, autoGrantPermissior);

		claseBase = new ClaseBase(driver);

		generarReportepdf = new GenerarReportePdf();

		datos = new PagObjectDatos(driver);

		tarjeta = new PagObjectTarjeta(driver);

		sesion = new PagObjectCerrarSesion(driver);
		generarReportepdf.setRutaImagen(rutaImagenReporte);

		claseBase.setRutaOutut(rutaOutut, driver);
		
		element = new PagObjectSelectElement(driver);

	}

	

	// TEST CLARO EDITAR DIRECCION
	@Test(dataProvider = "ClaroMobil")
	public void PruebaEditarDireccion(String Ejecutar, String generarEvidencia, String Barrio, String NumeroPrincipal,
			String NumeroSecundario, String compu, String numero, String Correo2, String Password) throws Exception {
		if (Ejecutar.equals("Si")) {
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			
			if (generarEvidencia.contains("Si")) {
				// MyScreenRecorder.startRecording(nomTest, rutaCarpeta);
				// LLAMAR VIDEO DE SOLO LA APP//////////
				claseBase.iniVideo();
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);
				
				element.CallPage(rutaCarpeta, generarEvidencia, Correo2, Password, Barrio, NumeroPrincipal,NumeroSecundario, compu, numero);
				sesion.CerrarSesion(rutaCarpeta, generarEvidencia);
				// FINALIZAR VIDEO DE SOLO LA APP

				// MyScreenRecorder.stopRecording();
				claseBase.finVideo(rutaCarpeta);
				generarReportepdf.cerrarPlantilla();
				
			} else {
				element.CallPage(rutaCarpeta, generarEvidencia, Correo2, Password, Barrio, NumeroPrincipal,NumeroSecundario, compu, numero);
				sesion.CerrarSesion(rutaCarpeta, generarEvidencia);

			}
			assert Pagos1.contains(generarEvidencia);

		}
	}

	@DataProvider(name = "ClaroMobil")
	public Object[][] datos() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja1");

		return arreglo;
	}
	@AfterClass
	public void afterClass() {
		
	}

}
