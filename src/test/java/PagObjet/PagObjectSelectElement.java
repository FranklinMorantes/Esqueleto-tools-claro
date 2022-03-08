package PagObjet;

import java.io.File;
import java.util.Properties;

import org.testng.annotations.Test;

import MapsObjet.MapObjectElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectSelectElement extends MapObjectElement {

	public PagObjectSelectElement(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	// USAR XPATH PRIMERO DE RESOURCE ID Y LUEGO DE Text
	public void CallPage(File rutaCarpeta, String generarEvidencia, String Correo2, String Password, String Barrio,
			String NumeroPrincipal, String NumeroSecundario, String compu, String numero) throws Exception {

		try {

			tiempoEspera(10000);
			click(btnusucon, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			click(btncorreo, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			sendkey(Correo2, correo, rutaCarpeta, generarEvidencia);
			sendkey(Password, contraseña, rutaCarpeta, generarEvidencia);
			click(btniniciar, rutaCarpeta, generarEvidencia);
			tiempoEspera(6000);
			click(cancelar, rutaCarpeta, generarEvidencia);
			tiempoEspera(6000);

			click(btnPerfil, rutaCarpeta, generarEvidencia);

			tiempoEspera(3000);
			click(btnDatos, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			tiempoEspera(3000);
			click(ActualizarDatos11, rutaCarpeta, generarEvidencia);
			tiempoEspera(3000);

			click(ActualizaDatos, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);

			tiempoEspera(3000);
			click(CambiarDireccion, rutaCarpeta, generarEvidencia);
			tiempoEspera(10000);

			scrollVertical1(rutaCarpeta, 361, 560, 510, 5, generarEvidencia);
			tiempoEspera(3000);

			click(SeleccionDeparta, rutaCarpeta, generarEvidencia);

			tiempoEspera(3000);

			click(City, rutaCarpeta, generarEvidencia);

			tiempoEspera(3000);

			click(SeleccionCiudad, rutaCarpeta, generarEvidencia);
			tiempoEspera(3000);
			scrollVertical1(rutaCarpeta, 362, 1110, 362, 2, generarEvidencia);
			click(City2, rutaCarpeta, generarEvidencia);
			tiempoEspera(3000);

			sendkey(Barrio, barrio, rutaCarpeta, generarEvidencia);
			tiempoEspera(3000);

			click(PrimerTipo, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(Tipo, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			sendkey(NumeroPrincipal, numeroPrincipal, rutaCarpeta, generarEvidencia);
			tiempoEspera(3000);

			click(Sufijo, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(TipoDireccion, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			scrollVertical1(rutaCarpeta, 362, 1110, 362, 1, generarEvidencia);

			sendkey(NumeroSecundario, numeroSecundario, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(MenuSufijoSecundario, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(sufijo2, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			sendkey(compu, Compu, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			driver.hideKeyboard();

			scrollVertical1(rutaCarpeta, 362, 1110, 362, 2, generarEvidencia);
			click(validar, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			click(guardar, rutaCarpeta, generarEvidencia);
			tiempoEspera(14000);
			click(cerrar, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(9000);

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
