package org.example;

import java.util.Scanner;

public class Book {
    String name;
    String authorName;
    int year;
    String publishingHouse;
    String genre;
    int countPages;
    public Book(){
        this.name = "name";
        this.authorName = "authorName";
        this.year = 2000;
        this.publishingHouse = "publishingHouse";
        this.genre = "genre";
        this.countPages = 0;
    }
    public Book(String name, String authorName, int year, String publishingHouse, String genre, int countPages) {
        this.name = name;
        this.authorName = authorName;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.genre = genre;
        this.countPages = countPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public void setInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of book: ");
        this.name = scanner.nextLine();
        System.out.print("Enter author name: ");
        this.authorName = scanner.nextLine();
        System.out.print("Enter year of publish: ");
        this.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter house of publish: ");
        this.publishingHouse = scanner.nextLine();
        System.out.print("Enter genre: ");
        this.genre = scanner.nextLine();
        System.out.print("Enter count of pages: ");
        this.countPages = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Book{\n" +
                "name=" + name + '\n' +
                "authorName=" + authorName + '\n' +
                "year=" + year + "\n" +
                "publishingHouse=" + publishingHouse + '\n' +
                "genre=" + genre + '\n' +
                "countPages=" + countPages + "\n" +
                '}' + "/n";
    }
}
