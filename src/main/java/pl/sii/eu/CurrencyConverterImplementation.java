package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static pl.sii.eu.model.Currency.*;

public class CurrencyConverterImplementation implements CurrencyConverter {

    @Override
    public Amount convertToPln(Amount euroAmount) {

        if(isCurencyTheSame(euroAmount, PLN)) return euroAmount;


        Amount plnAmount;
        long euroAmountValue = euroAmount.getValue();
        long plnAmountValue = (long) Math.round(euroAmountValue / EURO_TO_PLN_RATIO);

        plnAmount = new Amount(plnAmountValue, PLN);
        return plnAmount;
    }


    @Override
    public Amount convertToEur(Amount plnAmount) {
        if(isCurencyTheSame(plnAmount,EUR)) return plnAmount;

        Amount euroAmount;
        long plnAmountValue = plnAmount.getValue();
        long euroAmountValue = (long) Math.round(plnAmountValue * EURO_TO_PLN_RATIO);

        euroAmount = new Amount(euroAmountValue, EUR);
        return euroAmount;
    }


    public boolean isCurencyTheSame(Amount currencyAmount, Currency currency) {

        Amount isCurrencyAmount = new Amount(currencyAmount.getValue(), currency);

        if ((isCurrencyAmount.hashCode() == currencyAmount.hashCode())) {
            System.out.println("You shouldn't convert " + currency +  " by to"+currency+" converter");
            return true;
        } else return false;
    }
}