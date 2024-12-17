package com.yash.corejava.assignments19sep.encapsulation;

public class Book {

    String name;
    Author author;
    double price;
    int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }


    public void printAllDetailsOfBook()
    {
        System.out.println("Book Name Is-: "+name);
        System.out.println("Author Details Are-: "+"Author Email IS-: "+author.email+" "+"Author Name Is-: "+author.name+" "+"Author Gender Is-: "+author.gender);
        System.out.println("Price Of Book Is-: "+price);
        System.out.println("Quantity Of Books In Stocks Are-: "+qtyInStock);
    }
    public static void main(String[] args) {

        Book b = new Book("Head First Java",new Author("abc@gmail.com","ABC",'M'),1800.0,10);
        b.printAllDetailsOfBook();

        System.out.println("================================================================================");

        System.out.println("Book Name Is-: "+b.getName());
        System.out.print("Author Details Are-: ");
        System.out.print("Author Email Is-: "+b.author.getEmail()+" ");
        System.out.print("Author Name Is-: "+b.author.getName()+" ");
        System.out.print("Author Gender Is-: "+b.author.getGender()+" ");
        System.out.println();
        System.out.println("Price Of Book Is-: "+b.getPrice());
        System.out.println("Quantity Of Books In Stocks Are-: "+b.getQtyInStock());

    }
}
