package br.com.alura.threads.list;

public class List {

    private String[] elements = new String[100];
    private int index = 0;

    public synchronized void add(String element) {
        this.elements[index] = element;
        this.index++;
    }

    public int size(){
        return this.elements.length;
    }

    public String getElement(int position){
        return this.elements[position];
    }
}
