package fr.lernejo;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    int num = 10;
    int fact = 6;
    int fact2 = 1;
    Sample sample = new Sample();

    @Test
    public void testOP() {
        System.out.println("Inside testOP()");
        assertEquals(num, sample.op(ADD, 5,5));
    }
    @Test
    public void testOP2() {
        System.out.println("Inside testOP()");
        assertEquals(num, sample.op(MULT, 2,5));
    }
    @Test
    public void testFact() {
        System.out.println("Inside testFact()");
        assertEquals(fact, sample.fact(3));
    }
    @Test
    public void testFact2() {
        System.out.println("Inside testFact()");
        assertEquals(fact2, sample.fact(0));
    }
}
