public class Main {
    public static void leapYear(int y) {
        if(y%4 == 0 || y %100 ==0){
            System.out.println("Високосный год");
        }else {
            System.out.println("Невисокосный год");


        }}
    public static void version(int x){
        int currentYear = 2023;
        if (x < currentYear){
            System.out.print("Установите облегченную версию");
        }else{
            System.out.print("Установите текущую версию");}
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
        int year = 2023;
        leapYear(year);
    }
    public static void task2(){

        int yearOfPhone = 2023;
        int versionOfPhone = 1;
        if (versionOfPhone == 1){
            version(yearOfPhone);
            System.out.println(" для Андроида");

        }else{version(yearOfPhone);
            System.out.println(" для Айфона");}


    }
    public static void task3(){
        int distance = 40;
        if (delivery(distance) == 404){
            System.out.println("Доставки нет");

        }else{
            System.out.println("Доставка займет дней: " + delivery(distance));
        }

    }}
