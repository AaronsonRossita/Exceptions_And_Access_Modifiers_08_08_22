package main;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import other.OtherItem;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 5;
        double y = x;
        x = (int)y;

        char c = '1';
        String s = String.valueOf(c);
        String s1 = "a";
        char c1 = s1.charAt(0);

        boolean t = true;
        boolean f = !t;

//        System.out.println(x);

        int[] arr = {1,2,3};
        arr[1] = 5;
        String s3 = "abc";

        OtherItem item2 = new OtherItem();
        item2.a = 7; // public
        item2.publicFunc();

        Item item1 = new Item();
        item1.a = 6;      // public
        item1.b = 6;      // protected
        item1.price = 7;  // default
        // item1.c private

        item1.protectedFunc();
        item1.publicFunc();
        item1.defaultFunc();


        ArrayList list = new ArrayList<>();
        list.add(3);
        list.add("something");
        list.add(true);

//        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("something");


//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//        exception1(a,b);
//        exception2();
//        exception3();
//        System.out.println("after");

//        weekDay(-3);
//        System.out.println(weekDay2(89));
//        System.out.println(weekDay3(52));
//        weekDay4(1);
//        trafficLight(478);

        game(10);

    }
    // && true true true -> true ; true true false -> false
    // || true false false -> true
    public static void game(int x){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(x);
        System.out.println("Try to guess the number");
        int answer = scanner.nextInt();
        int counter = 0;
        while(answer != number && counter < 2){
            System.out.println(counter);
            System.out.println("guess again loser");
            answer = scanner.nextInt();
            counter++;
        }
        if (counter < 2){
            System.out.println("You guessed it");
        }else{
            System.out.println("enough");
        }
    }

    public static void print(Object o){
        System.out.println(o);
    }

    public static void print(Number n){
        System.out.println(n);
    }

    public static void weekDay(int day){
        switch (day){
            case /* day == */ 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("not a week day");
        }
        System.out.println("after switch");
    }


    public static String weekDay2(int day){
        switch (day){
            case 1:
                return "Mon";
            case 2:
                return "Tue";
            case 3:
                return "Wed";
            case 4:
                return "Thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
            default:
                return "not a week day";
        }
    }

    public static String weekDay3(int day){
        String temp = "";
        switch (day){
            case 1:
                temp = "Mon";
                break;
            case 2:
                temp = "Tue";
                break;
            case 3:
                temp = "Wed";
                break;
            case 4:
                temp = "Thu";
                break;
            case 5:
                temp = "Fri";
                break;
            case 6:
                temp = "Sat";
                break;
            case 7:
                temp = "Sun";
                break;
            default:
                temp = "not a week day";
        }
        System.out.println("after switch");
        return temp;
    }

    public static void weekDay4(int day){
        switch (day){
            case /* day == */ 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("not a week day");
        }
    }

    // 1 - green -> "Go"
    // 2 - yellow -> "Get ready"
    // 3 - red -> "Stop!"
    public static void trafficLight(int color){
        switch (color){
            case 1:
                System.out.println("Green -> Go!");
                break;
            case 2:
                System.out.println("Yellow -> Get ready!");
                break;
            case 3:
                System.out.println("Red -> Stop!");
                break;
            default:
                System.out.println("Not a color");
        }
    }

    public static void exception1(int x, int y){
        try{
            System.out.println(x/y);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void exception2(){
        int[] arr = {1,2,3};
        try{
//            for (int i = 0; i < 4; i++) {
//                System.out.println(arr[i]);
//            }
            System.out.println(4/0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("catch 1");
        }catch (ArithmeticException e){
            System.out.println("catch 2");
        }catch(Exception e){
            System.out.println("default");
        }
    }

    public static void exception3(){
        try{
            System.out.println(4/0);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }
    }

    public static void exception4() throws Exception{

    }



}
