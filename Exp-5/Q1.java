import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); 

        int n = 5; 

        for (int i = 0; i < n; i++) { 
            System.out.println("please enter the value");
            String strNum = sc.nextLine();
            list.add(strNum);
        }
        System.out.println(list);

        int sum = 0;
        for (String val : list) { 
            sum += Integer.parseInt(val);
        }
        System.out.println("sum is : " + sum);
        sc.close();
    }
}
