import java.util.*;

public class variable1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number which you want to be calculated");
        int a =sc.nextInt();
        int b =sc.nextInt();
        
        System.out.println("select the oprator");
        int cal=sc.nextInt();
        System.out.println("1 = add");
        System.out.println("2 = sub");
        System.out.println("3 = mul");
        switch (cal){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Enter wrong option");
        }
        sc.close();
    }
}
