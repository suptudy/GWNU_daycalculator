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
    public void test_getDayofWeek_00010103() {
        this.dayCalculator.setDate(1, 1, 3);

        assertEquals("Wed", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010131() {
        this.dayCalculator.setDate(1, 1, 31);

        assertEquals("Wed", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010201() {
        this.dayCalculator.setDate(1, 2, 1);

        assertEquals("Thr", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010228() {
        this.dayCalculator.setDate(1, 2, 28);

        assertEquals("Wed", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00010301() {
        this.dayCalculator.setDate(1, 3, 1);

        assertEquals("Thr", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00011231() {
        this.dayCalculator.setDate(1, 12, 31);

        assertEquals("Mon", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_00020101() {
        this.dayCalculator.setDate(2, 1, 1);

        assertEquals("Tue", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_20220520() {
        this.dayCalculator.setDate(2022, 5, 20);

        assertEquals("Fri", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_20200229() {
        this.dayCalculator.setDate(2020, 2, 29);

        assertEquals("Sat", this.dayCalculator.getDayofWeek());
    }

    @Test
    public void test_getDayofWeek_20200301() {
        this.dayCalculator.setDate(2020, 3, 1);

        assertEquals("Sun", this.dayCalculator.getDayofWeek());
    }
}
