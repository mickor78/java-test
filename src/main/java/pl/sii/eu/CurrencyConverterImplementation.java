package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static pl.sii.eu.model.Currency.EUR;
import static pl.sii.eu.model.Currency.PLN;


/**
 * Implementation of CurrencyConverter interface
 *
 * @author Michal Korzeniewski
 * @email mickor78@gmail.com
 */
public class CurrencyConverterImplementation implements CurrencyConverter {


    /**
     * Overrited method converts EUR to PLN
     *
     * @param euroAmount
     * @return Amount plnAmount
     */
    @Override
    public Amount convertToPln(Amount euroAmount) {

        //if euroAmount is PLN actually, return the same variable
        if(isCurencyTheSame(euroAmount, PLN)) return euroAmount;


        Amount plnAmount;
        long euroAmountValue = euroAmount.getValue();
        long plnAmountValue = (long) Math.round(euroAmountValue * EURO_TO_PLN_RATIO);

        plnAmount = new Amount(plnAmountValue, PLN);
        return plnAmount;
    }


    /**
     * Overrited method converts PLN to EUR
     *
     * @param plnAmount
     * @return Amount eurAmount
     */
    @Override
    public Amount convertToEur(Amount plnAmount) {
        //if plnAmount is EUR actually return the same variable
        if(isCurencyTheSame(plnAmount,EUR)) return plnAmount;

        Amount euroAmount;
        long plnAmountValue = plnAmount.getValue();
        long euroAmountValue = (long) Math.round(plnAmountValue / EURO_TO_PLN_RATIO);

        euroAmount = new Amount(euroAmountValue, EUR);
        return euroAmount;
    }


    /**
     * Method return true if currency of currencyAmount is equal to currency parameter
     *
     * @param currencyAmount
     * @param currency
     * @return boolean
     */
    public boolean isCurencyTheSame(Amount currencyAmount, Currency currency) {

        Amount isCurrencyAmount = new Amount(currencyAmount.getValue(), currency);

        if ((isCurrencyAmount.hashCode() == currencyAmount.hashCode())) return true;
        else return false;
    }
}