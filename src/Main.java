
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1
        System.out.println("Task 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний.");}
        else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать».");
        }
        //task2
        System.out.println("\nTask 2");
        int airTemperature = 13;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку.");}
        else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки.");
        }
        //task3
        System.out.println("\nTask 3");
        int carSpeed = 90;
        if (carSpeed >= 60) {
            System.out.println("Если скорость " + carSpeed + ", то прийдется заплатить штраф.");}
        else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно.");
        }
        //task4
        System.out.println("\nTask 4");
        int personsAge = 25;
        if (personsAge >= 2 && personsAge <= 6) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему нужно ходить в детский сад.");}
        else if (personsAge >= 7 && personsAge <= 17) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему нужно ходить в школу.");}
        else if (personsAge >= 18 && personsAge <= 24) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то его место в университете.");}
        else if (personsAge > 24) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему пора ходить на работу.");}
        //task5
        System.out.println("\nTask 5");
        int childAge = 13;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то он не может кататься на аттракционе.");}
        else if (childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя.");}
        else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge +
                    ", то он может кататься без сопровождения взрослого."); }
        //task6
        System.out.println("\nTask 6");
        int passengerCount = 90;
        if (passengerCount <= 60) {
            System.out.println("В вагоне есть сидячее место.");}
        else if (passengerCount <= 102) {
            System.out.println("В вагоне есть место, но только стоячее.");}
        else {
            System.out.println("В вагоне уже нет места.");}


        //task7
        System.out.println("\nTask 7");
        int one = 10;
        int two = 20;
        int three = 30;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " самое большое.");}
        else if (two >= one && two >= three) {
            System.out.println("Число " + two + " самое большое.");}
        else {
            System.out.println("Число " + three + " самое большое.");}

    }
}



