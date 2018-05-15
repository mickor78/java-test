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

    String[] withUpperCaseLetter=new String[3];
    String withoutUpperCaseLetter;
    UpperCaseCheckerImplementation uCCITest;

    @Before
    public void setUp() throws Exception {
        uCCITest = new UpperCaseCheckerImplementation();
        withoutUpperCaseLetter="asbvhsdfauhr2364352";
        withUpperCaseLetter[0]="sadfehfbjdbfjbA";
        withUpperCaseLetter[1]="asf3478rAhbdsbhgy437";
        withUpperCaseLetter[2]="ASDUHABDHJAGDAISH";
    }

    @Test
    public void hasNotUpperCaseLetters() {
        Assert.assertFalse(uCCITest.hasUpperCaseLetters(withoutUpperCaseLetter));
    }

    @Test
    public void hasUpperCaseLetters(){

        for (String e:withUpperCaseLetter
                ) {
            Assert.assertTrue(uCCITest.hasUpperCaseLetters(e));
        }

    }
}