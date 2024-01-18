package de.telran;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(java.lang.String number, java.lang.String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public java.lang.String getNumber() {
        return number;
    }

    public void receiveCall(String inCall){
        System.out.println("Звонит " + inCall );
    }
    public  void  printVariable(String nameClass) {
        System.out.println("Название класса -> "+nameClass + "  Внутриние переменные:   ->number: "+number+"   ->model: "+model+"    ->weight: "+weight);

    }
}
