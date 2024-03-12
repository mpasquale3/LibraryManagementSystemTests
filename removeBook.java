public class removeBook {

    private String title, author;
    private int barcode;
   // private boolean titleRemove = true;
   // private boolean barcodeRemove = false;



    public removeBook(String title, String author, int barcode){
        this.title = title;
        this.author = author;
        this.barcode = barcode;
       // this.titleRemove = titleRemove;
       // this.barcodeRemove = barcodeRemove;
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

   // public boolean titleRemove(){
   //     return titleRemove;

// }

//public boolean barcodeRemove(){
  //      return barcodeRemove;
//}

}
