package de.predic8;

import de.predic8.maxage.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FaktorisierungTest {

    @Test
    void simple() {
        assertEquals(List.of(2L), Faktorisierung.zerlege(2));
        assertEquals(List.of(2L,5L),Faktorisierung.zerlege(10));
        assertEquals(List.of(2L,2L,2L),Faktorisierung.zerlege(8));
        assertEquals(List.of(2L,2L,5L,5L),Faktorisierung.zerlege(100));
        assertEquals(List.of(3L,3L,349L),Faktorisierung.zerlege(3141));
        assertEquals(List.of(53L,59281L),Faktorisierung.zerlege(3_141_893));
        assertEquals(List.of(2L,3L,23L,22767343L),Faktorisierung.zerlege(3_141_893_334L));
        assertEquals(List.of(2L,3L,7L,31L,107L,22552603L),Faktorisierung.zerlege(3_141_893_334_342L));
        assertEquals(List.of(2L, 2L, 3L, 167L, 191L, 311L, 26393681L),Faktorisierung.zerlege(3_141_893_334_342_324L));
    }
}