package control;

import entity.RestaurantAddAccount;
import serviceImpl.ResServiceImpl;

import java.util.Scanner;

public class ResControler {
    public static void restaurantControl() {
        Scanner sc=new Scanner(System.in);
        System.out.println("==============WELCOME==============");

        System.out.println("Please enter the Restaurant id ");
        int id=sc.nextInt();
        System.out.println("Please enter the password");
        int pas=sc.nextInt();
        ResServiceImpl r = new ResServiceImpl();
        RestaurantAddAccount acc=null;
        for (RestaurantAddAccount a1:r.l1){
           if (a1.getrId()==id && a1.getoPasswoed()==pas){
               acc=a1;
               break;
           }
        }
        boolean flag=true;
        if (acc !=null){
            while (flag) {
                System.out.println("Please chose what you want to do");
                System.out.println("1.Update restaurant");
                System.out.println("2.View My Account ");
                System.out.println("3.Delete Account");
                System.out.println("4.Add Dish ");
                System.out.println("5.Remove Dish");
                System.out.println("6.View Food list");
                System.out.println("7.Exit");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        r.updateAccount(acc);
                        break;
                    case 2:
                        r.viewAccount(acc);
                        break;
                    case 3:
                        r.removeAccount(acc);
                        break;
                    case 4:
                        r.addFood(acc);
                        break;
                    case 5:
                        r.removeFood(acc);
                        break;
                    case 6:
                        r.viewFoodList(acc);
                        break;
                    case 7:
                        flag=false;
                        break;
                    default:
                        System.out.println("Invalid choice......");

                }
            }
        }else {

            System.err.println("You enter wrong id or password");
            System.out.println("Try again after some time");
        }

    }

}
