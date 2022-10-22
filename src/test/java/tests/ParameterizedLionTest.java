package tests;

import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    private final String sex;
    Kittens kittens;
    private final boolean expectedHasMane;

    public ParameterizedLionTest(String sex, boolean expectedHasMane) {

        this.sex = sex;
        this.expectedHasMane = expectedHasMane;

    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void doesHaveManeLionValue() throws Exception {

        Lion lion = new Lion(sex, kittens );

        boolean actualHasMane = lion.doesHaveMane();

        Assert.assertEquals(expectedHasMane, actualHasMane);
    }
}
