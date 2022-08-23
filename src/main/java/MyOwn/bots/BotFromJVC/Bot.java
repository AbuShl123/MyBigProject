package MyOwn.bots.BotFromJVC;

import MyOwn.bots.BotFromJVC.Entity.Currency;
import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Bot extends TelegramLongPollingBot {
    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            handleMessage(update.getMessage());
        }

    }


    private void handleMessage(Message message) throws TelegramApiException {
        execute(
                SendMessage.builder().text("Все банки закрыты.").chatId(message.getChatId().toString()).build()
        );
        if (message.hasText() && message.hasEntities()) {
            execute(
                    SendMessage.builder()
                            .chatId(message.getChatId().toString())
                            .text(String.valueOf(message.getEntities()))
                            .build()
            );
            Optional<MessageEntity> commandEntity =
                    message.getEntities().stream().filter(e -> "bot_command".equals(e.getType())).findFirst();
            if (commandEntity.isPresent()) {
                String command = message.getText().substring(commandEntity.get().getOffset(), commandEntity.get().getLength()); // offSet() -- index from which entity starts
                switch (command) {
                    case "/set_currency":
                        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
                        for (Currency currency : Currency.values()) {
                            buttons.add(
                                    Arrays.asList(
                                            InlineKeyboardButton.builder()
                                                    .text(currency.name())
                                                    .callbackData("ORIGINAL:" + currency).build(),
                                            InlineKeyboardButton.builder()
                                                    .text(currency.name())
                                                    .callbackData("TARGET:" + currency).build()
                                    ));
                        }
                        execute(
                                SendMessage.builder()
                                        .chatId(message.getChatId().toString())
                                        .replyMarkup(InlineKeyboardMarkup.builder().keyboard(buttons).build())
                                        .text("Please choose original and target currencies").build()
                        );
                        return;
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "@ClasInfoBot";
    }

    @Override
    public String getBotToken() {
        return "5594140510:AAHYTJLM2sWoWTX5DGrV1lzI45yNsQl3VGs";
    }

    @SneakyThrows
    public static void main(String[] args) {
        Bot bot = new Bot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
    }

}
