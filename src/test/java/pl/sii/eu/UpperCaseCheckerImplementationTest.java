package pl.sii.eu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sii.eu.UpperCaseCheckerImplementation;

/**
 * Test Class for UpperCaseCheckerImplementation
 *
 * @author Michal Korzeniewski
 * @email mickor78@gmail.com
 */
public class UpperCaseCheckerImplementationTest {

    String[] withUpperCaseLetter;
    String[] withoutUpperCaseLetter;
    UpperCaseCheckerImplementation uCCITest;

    @Before
    public void setUp() throws Exception {
        uCCITest = new UpperCaseCheckerImplementation();
        withoutUpperCaseLetter=new String[]{"asbvhsdfauhr2364352","","a","/"};
        withUpperCaseLetter=new String[]{"sadfehfbjdbfjbA","asf3478rAhbdsbhgy437","ASDUHABDHJAGDAISH","A"};
    }

    @Test
    public void hasNotUpperCaseLetters() {
        for (String e:withoutUpperCaseLetter
             ) {
            Assert.assertFalse(uCCITest.hasUpperCaseLetters(e));
        }    }

    @Test
    public void hasUpperCaseLetters(){

        for (String e:withUpperCaseLetter
                ) {
            Assert.assertTrue(uCCITest.hasUpperCaseLetters(e));
        }

    }
}