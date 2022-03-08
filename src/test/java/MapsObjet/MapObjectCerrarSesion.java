package MapsObjet;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MapObjectCerrarSesion extends ClaseBase {

	public MapObjectCerrarSesion(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;

	}

	protected By resultado = By.xpath("//android.widget.TextView[@text = '¡Hola!']");

	protected By btnPerfilEnd = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]");
	
	protected By GreatFinale = By.xpath("//android.widget.Button[@resource-id='com.clarocolombia.miclaro.debug:id/btn_aceptar']");

	protected By Close = By.xpath("//android.widget.TextView[@text='Cerrar Sesión']");

	@Test
	public void f() {
	}
}
