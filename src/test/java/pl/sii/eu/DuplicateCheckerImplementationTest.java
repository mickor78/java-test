package pl.sii.eu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * test of  pl.sii.eu.DuplicateCheckerImplementation
 *
 * @author Michal Korzniewski
 * @email mickor78@gmail.com
 */
public class DuplicateCheckerImplementationTest {

    private String [] withDuplicateString;
    private String [] withoutDuplicateString;
    private DuplicateCheckerImplementation DCITest;

    @Before
    public void setUp() throws Exception {
        DCITest = new DuplicateCheckerImplementation();
        withoutDuplicateString = new String[]{"sadwertgfdvxasr","","* *","1238da","aA","1"};
        withDuplicateString =new String[]{"sadfehhfbjdbfjbA","aaaaaaa","AAAAsddsdsdsd","sdad11dsd","A   ss      pod1234","//    dsa"," ** "};
    }


    @Test
    public void hasDuplicateCharacters() {
        for (String e:withDuplicateString
             ) {
            Assert.assertTrue(DCITest.hasDuplicateCharacters(e));
        }
    }

    @Test
    public void hasNotDuplicateCharacters(){
        for (String e:withoutDuplicateString
             ) {
            Assert.assertFalse(DCITest.hasDuplicateCharacters(e));
        }
    }
}