package library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testCheckoutPublication() {
        Library library = LibraryFactory.buildLibrary();
        assertTrue(library.checkoutPublication("Kindred"));
        assertFalse(library.checkoutPublication("A Song of Fire and Ice"));
        assertFalse(library.checkoutPublication("Kindred"));
        assertTrue(library.checkoutPublication("Wired"));
    }
}