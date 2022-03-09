package aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
//    @Override
    public void getBook(){
        System.out.println("We got book from the University library");
    }
    public void getMagazine(){
        System.out.println("We got Magazine from the University library!!!");
    }

    public void returnBook(){
        System.out.println("We returned book to the University library!!!");
    }

    public void returnMagazine(){
        System.out.println("We returned Magazine to the University library!!!");
    }

    public void addBook(){
        System.out.println("We added a book to the University library!!!");
    }

    public void addMagazine(){
        System.out.println("We added a magazine to the University library!!!");
    }
}
