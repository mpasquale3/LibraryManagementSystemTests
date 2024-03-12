import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addBookTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getTitle() throws Exception{
        addBook newTitle = new addBook("Lie To Me", "Molly McAdams", 123456);
        assertEquals("Lie To Me", newTitle.getTitle());
    }
/*
    @Test
    void getAuthor() {
        addBook newAuthor = addBook("Molly McAdams");
        assertEquals("Molly McAdams". newAuthor.getAuthor());
    }
*/

    @Test
    void getBarcode() {
    }


}