package src.members;

import src.books.Book;

public class Member {
    private final int id;
    private static int nextId = 1;
    private String cpf;
    private String name;
    private Book book;

    public Member(String cpf, String name){
        this.id = nextId++;
        this.cpf = cpf;
        this.name = name;
    }

    public void showMemberInfo(){
        System.out.println("Member:");
        System.out.println("Name: " + this.name);
        System.out.println("CPF: " + this.cpf);
        String bookTitle = "";
        if(book != null){
            bookTitle = book.getTitle();
        }
        else bookTitle = "None";
        System.out.println("Book title: " + bookTitle);
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
