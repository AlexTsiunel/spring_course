package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
//    @Override
    public void getBook(Book book){
        System.out.printf("We got book from the University library: \"%s\".\n", book.getName());
    }
    public void getMagazine(){
        System.out.println("We got Magazine from the University library!!!");
    }

    public void returnBook(){
        System.out.println("We returned book to the University library!!!");
    }
}
