package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeoutException;

public class DepositAccount extends Account {
    protected LocalDate now = LocalDate.now();
    protected LocalDate lastDateTakeOff = LastDateTakeOff ();
    protected LocalDate LastDateTakeOff (){
        return now.minusMonths(now.getDayOfMonth());
    }

    protected void take (double sumTake){
        now = LocalDate.now();
        if(now.getMonth() != lastDateTakeOff.getMonth()){
            if (sumTake > 0 && sumTake < balans){
                balans = balans - sumTake;
                System.out.println("Операция проведена успешно.");
                System.out.println("Текущий баланс = " + GetAmount());
                lastDateTakeOff = LocalDate.now();}
            else {throw new ArithmeticException("Ошибка вывода средств, операция отменена.");}
        }
        else{throw new ArithmeticException("Невозможно снять средства чаще 1 раза в месяц. ");}

    }
}
