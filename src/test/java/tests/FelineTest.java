package tests;

import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FelineTest {

    @Test
    public void eatMeatFelineValue() throws Exception {

        Feline feline = new Feline();

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();

        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyFelineValue() {

        Feline feline = new Feline();

        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();

        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensFelineMethod() {

        Feline feline = new Feline();

        int expectedCount = 1;
        int actualCount = feline.getKittens();

        Assert.assertEquals(expectedCount, actualCount);

    }

    @Test
    public void getKittensFelineValue() {

        Feline feline = new Feline();

        int expectedCount = 2;
        int actualCount = feline.getKittens(expectedCount);

        Assert.assertEquals(expectedCount, actualCount);

    }
}