
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3};
        arr[1] = 5;
        String s = "abc";

        ArrayList list = new ArrayList<>();
        list.add(3);
        list.add("something");
        list.add(true);

        System.out.println(list);

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
