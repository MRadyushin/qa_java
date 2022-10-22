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
public class LionTest {

    @Mock
    Kittens kittens;

    @Test
    public void getKittensLionValue() throws Exception {

        Lion lion = new Lion("Самец", kittens );

        Mockito.when(kittens.getKittens()).thenReturn(1);

        int expectCount = 1;
        int actualCount = lion.getKittens();

        Assert.assertEquals(expectCount, actualCount);

    }

    @Test
    public void getFoodLionValue() throws Exception {

        Lion lion = new Lion("Самка", kittens);

        Mockito.when(kittens.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();

        Assert.assertEquals(expectedFood, actualFood);

    }
}