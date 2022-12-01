public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Task 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Task 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Task 3");
        var dog = 8.0; // тип переменной double
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Task 4");
        var friend =19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Task 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeightBoxers = weightBoxer1 + weightBoxer2;
        System.out.println("Total weight boxers: " + totalWeightBoxers + " kg ");
        var weightDifferenceBoxers = weightBoxer2 - weightBoxer1;
        System.out.println("Boxers weight difference: " + weightDifferenceBoxers + " kg ");
    }
    public static void task7() {
        System.out.println("Task 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifferenceSub = weightBoxer2 - weightBoxer1;
        System.out.println("Boxers weight difference (subtraction method): " + weightDifferenceSub + " kg ");
        var weightDifferenceDiv = weightBoxer1 % weightBoxer2;
        System.out.println("Boxers weight difference (division method): " + weightDifferenceDiv + " kg ");
    }
    public static void task8() {
        System.out.println("Task 8");
        var totalHours = 640;
        var workHours = 8;
        var totalEmployees = totalHours / workHours;
        System.out.println("Total employees working in the company - " + totalEmployees + " people.");
        totalEmployees = totalEmployees + 94;
        totalHours = totalEmployees * 8;
        System.out.println("If in company working " + totalEmployees + " people, then all " + totalHours +
                        " hours of work can be divided among employees.");
    }

}