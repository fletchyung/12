package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ip-адрес ");
        String add = scanner.nextLine();
        String input = add;
        boolean result = input.matches("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
        if (result) {
            try (FileWriter fww = new FileWriter("src//creed.txt");
                 BufferedWriter ad = new BufferedWriter(fww)){
                ad.write(add);
            } catch (IOException ex){
                System.out.println("Error");
            }
        } else {
            System.out.println("Ошибка");
        }
    }
}