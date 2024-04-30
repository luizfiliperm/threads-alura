package br.com.alura.threads.list;

public class List {

    private String[] elements = new String[100];
    private int index = 0;

    public synchronized void add(String element) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.elements[index] = element;
        this.index++;

        if(index == size()){
            System.out.println("List is full, notify");
            this.notify();
        }
    }

    public int size(){
        return this.elements.length;
    }

    public String getElement(int position){
        return this.elements[position];
    }

    public boolean isFull() {
        return index == elements.length;
    }
}
