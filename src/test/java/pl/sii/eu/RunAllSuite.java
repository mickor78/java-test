package pl.sii.eu;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * run all test Class
 *
 * @author Michal Korzniewski
 * @email mickor78@gmail.com
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ CurrencyConverterImplementationTest.class,DuplicateCheckerImplementationTest.class,CurrencyConverterImplementationTest.class})
public class RunAllSuite {}