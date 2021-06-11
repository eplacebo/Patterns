package behavioral.interpreter;

public class Contex {
    public String getUSD(int number){
        return Integer.toString(number/74);
    }

    public String getEUR(int number){
        return Integer.toString(number/87);

    }

    public String getUAH(int number){
        return Integer.toString(number/3);
    }

}
