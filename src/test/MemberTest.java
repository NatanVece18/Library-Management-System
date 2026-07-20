package src.test;

import src.books.Book;
import src.members.Member;

public class MemberTest {
    public static void main(String[] args) {

        Book book1 = new Book("99996-02-9", "1984");
        Member member1 = new Member("473.974.168-32", "Natan");

        //Borrowing book test
        book1.borrowBook(member1);

        book1.showBookInfo();
        System.out.println("===================");
        member1.showMemberInfo();

        System.out.println();

        //Returning book test
        book1.returnBook();

        book1.showBookInfo();
        System.out.println("===================");
        member1.showMemberInfo();
    }
}
