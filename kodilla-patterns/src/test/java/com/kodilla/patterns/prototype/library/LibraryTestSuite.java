package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("First Library");
        library.getBooks().add(new Book("Java - Head First", "Kathy Sierra",
                LocalDate.of(2013, 10, 15)));
        library.getBooks().add(new Book("Wolf of the mountains", "Dylan Murphy",
                LocalDate.of(2013, 2, 12)));
        library.getBooks().add(new Book("Rejecting the night", "Aimee Murphy",
                LocalDate.of(2015, 4, 12)));
        library.getBooks().add(new Book("Unity without duty", "Madelynn Carson",
                LocalDate.of(2007, 5, 25)));
        library.getBooks().add(new Book("Gangsters and kings", "Ryan Talley",
                LocalDate.of(2007, 4, 12)));
        library.getBooks().add(new Book("Enemies of eternity", "Giancarlo Guerrero",
                LocalDate.of(2005, 5, 5)));

        Library clonedLibrary = null;
        try {
                clonedLibrary = library.shallowCopy();
                clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
                System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
                deepClonedLibrary = library.deepCopy();
                deepClonedLibrary.setName("Third Library");
        } catch(CloneNotSupportedException e) {
                System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Dziwny jest ten swiat", "Ewa Minge",
                LocalDate.of(2018, 5, 10)));
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(7, library.getBooks().size());
        Assert.assertEquals(7, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
