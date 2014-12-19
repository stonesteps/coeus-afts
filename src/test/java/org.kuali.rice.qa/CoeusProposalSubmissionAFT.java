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
        return "http://test.kc.kuali.org/kc-trunk/kc-pd-krad/proposalDevelopment";
    }

    @Override
    protected String getTestUrl() {
        return getBookmarkUrl();
    }

    /**
    FirefoxDriver wd;

    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

     **/

    @Test
    public void testCoeusProposalSubmission() throws Exception {

        loginToCoeus();

        createNewProposal();

//        driver.findElement(By.linkText("Key Personnel")).click();
        driver.findElement(By.id("u1sp7yfb")).click();

        driver.findElement(By.id("u3s0ej9")).click();
        driver.findElement(By.id("u18fzd9v")).click();
        driver.findElement(By.id("u1qkpp09_control")).click();
        driver.findElement(By.id("u1qkpp09_control")).clear();
        driver.findElement(By.id("u1qkpp09_control")).sendKeys("Test");
        driver.findElement(By.id("u1qkpp14_control")).click();
        driver.findElement(By.id("u1qkpp14_control")).clear();
        driver.findElement(By.id("u1qkpp14_control")).sendKeys("Case");
        driver.findElement(By.id("u12t9ac8")).click();
        driver.findElement(By.id("umbmkeu")).click();
        driver.findElement(By.id("u1qkpp09_control")).click();
        driver.findElement(By.id("u1qkpp09_control")).clear();
        driver.findElement(By.id("u1qkpp09_control")).sendKeys("McGregor");
        driver.findElement(By.id("u1qkpp14_control")).click();
        driver.findElement(By.id("u1qkpp14_control")).clear();
        driver.findElement(By.id("u1qkpp14_control")).sendKeys();
        driver.findElement(By.id("u12t9ac8")).click();
        if (!driver.findElement(By.id("uei20s7_line0_control_0")).isSelected()) {
            driver.findElement(By.id("uei20s7_line0_control_0")).click();
        }
        driver.findElement(By.id("umbmkdz")).click();
        driver.findElement(By.id("u5tzufq")).click();
        driver.findElement(By.id("u5cdh81_line0_tab")).click();
        driver.findElement(By.id("u5cdh8w_line0_tab")).click();
        driver.findElement(By.id("ucy88fl_line0_tab")).click();
        driver.findElement(By.id("u79gej4")).click();
        driver.findElement(By.id("ua9nlo4")).click();
        if (!driver.findElement(By.xpath("//div[@id='u9oz9zx']/select//option[3]")).isSelected()) {
            driver.findElement(By.xpath("//div[@id='u9oz9zx']/select//option[3]")).click();
        }
        driver.findElement(By.id("u9oza6t_control")).click();
        driver.findElement(By.id("PropDev-AttachmentsPage-ProposalDetails_headerWrapper")).click();
        driver.findElement(By.id("u15fk2ps")).click();
        driver.findElement(By.linkText("Questionnaire")).click();
        if (!driver.findElement(By.id("u1ioairb_line0_line0_control_0")).isSelected()) {
            driver.findElement(By.id("u1ioairb_line0_line0_control_0")).click();
        }
        if (!driver.findElement(By.id("u1ioairb_line0_line1_control_1")).isSelected()) {
            driver.findElement(By.id("u1ioairb_line0_line1_control_1")).click();
        }
        if (!driver.findElement(By.id("u1ioairb_line0_line2_control_0")).isSelected()) {
            driver.findElement(By.id("u1ioairb_line0_line2_control_0")).click();
        }
        driver.findElement(By.id("u1ioairb_line0_line3_control")).click();
        driver.findElement(By.id("u1ioairb_line0_line3_control")).clear();
        driver.findElement(By.id("u1ioairb_line0_line3_control")).sendKeys("dev");
        driver.findElement(By.id("u1ioairb_line1_line3_control")).click();
        driver.findElement(By.id("u1ioairb_line1_line3_control")).clear();
        driver.findElement(By.id("u1ioairb_line1_line3_control")).sendKeys("dev2");
        driver.findElement(By.id("u1ioairb_line2_line3_control")).click();
        driver.findElement(By.id("u1ioairb_line2_line3_control")).clear();
        driver.findElement(By.id("u1ioairb_line2_line3_control")).sendKeys("dev4");
        driver.findElement(By.id("u79geku")).click();
        driver.findElement(By.id("urt8t1s")).click();
        driver.findElement(By.id("urtfxo9_control")).click();
        driver.findElement(By.id("urtfxo9_control")).clear();
        driver.findElement(By.id("urtfxo9_control")).sendKeys("bugged");
        if (!driver.findElement(By.id("urtfxp4_control_1")).isSelected()) {
            driver.findElement(By.id("urtfxp4_control_1")).click();
        }
        driver.findElement(By.id("u1gbbji2")).click();
        driver.findElement(By.id("u3t19ry_line0")).click();
        driver.findElement(By.id("uk9ittf_line0_control")).click();
        driver.findElement(By.id("uk9ittf_line0_control")).clear();
        driver.findElement(By.id("uk9ittf_line0_control")).sendKeys("1");
        driver.findElement(By.id("uk9itua_line0_control")).click();
        driver.findElement(By.id("uk9itua_line0_control")).click();
        driver.findElement(By.id("uk9itua_line0_control")).clear();
        driver.findElement(By.id("uk9itua_line0_control")).sendKeys("1.00");
        driver.findElement(By.id("uk9itv5_line0_control")).click();
        driver.findElement(By.id("u3t19q8_line0")).click();
        driver.findElement(By.id("u15ecnqt")).click();
        driver.navigate().back();
        driver.findElement(By.id("u15ecnsj")).click();
        driver.findElement(By.id("u79gefo")).click();
        driver.findElement(By.linkText("Summary/Submit")).click();
        driver.findElement(By.id("uj31ctp")).click();
        driver.findElement(By.id("ulv0h4q")).click();
        driver.findElement(By.id("u2ufdnb")).click();
        driver.findElement(By.id("PropDev-SubmitPage")).click();
        driver.findElement(By.id("uj31ctp")).click();
        driver.findElement(By.id("u2ufdnb")).click();
    }

    @Test
    public void testCoeusProposalQuestionnaire() throws Exception {
        loginToCoeus();

        createNewProposal();

//      Choose Questionnaire tab
        driver.findElement(By.id("u79gejz")).click();

        waitForTextPresent("Generic Demo Questionnaire");
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