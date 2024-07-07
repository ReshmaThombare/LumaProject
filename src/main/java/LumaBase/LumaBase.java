package LumaBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class LumaBase
{
    public static WebDriver driver;
    public static Properties prop;

    public void setup()
    {
        loadProperties();
        driver=new ChromeDriver();
        driver.get(prop.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void loadProperties() {
        String path = "./src\\main\\java\\config.properties";
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            try {
                prop.load(fis);
            } catch (IOException e) {
                System.out.println("unable to read config file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("config file not found ");
        }


    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        LumaBase.driver = driver;
    }

    public static Properties getProp() {
        return prop;
    }

    public static void setProp(Properties prop) {
        LumaBase.prop = prop;
    }

    public void tearDown()
    {
        driver.quit();
    }

}
