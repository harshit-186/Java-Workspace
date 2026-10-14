package COLLECTION.Set_Interface.TreeSet.CustomTreeSet;

public class Book implements Comparable<Book>{
    private String bookName ;
    private String authorName ;
    private int bookPrice;
    public Book(String bookName , String authorName , int bookPrice){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookPrice=bookPrice;
    }
    public String toString(){
        return "Book : "+bookName+" , Author : "+authorName+" , Price : "+bookPrice ;
    }
    public int compareTo(Book o ){
        return this.bookPrice-o.bookPrice;
    }
}
