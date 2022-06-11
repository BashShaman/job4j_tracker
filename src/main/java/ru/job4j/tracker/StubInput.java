package ru.job4j.tracker;

public class StubInput implements Input {

    int index;
    String[] answers;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return answers[index++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
