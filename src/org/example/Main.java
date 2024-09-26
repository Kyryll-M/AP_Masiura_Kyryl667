package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Інформація про примітивні типи даних:");

        System.out.println("byte:");
        System.out.println("Розмір: " + Byte.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);

        System.out.println("\nshort:");
        System.out.println("Розмір: " + Short.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);

        System.out.println("\nint:");
        System.out.println("Розмір: " + Integer.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("Розмір: " + Long.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);

        System.out.println("\nfloat:");
        System.out.println("Розмір: " + Float.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);

        System.out.println("\ndouble:");
        System.out.println("Розмір: " + Double.SIZE + " біт");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);

        System.out.println("\nchar:");
        System.out.println("Розмір: " + Character.SIZE + " біт");
        System.out.println("Мінімальне значення: " + (int) Character.MIN_VALUE);
        System.out.println("Максимальне значення: " + (int) Character.MAX_VALUE);

        System.out.println("\nboolean:");
        System.out.println("Розмір: не має");
        System.out.println("Мінімальне значення: " + Boolean.FALSE);
        System.out.println("Максимальне значення: " + Boolean.TRUE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведіть ціле число (int):");
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println("Ціле число (int): " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний формат для типу int.");
        }

        System.out.println("\nВведіть число з плаваючою точкою (float):");
        String floatInput = scanner.nextLine();
        try {
            float floatValue = Float.parseFloat(floatInput);
            System.out.println("Число з плаваючою точкою (float): " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний формат для типу float.");
        }

        System.out.println("\nВведіть довге ціле число (long):");
        String longInput = scanner.nextLine();
        try {
            long longValue = Long.parseLong(longInput);
            System.out.println("Довге ціле число (long): " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("Неправильний формат для типу long.");
        }

        System.out.println("\nВведіть логічне значення (boolean) (true або false):");
        String booleanInput = scanner.nextLine();
        try {
            boolean booleanValue = Boolean.parseBoolean(booleanInput);
            System.out.println("Логічне значення (boolean): " + booleanValue);
        } catch (Exception e) {
            System.out.println("Неправильний формат для типу boolean.");
        }

        scanner.close();
    }
}// for you, but you can