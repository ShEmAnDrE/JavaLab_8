package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/andreyshemchuk/Documents/JavaDocuments/TextFile.txt");
        Scanner sc =new Scanner(System.in);
        System.out.println("Введите то, чем хотите заменить");
        String s = new String(sc.nextLine());
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.write(s);
            System.out.println("Текст в файле заменен");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
