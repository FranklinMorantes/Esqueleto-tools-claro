package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapObjectCerrarPagos extends ClaseBase 
{
	
	public MapObjectCerrarPagos(AppiumDriver<MobileElement> driver) 
	{
		super(driver);
		this.driver = driver;

	}
	
	
		protected By resultado = By.xpath("//android.widget.TextView[@text = '¡Hola!']");
	
	
	
		protected By btnPerfilEnd = By.xpath("//android.widget.ImageView[@resource-id = 'com.clarocolombia.miclaro.debug:id/imgPerfil']");
		
		protected By GreatFinale = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");
		
		protected By Close = By.xpath("//android.widget.TextView[@text='Cerrar Sesión']");
		
		
  @Test
  public void f() {
  }
}
