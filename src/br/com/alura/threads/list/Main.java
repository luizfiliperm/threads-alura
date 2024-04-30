package br.com.alura.threads.list;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List list = new List();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddElementTask(list, i)).start();
        }

        new Thread(new PrintListTask(list)).start();
    }
}
