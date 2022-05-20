package GWNU_daycalculator;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class DayCalculatorTest {
    private DayCalculator dayCalculator;

    @Before
    public void createDayCalculatorInstance() {
        this.dayCalculator = new DayCalculator();
    }

    @After
    public void deleteDayCalculatorInstance() {
        this.dayCalculator = null;
    }

    @Test
    public void test_DaycalculatorInstance() {
        assertNotNull(this.dayCalculator);
    }

    @Test
    public void test_setDate_20220513() {
        this.dayCalculator.setDate(2022, 5, 13);

        assertEquals(2022, this.dayCalculator.getYear());
        assertEquals(5, this.dayCalculator.getMonth());
        assertEquals(13, this.dayCalculator.getDay());
    }

    @Test
    public void test_setDate_20220514() {
        this.dayCalculator.setDate(2022, 5, 14);

        assertEquals(2022, this.dayCalculator.getYear());
        assertEquals(5, this.dayCalculator.getMonth());
        assertEquals(14, this.dayCalculator.getDay());
    }

    @Test
    public void test_getDayofWeek_00010101() {
        this.dayCalculator.setDate(1, 1, 1);

        assertEquals("Mon", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010201() {
        this.dayCalculator.setDate(1, 1, 2);

        assertEquals("Tue", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010103() {
        this.dayCalculator.setDate(1, 1, 3);

        assertEquals("Wed", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010110() {
        this.dayCalculator.setDate(1, 1, 10);

        assertEquals("Wed", this.dayCalculator.getDayofWeek());
    }

}
