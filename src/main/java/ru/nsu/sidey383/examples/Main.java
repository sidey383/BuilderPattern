package ru.nsu.sidey383.examples;

import com.google.common.graph.ImmutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;
import com.pengrad.telegrambot.TelegramBot;
import okhttp3.OkHttpClient;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        stringBuilderExample();
        guavaTreeExample();
        guavaTreeExceptionExample();
        telegramBotExample();
    }

    /**
     * Пример с одним из самых простых билдеров - {@link StringBuilder}
     * **/
    public static void stringBuilderExample() {
        StringBuilder builder = new StringBuilder();
        builder.append("float: ").append(2.23).append('\n');
        for (int i = 0; i < 23; i++) {
            builder.append("i: ").append(1/(0.4*i)).append('\n');
        }
        System.out.println(builder.toString());
    }

    /**
     * Также, пример использования Director для создания объектов из консутрктора
     * **/
    public static void guavaTreeExample() {
        ImmutableValueGraph<Integer,Integer> gr = ValueGraphBuilder.undirected()
                .allowsSelfLoops(false)
                .<Integer, Integer>immutable()
                .addNode(1)
                .addNode(2)
                .addNode(3)
                .addNode(4)
                .addNode(5)
                .addNode(6)
                .addNode(7)
                .addNode(8)
                .putEdgeValue(1, 6, 6)
                .putEdgeValue(2, 6, 12)
                .putEdgeValue(4, 7, 28)
                .build();
        System.out.println("Graph by builder");
        printGraph(gr);
        GraphDirector director1 = new GraphDirector(ValueGraphBuilder.directed());
        GraphDirector director2 = new GraphDirector(ValueGraphBuilder.undirected());
        System.out.println("Graph by director 1");
        printGraph(director1.getMultipleGraph(List.of(2, 24, 3)));
        System.out.println("Graph by director 2");
        printGraph(director2.getMultipleGraph(List.of(2, 24, 3)));
    }

    /**
     * Пример, где builder следит за правильностью создаваемового им объекта
     * **/
    public static void guavaTreeExceptionExample() {
        try {
            GraphDirector director = new GraphDirector(ValueGraphBuilder.undirected().allowsSelfLoops(false));
            director.getMultipleGraph(List.of(2, 24, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printGraph(ImmutableValueGraph<Integer, Integer> graph) {
        graph.edges().forEach((e) -> {
            graph.edgeValue(e).ifPresent( val -> System.out.println(e.nodeU() + ", " + e.nodeV() + " : " + val));
        });
    }


    public static void telegramBotExample() {
        TelegramBot bot1 = new TelegramBot.Builder("BOT_TOKEN")
                .apiUrl("http://nsu.ru")
                .fileApiUrl("https://nsu.ru")
                .debug()
                .okHttpClient(new OkHttpClient())
                .updateListenerSleep(1000)
                .useTestServer(true).build();
        TelegramBot bot2 = new TelegramBot.Builder("BOT_TOKEN") // botToken - обязательное поле.
                .build();
    }

}
