package pl.sii.eu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static pl.sii.eu.model.Currency.EUR;
import static pl.sii.eu.model.Currency.PLN;


/**
 * test of  pl.sii.eu.CurrencyConverterImplementation
 *
 * @author Michal Korzniewski
 * @email mickor78@gmail.com
 */
public class CurrencyConverterImplementationTest {

    private CurrencyConverterImplementation CCITest = new CurrencyConverterImplementation();
    private Amount inPLN;
    private Amount inEUR;
    private Amount test;
    private long[] tableEUR;
    private long[] tablePLN;

    @Before
    public void setUp() throws Exception {
        tablePLN = new long[]{4252,42518,0,850};
        tableEUR = new long[]{1000,10000,0,200};
    }

    @Test
    public void convertToPln() {
        for (int i = 0; i < tableEUR.length; i++) {
            inEUR = new Amount(tableEUR[i], EUR);
            test = CCITest.convertToPln(inEUR);
            inPLN = new Amount(tablePLN[i], PLN);
            Assert.assertEquals(inPLN.getValue(),test.getValue());
        }

    }

    @Test
    public void convertCurrToCurr(){
        for (int i = 0; i < tablePLN.length; i++) {
            inPLN = new Amount(tablePLN[i], PLN);
            test = CCITest.convertToPln(inPLN);
            Assert.assertEquals(inPLN.getValue(),test.getValue());
        }

    }

    @Test
    public void convertToEur() {
        for (int i = 0; i < tablePLN.length; i++) {
            inPLN = new Amount(tablePLN[i], PLN);
            inEUR = new Amount(tableEUR[i], EUR);
            test = CCITest.convertToEur(inPLN);
            Assert.assertEquals(inEUR.getValue(),test.getValue());
        }
    }

    @Test
    public void isCurrencyTheSame(){
        inPLN=new Amount(100,PLN);
        Assert.assertFalse(CCITest.isCurencyTheSame(inPLN,EUR));
        Assert.assertTrue(CCITest.isCurencyTheSame(inPLN,PLN));

    }
}