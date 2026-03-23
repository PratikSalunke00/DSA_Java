// OOPs - Object Oriented Programming System
public class OOPs {
    public static void main(String args[]){
        Pen p1 = new Pen(); // creating an object of class Pen
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount acc1 = new BankAccount();
        // acc1.username = "rcbbank";
        // // setting the password using the method 
        // acc1.setPassword("my_secure_password");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chm, int math) {
        percentage = (phy + chm + math) / 3;
    }
}