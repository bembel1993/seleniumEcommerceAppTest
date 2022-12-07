package bva.design.designpages;

import bva.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected static WebDriver getDriver() {
        return Driver.getDriver();
    }
}
