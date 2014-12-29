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

import org.kuali.rice.testtools.selenium.WebDriverLegacyITBase;
import org.kuali.rice.testtools.selenium.WebDriverAftBase;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

/**
 * This class //TODO ...
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
public class CoeusProposalSubmissionAFT  extends CoeusAFTBase {

    @Override
    protected String getBookmarkUrl() {
        return "http://test.kc.kuali.org/kc-trunk/kc-krad/landingPage?methodToCall=start";
    }

    @Override
    protected String getTestUrl() {
        return getBookmarkUrl();
    }

    /**
     * Exercises KC Proposal Development screens for performance analysis purposes.
     * Repeat the following steps 3 times.
     *
     * Steps:
     * http://test.kc.kuali.org/kc-trunk/kc-krad/landingPage?methodToCall=start
     * 1) Top header: Researcher->Create Proposal. Fill in required fields (only Sponsor field requires valid data; type 1 for suggestion) -> Save and Continue.
     * 2) Left menu: Questionnaire.
     * 3) Header: Data Validation.
     * 4) Data Validation -> Turn On.
     * 5) Left menu: Key Personnel -> Personnel -> Add Personnel.
     * 6) Perform search.
     * 7) Select first (default) option -> Continue.
     * 8) Select first (default) option -> Add Person
     */
    @Test
    public void testCoeusProposalPerformance() throws Exception {
        loginToCoeus();

        for (int count=0; count<3; count++){

            createNewProposal();

//          Choose Questionnaire tab
            driver.findElement(By.id("u79gejz")).click();

            waitForTextPresent("Generic Demo Questionnaire");

//          Set Data Validation On
            driver.findElement(By.id("u19btjw4")).click();
            waitForTextPresent("Data Validation is currently off");
            driver.findElement(By.id("u5rzhdu")).click();
            driver.findElement(By.id("utu858d")).click();

//          Key Personnel
            driver.findElement(By.id("u1sp7yfb")).click();
            driver.findElement(By.id("u3s0ej9")).click();
            driver.findElement(By.id("u18fzd9v")).click();
            driver.findElement(By.id("u9iouos")).click();
            driver.findElement(By.id("uouorvl_line98_control_0")).click();
            driver.findElement(By.id("u1s266pn")).click();
            driver.findElement(By.id("u1bkjgre")).click();
            driver.findElement(By.id("u8f37v6")).click();
        }

        passed();
    }


    public void loginSuccessfully() throws Exception {

    }

    public void navigateToNewProposal() {

    }

    public void completeInitialProposalDetailsSuccessfully(){

    }

    public void completeProposalAddNewPresenter() {

    }

    public void completeProposalAddNew() {

    }



    @After
    public void tearDown() {
        driver.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            //driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
