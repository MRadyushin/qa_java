package tests;

import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CatTest {

    @Test
    public void getSoundCatValue() {

        Cat cat = new Cat(new Feline());

        String expectedSound = "Мяу";
        String actualSound = cat.getSound();

        Assert.assertEquals(expectedSound, actualSound);

    }

    @Mock
    Predator predator;

    @Test
    public void getFoodCatValue() throws Exception {

        Cat cat = new Cat(new Feline());

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = cat.getFood();

        Assert.assertEquals(expectedFood, actualFood);

    }

}
