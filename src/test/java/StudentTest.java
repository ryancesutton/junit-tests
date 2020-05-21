import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student ry;

    @Before
    public void setUp(){
        ry = new Student (7777777, "Ry Sutton");
    }



    @Test
    public void testIfGetIdWorks () {
        assertEquals(7777777, ry.getId());
    }

    @Test
    public void testIfGetNameWorks () {
        assertEquals("Ry Sutton", ry.getName());
    }

    @Test
    public void testIfGetGradeWorks () {
        assertEquals(0, ry.getGrades().size());
    }

    @Test
    public void testIfAddGradeWorks () {
        ry.addGrade(100);
        ry.getGrades().get(0);
        assertTrue(100 ==  ry.getGrades().get(0));
        ry.addGrade(80);
        assertTrue(100 ==  ry.getGrades().get(0));
    }

    @Test
    public void testIfGetAverageWorks () {
        assertEquals(0, ry.getAverage(), 0);
        ry.addGrade(100);
        ry.addGrade(80);
        assertEquals(90, ry.getAverage(), 0.1);
    }

}
