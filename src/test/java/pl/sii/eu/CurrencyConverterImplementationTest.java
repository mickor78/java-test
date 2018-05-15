package pl.sii.eu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static org.junit.Assert.*;

public class CurrencyConverterImplementationTest {

    CurrencyConverterImplementation CCITest = new CurrencyConverterImplementation();
    Amount inPLN;
    Amount inEUR;

    @Before
    public void setUp() throws Exception {
        inPLN = new Amount(10000, Currency.PLN);
        inEUR = new Amount(42518,Currency.EUR);
    }

    @Test
    public void convertToPln() {
        Amount test = CCITest.convertToPln(inEUR);
        System.out.println(test.getValue()+" "+inPLN.getValue());
        Assert.assertEquals(inPLN.getValue(),test.getValue());
    }

    @Test
    public void convertToEur() {
        Amount test = CCITest.convertToEur(inPLN);
        System.out.println(test.getValue()+" "+inEUR.getValue());
        Assert.assertEquals(inEUR.getValue(),test.getValue());
    }
}