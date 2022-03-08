package PagObjet;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import MapsObjet.MapObjectCerrarSesion;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagObjectCerrarSesion extends MapObjectCerrarSesion

{
	
	
	public PagObjectCerrarSesion(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver =  driver;
	}
	
	
	
	public String CerrarSesion (File rutaCarpeta,String generarEvidencia) throws Exception
	{
		
		try { 
			
			tiempoEspera(3000);
			click(btnPerfilEnd,rutaCarpeta,generarEvidencia);
			
			//scrollVertical1(rutaCarpeta,444,612,501, 2,generarEvidencia);
			tiempoEspera(2000);
			click(Close,rutaCarpeta,generarEvidencia);
			tiempoEspera(2000);
			click(GreatFinale,rutaCarpeta,generarEvidencia);
			tiempoEspera(5000);
			
		
		
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		String valor = capturarValorSelenium(resultado);
		return valor;

		
	} 
	
	
	
	
	
  @Test
  public void f() {
  }
}
