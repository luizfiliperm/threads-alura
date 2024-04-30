package br.com.alura.threads.list;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List list = new List();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddElementTask(list, i)).start();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.getElement(i));
        }
    }
}
