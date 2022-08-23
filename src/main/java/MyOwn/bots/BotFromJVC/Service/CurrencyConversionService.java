package MyOwn.bots.BotFromJVC.Service;

import MyOwn.bots.BotFromJVC.Entity.Currency;

public interface CurrencyConversionService {

//    static CurrencyConversionService getInstance() {
//        return new NbrbCurrencyConversionService();
//    }

    double getConversionRatio(Currency original, Currency target);
}
