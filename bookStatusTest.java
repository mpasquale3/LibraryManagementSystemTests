import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bookStatusTest {

    @BeforeEach
    void setUp() {
    }




    @Test
    void checkedOut() throws Exception{
        bookStatus dateReturn = new bookStatus("Lord of the Rings", "May");
        assertFalse(dateReturn.checkedOut());
    }

    @Test
    void checkedIn() {
    }
}