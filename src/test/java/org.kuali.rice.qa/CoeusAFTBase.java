/**
 * Copyright 2005-2014 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.rice.qa;

import org.junit.After;
import org.junit.Test;
import org.kuali.rice.testtools.selenium.WebDriverLegacyITBase;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class //TODO ...
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
public abstract class CoeusAFTBase extends WebDriverLegacyITBase {


    protected void loginToCoeus() throws Exception {
        driver.get("http://test.kc.kuali.org/kc-trunk/kr-login/login?viewId=DummyLoginView&returnLocation=%2Fkc-krad%2FlandingPage");
        if (!driver.findElement(By.id("Rice-UserName_control")).getAttribute("value").equals("")) {
            System.out.println("verifyElementValue failed");
        }
        driver.findElement(By.id("Rice-UserName_control")).click();
        driver.findElement(By.id("Rice-UserName_control")).clear();
        driver.findElement(By.id("Rice-UserName_control")).sendKeys("quickstart");
        driver.findElement(By.id("Rice-LoginButton")).click();
    }

    protected void createNewProposal() throws Exception {
        driver.findElement(By.linkText("RESEARCHER")).click();
        driver.findElement(By.id("u1fvw5sj")).click();
        if (!driver.findElement(By.xpath("//div[@id='uk9itqu']/select//option[3]")).isSelected()) {
            driver.findElement(By.xpath("//div[@id='uk9itqu']/select//option[3]")).click();
        }
        if (!driver.findElement(By.xpath("//div[@id='uk9itrp']/select//option[2]")).isSelected()) {
            driver.findElement(By.xpath("//div[@id='uk9itrp']/select//option[2]")).click();
        }
        if (!driver.findElement(By.xpath("//div[@id='uk9itsk']/select//option[6]")).isSelected()) {
            driver.findElement(By.xpath("//div[@id='uk9itsk']/select//option[6]")).click();
        }
        waitAndTypeByName("document.developmentProposal.requestedStartDateInitial","12/05/14");
//        driver.findElement(By.id("u1vekua8_control")).click();
//        driver.findElement(By.linkText("6")).click();
        driver.findElement(By.id("u1vekub3_control")).click();
        driver.findElement(By.linkText("Next")).click();
        driver.findElement(By.linkText("Next")).click();
        driver.findElement(By.linkText("Next")).click();
        driver.findElement(By.linkText("14")).click();
        driver.findElement(By.id("uk9itua_control")).click();
        driver.findElement(By.id("uk9itua_control")).clear();
        driver.findElement(By.id("uk9itua_control")).sendKeys("test project");
        driver.findElement(By.id("uk9itv5_control")).click();
        driver.findElement(By.id("uk9itv5_control")).clear();
        driver.findElement(By.id("uk9itv5_control")).sendKeys("002020");
        driver.findElement(By.id("ui-id-2")).click();
        driver.findElement(By.id("ufuknm4")).click();
    }

}
