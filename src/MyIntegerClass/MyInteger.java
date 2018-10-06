package src.MyIntegerClass;

import java.util.Scanner;

public class MyInteger {
    private int value;
    public MyInteger(){
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public boolean isEven(){
        if(this.value % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isOdd(){
        if(this.value % 2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPrime(){
        boolean check = true;
        if(this.value < 2){
            check = false;
        }
        for(int i = 2; i < this.value; i++){
            if(this.value % i == 0){
                check = false;
            }
        }
        if(check){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(int numberCheck){
        if(this.value == numberCheck){
            return true;
        }else{
            return false;
        }
    }
}
