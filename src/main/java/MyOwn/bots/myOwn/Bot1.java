package MyOwn.bots.myOwn;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Optional;

public class Bot1 extends TelegramLongPollingBot {

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            handleMessage(update.getMessage());
        }
    }

    @SneakyThrows
    private void handleMessage(Message message) {
        Optional<MessageEntity> msgEntity = message
                .getEntities().stream().filter(e -> e.getType().equals("bot_command")).findFirst();
        if (message.hasText() && msgEntity.isPresent())  {
            switch (message.getText().substring(msgEntity.get().getOffset(), msgEntity.get().getLength())) {
                case "/start_game":
                    execute(
                            SendMessage.builder()
                                    .chatId(String.valueOf(message.getChatId()))
                                    .text("Ну давай поиграем, жалкий ты человек, которому не с кем играть кроме как не с ботом.").build()
                    );
                    break;
                case "/listOf_commands":
                    execute(
                            SendMessage.builder()
                                    .chatId(String.valueOf(message.getChatId()))
                                    .text("No commands").build()
                    );
                    break;
            }
        }
        if (message.getText().charAt(0) >= 65 && message.getText().charAt(0) <= 122) {
            execute(
                    SendMessage.builder()
                            .chatId(String.valueOf(message.getChatId()))
                            .text("Я не общаюсь с пендосами!").build()
            );
        } else {
            execute(
                    SendMessage.builder()
                            .chatId(String.valueOf(message.getChatId()))
                            .text("Закрой рот!\nИ уходи.").build()
            );
        }
    }



    @Override
    public String getBotUsername() {
        return "@SayingTalkBot";
    }

    @Override
    public String getBotToken() {
        return "5512095923:AAFdSZDphrAQezQWYF0BasCi12tTEWDcRzE";
    }


    @SneakyThrows
    public static void main(String[] args) {
        Bot1 myBot = new Bot1();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(myBot);
    }
}
