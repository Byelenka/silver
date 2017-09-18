import Pages.MainPage;
import org.junit.Test;


public class RozetkaTest {

    @Test
    public void graphicCardTest() {
    	System.setProperty("webdriver.chrome.driver", "d:\\Java\\chromedriver.exe");
        new MainPage()
                .openMainPage()
                .openLaptopsPage()
                .openGraphicCardsPage()
                .checkThatDesiredCardIsPresent();
    }
}
