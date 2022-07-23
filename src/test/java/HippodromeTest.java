import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class HippodromeTest {

    @Test
    public void nullIllegalArgumentExceptionInConstructor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Hippodrome(null));
        assertEquals("Horses cannot be null.", exception.getMessage());
    }

    @Test
    public void isEmptyIllegalArgumentExceptionInConstructor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Hippodrome(new ArrayList<>()));
        assertEquals("Horses cannot be empty.", exception.getMessage());
    }

    @Test
    void getHorses() {
        List<Horse> horseList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            horseList.add(new Horse("Trotter" + i, i));
            Hippodrome hippodrome = new Hippodrome(horseList);
            assertArrayEquals(horseList.toArray(), hippodrome.getHorses().toArray());
        }
    }

    @Test
    void move() {
        ArrayList<Horse> horseList = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            horseList.add(mock(Horse.class));
        }
        Hippodrome hippodrome = new Hippodrome(horseList);

        assertArrayEquals(horseList.toArray(), hippodrome.getHorses().toArray());
    }

    @Test
    void getWinner() {

        Horse h1 = new Horse("Bob1", 1, 1);
        Horse h2 = new Horse("Bob2", 1, 2);
        Horse h3 = new Horse("Bob3", 1, 5);
        Horse h4 = new Horse("Bob4", 1, 3);
        Horse h5 = new Horse("Bob5", 1, 4);

        Hippodrome hippodrome = new Hippodrome(List.of(h1, h2, h3, h4, h5));
    }
}