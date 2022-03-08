package PagObjet;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapObjectTarjeta;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectTarjeta extends MapObjectTarjeta {

	public PagObjectTarjeta(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}

	public void Tarjeta(File rutaCarpeta,String generarEvidencia, String Correo2,  String Password, String Tarjeta,
			String codigoSeguridad, String nombreTarjeta, String telefono, String numeroDocumento) throws Exception {

		try {

			tiempoEspera(10000);
			click(btnusucon, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			click(btncorreo, rutaCarpeta, generarEvidencia);
			tiempoEspera(1000);
			sendkey(Correo2, correo, rutaCarpeta, generarEvidencia);
			sendkey(Password, contraseña, rutaCarpeta, generarEvidencia);
			click(btniniciar, rutaCarpeta, generarEvidencia);
			tiempoEspera(5000);
			click(cancelar, rutaCarpeta, generarEvidencia);
			tiempoEspera(4000);

			click(btnPago, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			scrollVertical1(rutaCarpeta, 492, 771, 660, 2, generarEvidencia);

			click(btnPagaAqui, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			
			click(btnPagar, rutaCarpeta, generarEvidencia);
			tiempoEspera(12000);
			tocarPantalla(560, 1760);
			scrollVertical1(rutaCarpeta, 492, 1071, 660, 4, generarEvidencia);
			tiempoEspera(2000);
			tocarPantalla(560, 790);
			//click(btnTarjetaDeCredito, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			tocarPantalla(560, 1274);
			//click(btnContinuar, rutaCarpeta, generarEvidencia);
			tiempoEspera(9000);
		
			scrollVertical1(rutaCarpeta, 492, 1071, 660, 4, generarEvidencia);
			//scrollVertical1(rutaCarpeta, 414, 519, 402, 10, generarEvidencia);
			tiempoEspera(2000);	
			

			click(GoBack, rutaCarpeta, generarEvidencia);
			
			tiempoEspera(9000);

			
			/*
			sendkey(Tarjeta, NumberOfPlastic, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(btnMesVencido, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(Mes4, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);
			//

			click(YearSelected, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(OneYear, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			sendkey(codigoSeguridad, SecuCode, rutaCarpeta, generarEvidencia);
			tiempoEspera(4000);

			scrollVertical1(rutaCarpeta, 444, 612, 590, 5, generarEvidencia);
			tiempoEspera(4000);

		
			click(MenuCuotas, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(SeleccionCuotas, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			scrollVertical1(rutaCarpeta, 444, 612, 501, 8, generarEvidencia);
			tiempoEspera(2000);

			sendkey(nombreTarjeta, NombreYapellidoTarjeta, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(TipoDocumento, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(DocumentoSeleccionado, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			sendkey(numeroDocumento, NumberDocument, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			sendkey(telefono, Telefono, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			scrollVertical1(rutaCarpeta, 444, 612, 501, 1, generarEvidencia);
			tiempoEspera(2000);

			sendkey(Correo2, Mail, rutaCarpeta, generarEvidencia);

			scrollVertical1(rutaCarpeta, 444, 612, 501, 3, generarEvidencia);
			tiempoEspera(2000);

			click(btnCancelarTarjeta, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(GoBack, rutaCarpeta, generarEvidencia);
			tiempoEspera(2000);

			click(btnPerfilEnd, rutaCarpeta, generarEvidencia);

			scrollVertical1(rutaCarpeta, 444, 612, 501, 2, generarEvidencia);
			click(GreatFinale, rutaCarpeta, generarEvidencia);

			click(Close, rutaCarpeta, generarEvidencia);
			*/
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

	
}
