public class Main {
    public static void leapYear(int y) {
        if( y %100 ==0 && y% 400 ==0){
            System.out.println("Високосный год");

        } else if (y % 4 == 0 && y %100 != 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");


        }}
    public static void version(int x, int w){
        int currentYear = 2023;
        if(w == 0){
        if (x < currentYear){
            System.out.println("Установите облегченную версию для Айфона");
        }else{
            System.out.println("Установите текущую версию для Айфона");}}
        else{if (x < currentYear){
            System.out.println("Установите облегченную версию для Андроид");
        }else{
            System.out.println("Установите текущую версию для Андроид");}}

        }

    public static  int  delivery(int distance){
        if (distance < 60){
            if (distance < 20){return 1;

            }else {return 2;}
        }else{
            if(distance< 100){return 3;}else {return 404;}
        }

    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();



    }
    public static void task1(){
        ///Задача 1
        int year = 1900;
        leapYear(year);
    }
    public static void task2(){

        int yearOfPhone = 2023;
        int versionOfPhone = 1;
        version(yearOfPhone, versionOfPhone);

    }
    public static void task3(){
        int distance = 40;
        if (delivery(distance) == 404){
            System.out.println("Доставки нет");

        }else{
            System.out.println("Доставка займет дней: " + delivery(distance));
        }

    }}
