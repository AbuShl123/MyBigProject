package myOwn.bots.BotFromJVC.Service;

import myOwn.bots.BotFromJVC.Entity.Currency;

public interface CurrencyModeService {
//    static CurrencyModeService getInstance() {
//
//    }

    Currency getOriginalCurrency(long chatId);
    Currency getTargetCurrency(long chatId);

    void setOriginalCurrency(long chatId, Currency currency);

    void setTargetCurrency(long chatId, Currency currency);


}
