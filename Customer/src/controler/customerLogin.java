package controler;

import entity.customerAcc;
import serviceImpl.customerServicesImpl;

import java.util.Scanner;

public class customerLogin {
    public static void customerLogin(){
        Scanner sc=new Scanner(System.in);
        System.out.println("===================================WELCOME========================================");
        System.out.println("What you wat login with ");
        System.out.println("1.Email id\n2.phone no");
        int op=sc.nextInt();
        customerAcc cac=null;
        customerServicesImpl c = new customerServicesImpl();
        switch (op){
            case 1:
                System.out.println("Enter your Email id");
                String email=sc.next();
                System.out.println("Enter password");
                int pass=sc.nextInt();
                for (customerAcc a1:c.cl){
                    if (a1.getEmailId().equalsIgnoreCase(email) && a1.getcPassword()==pass){
                       cac=a1;
                       break;
                    }
                }
                break;
            case 2:
                System.out.println("Enter your Phone number");
                long pn=sc.nextLong();
                System.out.println("enter your password");
                int pass2=sc.nextInt();
                for (customerAcc a1:c.cl){
                    if (a1.getPhoneNo()==pn && a1.getcPassword()==pass2){
                        cac=a1;
                        break;
                    }
                }
                break;
            default:
                System.out.println("You give Wrong details....");
        }
        boolean flag=true;
        if (cac !=null){
            while (flag){
                System.out.println("Please chose what you want to do");
                System.out.println("1.Update Account");
                System.out.println("2.View My Account ");
                System.out.println("3.Delete Account");
                System.out.println("4.Order dish ");
                System.out.println("5.Cancel Order");
                System.out.println("6.View Food list");
                System.out.println("7.View My Order");
                System.out.println("8.Exit");
                int chose = sc.nextInt();
                switch (chose){
                    case 1:c.updateMyAccount(cac);break;
                    case 2:c.viewMyAccount(cac);break;
                    case 3:c.deleteAccount(cac);break;
                    case 4:c.orderDish(cac);break;
                    case 5:c.cancelOrder(cac);break;
                    case 6:c.viewFoodList();break;
                    case 7:c.viewMyOrder(cac);
                    break;
                    case 8:
                        flag=false;
                        break;
                    default:
                        System.out.println("invalid choice..................");
                }
            }
        }else {
            System.out.println("Try Again......");
        }

    }
}
