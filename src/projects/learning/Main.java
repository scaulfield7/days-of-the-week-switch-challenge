package projects.learning;

public class Main{

    public static void main(String[] args){
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        dayOfTheWeek.printDayOfTheWeek(1);
        dayOfTheWeek.printDayOfTheWeek(2);
        dayOfTheWeek.printDayOfTheWeek(3);
        dayOfTheWeek.printDayOfTheWeek(4);
        dayOfTheWeek.printDayOfTheWeek(5);
        dayOfTheWeek.printDayOfTheWeek(6);
        dayOfTheWeek.printDayOfTheWeek(7);
        System.out.println("Random result:");
        dayOfTheWeek.printDayOfTheWeek((int)(Math.random()*10));
    }
}
