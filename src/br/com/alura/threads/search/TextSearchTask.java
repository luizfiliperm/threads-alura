package br.com.alura.threads.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextSearchTask implements Runnable {

    private String path;
    private String name;


    public TextSearchTask(String path, String name) {
        this.path = path;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(new File(path));
            int count = 0;

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                count++;

                if(line.toLowerCase().contains(name.toLowerCase())){
                    System.out.println(path + " - " + count + " - " + line);
                }
            }

            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}