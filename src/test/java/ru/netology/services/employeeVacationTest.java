package ru.netology.services;
import org.junit.jupiter.api.Test;

public class employeeVacationTest {
    @Test
    public void testVocantion(){
        employeeVacation relax = new employeeVacation();

        int count = relax.calculate(10000, 3000, 20000);
        System.out.println("Можно отодохнуть " + count + " месяца(ев)");
    }

}
