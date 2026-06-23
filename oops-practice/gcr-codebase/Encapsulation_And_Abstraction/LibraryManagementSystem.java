package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class LibraryItem{
    private int itemId; private String title,author;
    public LibraryItem(int id,String t,String a){itemId=id;title=t;author=a;}
    public abstract int getLoanDuration();
    public void displayItemDetails(){System.out.println(itemId+" "+title+" "+author);}
}
class Book extends LibraryItem{ public Book(int i,String t,String a){super(i,t,a);} public int getLoanDuration(){return 14;}}
class Magazine extends LibraryItem{ public Magazine(int i,String t,String a){super(i,t,a);} public int getLoanDuration(){return 7;}}
class DVD extends LibraryItem{ public DVD(int i,String t,String a){super(i,t,a);} public int getLoanDuration(){return 3;}}
public class LibraryManagementSystem{
    public static void main(String[] args){
        LibraryItem[] items={new Book(1,"Java","X"),new Magazine(2,"Tech","Y"),new DVD(3,"Movie","Z")};
        for(LibraryItem i:items){i.displayItemDetails();System.out.println(i.getLoanDuration());}
    }
}