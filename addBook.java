public class addBook {

    private String title, author;
    private int barcode;

    public addBook(String title, String author, int barcode){

        this.title = title;
        this.author = author;
        this.barcode = barcode;
    }


    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getBarcode(){
        return barcode;
    }

}
