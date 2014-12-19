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
import org.junit.After;
import org.junit.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

/**
 * This class //TODO ...
 *
 * @author Kuali Rice Team (rice.collab@kuali.org)
 */
public class CoeusAFTBase extends WebDriverLegacyITBase {

    @Override
    protected String getBookmarkUrl() {
        return "http://test.kc.kuali.org/kc-trunk/kc-pd-krad/proposalDevelopment";
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
    public void testCoeusProposalSubmission() {
        driver.get("http://test.kc.kuali.org/kc-trunk/kr-login/login?viewId=DummyLoginView&returnLocation=%2Fkc-krad%2FlandingPage");
        if (!driver.findElement(By.id("Rice-UserName_control")).getAttribute("value").equals("")) {
            System.out.println("verifyElementValue failed");
        }
        driver.findElement(By.id("Rice-UserName_control")).click();
        driver.findElement(By.id("Rice-UserName_control")).clear();
        driver.findElement(By.id("Rice-UserName_control")).sendKeys("quickstart");
        driver.findElement(By.id("Rice-LoginButton")).click();
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
        driver.findElement(By.id("u1vekua8_control")).click();
        driver.findElement(By.linkText("6")).click();
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
    public void testCoeusProposalQuestionnaire() {
        driver.get("http://test.kc.kuali.org/kc-trunk/kr-login/login?viewId=DummyLoginView&returnLocation=%2Fkc-krad%2FlandingPage");
        if (!driver.findElement(By.id("Rice-UserName_control")).getAttribute("value").equals("")) {
            System.out.println("verifyElementValue failed");
        }
        driver.findElement(By.id("Rice-UserName_control")).click();
        driver.findElement(By.id("Rice-UserName_control")).clear();
        driver.findElement(By.id("Rice-UserName_control")).sendKeys("quickstart");
        driver.findElement(By.id("Rice-LoginButton")).click();
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
        driver.findElement(By.id("u1vekua8_control")).click();
        driver.findElement(By.linkText("6")).click();
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
