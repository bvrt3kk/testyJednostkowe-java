import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfrTest {

    @Test
    void testSzyfrujCezarem_JezeliDanePodstawoweKluczDodatni() {
        Assertions.assertEquals("def", Szyfr.szyfrujCezarem("abc", 3));
    }
    @Test
    void testSzyfrujCezarem_JezeliZawijanie(){
        Assertions.assertEquals("abc", Szyfr.szyfrujCezarem("xyz", 3));
    }
    @Test
    void testSzyfrujCezarem_JezeliOdszyfrowanie(){
        Assertions.assertEquals("abc", Szyfr.szyfrujCezarem("def", -3));
    }
    @Test
    void testSzyfrujCezarem_JezeliKluczWiekszyNizDlugoscAlfabetu(){
        Assertions.assertEquals("def", Szyfr.szyfrujCezarem("abc", 29));
    }
    @Test
    void testSzyfrujCezarem_JezeliSpacjaWTekscie(){
        Assertions.assertEquals("cd ef", Szyfr.szyfrujCezarem("ab cd", 2));
    }
}