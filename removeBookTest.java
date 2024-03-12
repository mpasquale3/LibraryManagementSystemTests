import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeBookTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void titleRemove() throws Exception{
        removeBook removeTitle = new removeBook("Harry Potter", "JK Rowling", 456789);
        assertEquals("Harry Potter", removeTitle.getTitle());
    }

    @Test
    void barcodeRemove() {
        removeBook removeBarcode = new removeBook("Harry Potter", "J.K.Rowling", 987654);
        assertEquals(987654, removeBarcode.getBarcode());
    }
}