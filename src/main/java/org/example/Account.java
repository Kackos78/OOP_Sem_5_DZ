package org.example;

public class Account {
    protected double balans = 0;
    protected void Put (double sumPut){
        if (sumPut > 0){
            balans = balans + sumPut;
            System.out.println("Операция проведена успешно.");
            System.out.println("Текущий баланс = " + GetAmount());}
        else {throw new ArithmeticException("Ошибка пополнения счета, операция отменена.");}
    }
    protected void take (double sumTake){
        if (sumTake > 0 && sumTake < balans){
            balans = balans - sumTake;
            System.out.println("Операция проведена успешно.");
            System.out.println("Текущий баланс = " + GetAmount());}
        else {throw new ArithmeticException("Ошибка вывода средств, операция отменена.");}
    }
    protected double GetAmount (){
        return balans;

    }

}

