package pl.sii.eu;

import pl.sii.eu.*;
import pl.sii.eu.model.Amount;

import static pl.sii.eu.model.Currency.*;

public class CurrencyConverterImplementation implements CurrencyConverter{

    @Override
    public Amount convertToPln(Amount euroAmount) {
        Amount plnAmount;
        long euroAmountValue = euroAmount.getValue();
        long plnAmountValue =  (long)Math.round(euroAmountValue/EURO_TO_PLN_RATIO);

        plnAmount = new Amount(plnAmountValue,PLN);
        return plnAmount;
    }

    @Override
    public Amount convertToEur(Amount plnAmount) {
        Amount euroAmount;
        long plnAmountValue = plnAmount.getValue();
        long euroAmountValue =  (long)Math.round(plnAmountValue*EURO_TO_PLN_RATIO);

        euroAmount = new Amount (euroAmountValue,EUR);
        return euroAmount;
    }
}
