package com.kodilla.exception.io;

import java.io.*;
import java.util.Scanner;

public class FileInputAndOutput {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\pawel\\Desktop\\Kodilla-Projects\\kodilla-course\\kodilla-exception\\" +
                "src\\main\\java\\com\\kodilla\\exception\\io\\Plik.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try {
            bufferedWriter.write("To jest przykladowe zapisywanie danych do pliku.");
            bufferedWriter.close();
        } catch(IOException e) {
            System.out.println("Wystapil blad IOException.");
        }

        FileWriter fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write("\nTo jest nowy tekst.");
            bufferedWriter.close();
        } catch(IOException e) {
            System.out.println("Wystapil blad IOException.");
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println(line);
        } catch(IOException ex) {
            System.out.println("Wystapil blad IOException.");
        }

        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();

    }
}
