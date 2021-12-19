package com.company;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

/**System.out.println("Enter the directory to the desired file, including the csv file itself -> ");

 String directory = scanner.next();

 try {

 CsvReader csv = new CsvReader(directory);

 csv.reading();
 * Мейн
 * В нем выполняется считывание из файла csv, генерация id для 2 сущности, добавление в щбъект типа List людей из файла и печать.
 * "D:\\Лабы_ЖАВА\\laba4\\src\\com\\company\\foreign_names.csv"
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите полный путь до нужного вам файла, включая само его название! ");
        String directory = scanner.next();
        try {


            FileReader file = new FileReader(directory);
            CSVReader reader = new CSVReader(file, ';');
            String[] nextStr;
            List<Person> prsn = new ArrayList<>();

            while ((nextStr = reader.readNext()) != null) {
                Random rndm = new Random();
                int num = rndm.nextInt(25000);
                prsn.add(new Person(nextStr[0], nextStr[1], nextStr[2], nextStr[5], nextStr[3], nextStr[4], num));

            }
            for (int i = 1; i < prsn.size(); i++) {
                System.out.print(prsn.get(i).getId() + "; " + prsn.get(i).getName() + "; " + prsn.get(i).getGender() + "; " + prsn.get(i).getBirthDate() + "; " + prsn.get(i).getSubdTitle() + "; " + prsn.get(i).getSubdId() + "; " + prsn.get(i).getSalary() + "; ");
                System.out.println();
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

    }
}
