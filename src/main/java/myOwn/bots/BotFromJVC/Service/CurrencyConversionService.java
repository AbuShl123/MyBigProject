package myOwn.bots.BotFromJVC.Service;

import myOwn.bots.BotFromJVC.Entity.Currency;

public interface CurrencyConversionService {

//    static CurrencyConversionService getInstance() {
//        return new NbrbCurrencyConversionService();
//    }

    double getConversionRatio(Currency original, Currency target);
}
