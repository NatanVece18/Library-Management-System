package src.books;

import src.enums.BookStatus;
import src.members.Member;

public class Book {
    private final String ISBN;
    private final int id;
    private static int nextId = 1;
    private String title;
    private BookStatus status;
    private Member borrower;

    public Book(final String ISBN, String title){
        this.id = nextId++;
        this.ISBN =  ISBN;
        this.title = title;
        this.status = BookStatus.AVAILABLE;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", borrower=" + borrower +
                '}';
    }

    public void borrowBook(Member member){
        if(member.getBook() == null && status == BookStatus.AVAILABLE){
            setStatus(BookStatus.BORROWED);
            setBorrower(member);
            member.setBook(this);
        }
    }

    public void returnBook(){
        if(borrower.getBook() != null && status == BookStatus.BORROWED){
            setStatus(BookStatus.AVAILABLE);
            //The book inside borrower (Member class) needs to be null before setting null in this object
            borrower.setBook(null);
            setBorrower(null);
        }
    }

    public void showBookInfo(){
        System.out.println("Book:");
        System.out.println("Title: " + this.title);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Status: " + getStatus());
        String borrowerName = "";
        if(borrower != null){
            borrowerName = borrower.getName();
        }
        else borrowerName = "None";
        System.out.println("Borrower: " + borrowerName);
    }

    public String getISBN() {
        return ISBN;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Member getBorrower() {
        return borrower;
    }

    public void setBorrower(Member borrower) {
        this.borrower = borrower;
    }
}
