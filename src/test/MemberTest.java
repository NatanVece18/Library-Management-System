package src.test;

import src.books.Book;
import src.members.Member;

public class MemberTest {
    static void main(String[] args) {

        Book book1 = new Book(99996-9, "1984");
        Member member1 = new Member("473.974.168-32", "Natan");

        book1.borrowBook(member1);

        book1.showBookInfo();
        System.out.println("===================");
        member1.showMemberInfo();
    }
}
