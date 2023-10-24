import control.ResControler;
import controler.customerLogin;
import serviceImpl.ResServiceImpl;
import serviceImpl.customerServicesImpl;
import servicess.ResServicess;
import servicess.customerServic;

import java.util.Scanner;

public class controlar {
    private static int appPass=123;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ResServicess res=new ResServiceImpl();
        customerServic ces=new customerServicesImpl();

        boolean flag=false;
        System.out.println("======================================WELCOME===========================================");
        for (int i=3;i>=1;i--){
            System.out.println("enter the password to enter into tha app");
            int pas=sc.nextInt();
            if (appPass==pas){
            flag=true;
            break;
            }
            else {
                System.err.println("you enter wrong password");
                System.out.println((i-1)+" try left");
            }
        }
        if (true){
            while (true){
                System.out.println("++++++++++++++++++++MENU+++++++++++++++++++++");
                System.out.println("1.Register a restaurant");
                System.out.println("2.Register a Customer");
                System.out.println("3.View All Restaurant");
                System.out.println("4.Remove a restaurant");
                System.out.println("5.Login as a Restaurant");
                System.out.println("6.Login as a Customer");
                System.out.println("7.Remove a Customer");
                System.out.println("8.exit");
                int op=sc.nextInt();
                switch (op){
                    case 1:res.createAccount();break;
                    case 2:ces.customerCreateAccount();break;
                    case 3:res.viewAllAccount();break;
                    case 4:res.removeRes();break;
                    case 5:ResControler.restaurantControl();break;
                    case 6:customerLogin.customerLogin();break;
                    case 7:ces.removeCustomer();break;
                    case 8:System.exit(0);
                    default:
                        System.out.println("Enter invalid choice......");

                }
            }
        }

    }
}
