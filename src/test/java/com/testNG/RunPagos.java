package com.testNG;

import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import PagObjet.PagObjectCerrarSesion;
import PagObjet.PagObjectDatos;
import PagObjet.PagObjectSelectElement;
import PagObjet.PagObjectSesion;
import PagObjet.PagObjectTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;

import org.testng.annotations.AfterClass;

public class RunPagos

{

	private AppiumDriver<MobileElement> driver;

	PagObjectDatos datos;
	PagObjectTarjeta tarjeta;
	PagObjectCerrarSesion sesion;
	ClaseBase claseBase;
	PagObjectSelectElement element;

	PagObjectSesion cierrapagos;
	// By txtBusquedaGoogle = By.name("q");
	File rutaCarpeta = null;
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

		cierrapagos = new PagObjectSesion(driver);

		generarReportepdf.setRutaImagen(rutaImagenReporte);

		claseBase.setRutaOutut(rutaOutut, driver);

		element = new PagObjectSelectElement(driver);

	}
/////// TEST PAGOS/////////////////////////////////////////////////////////////////////////77
	@Test(dataProvider = "Pagos")

	public void Pagos(String Ejecutar1, String generarEvidencia, String Correo2, String Password, String Tarjeta,
			String codigoSeguridad, String nombreTarjeta, String numeroDocumento, String telefono) throws Exception {
		if (Ejecutar1.equals("Si")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			if (generarEvidencia.contains("Si")) {
				//MyScreenRecorder.startRecording(nomTest, rutaCarpeta);
				claseBase.iniVideo();
				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);
				tarjeta.Tarjeta(rutaCarpeta,generarEvidencia,Correo2, Password, Tarjeta, codigoSeguridad,nombreTarjeta, telefono, numeroDocumento);
				cierrapagos.CerrarPagos(rutaCarpeta, generarEvidencia);
				//MyScreenRecorder.stopRecording();
				claseBase.finVideo(rutaCarpeta);
				generarReportepdf.cerrarPlantilla();
			} else {
				tarjeta.Tarjeta(rutaCarpeta, generarEvidencia,Correo2, Password, Tarjeta, codigoSeguridad,
						nombreTarjeta, telefono, numeroDocumento);
				cierrapagos.CerrarPagos(rutaCarpeta, generarEvidencia);
			}
			assert Pagos1.contains(generarEvidencia);

		}

	}

	@DataProvider(name = "Pagos")

	public Object[][] datos9() throws Exception {

		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja2");
		return arreglo;

	}

	@AfterClass
	public void afterClass() {
	}

}
