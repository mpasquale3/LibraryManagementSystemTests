public class bookStatus {


    String title;
     boolean checkedOut = true;
     boolean checkedIn = true;
    private String dateMonth;


    public bookStatus(String title, String dateMonth){
        this.title = title;
        this.dateMonth = dateMonth;

    }

    public String getDate(){
        return dateMonth;
    }

    public boolean CheckedOut(){
        return true;
    }

    public boolean CheckedIn(){
        return true;
    }

    public boolean checkedOut() {
        return false;
    }
}
