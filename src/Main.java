
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task1
        System.out.println("Task 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    ", то он не достиг совершеннолетия, нужно немного подождать».");
        }
        //task2
        System.out.println("\nTask 2");
        int airTemperature = 13;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улицу " + airTemperature + " градусов, можно идти без шапки.");
        }
        //task3
        System.out.println("\nTask 3");
        int carSpeed = 90;
        if (carSpeed >= 60) {
            System.out.println("Если скорость " + carSpeed + ", то прийдется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно.");
        }
        //task4
        System.out.println("\nTask 4");
        int personsAge = 25;
        if (personsAge >= 2 && personsAge <= 6) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему нужно ходить в детский сад.");
        } else if (personsAge >= 7 && personsAge <= 17) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему нужно ходить в школу.");
        } else if (personsAge >= 18 && personsAge <= 24) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то его место в университете.");
        } else if (personsAge > 24) {
            System.out.println("Если возраст человека равен " + personsAge +
                    ", то ему пора ходить на работу."); }
        //task5
        System.out.println("\nTask 5");
    }
}



