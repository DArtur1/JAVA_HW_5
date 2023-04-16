package ru.netology.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class employeeVacationTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/employeeBenefits.csv")
    public void testVocantionLimit(int income, int expenses, int threshold){
        employeeVacation relax = new employeeVacation();

        int count = relax.calculate(income,expenses, threshold);
        System.out.println("Можно отодохнуть " + count + " месяца(ев)");
    }

}
