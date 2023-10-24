package serviceImpl;

import entity.FoodItems;
import entity.RestaurantAddAccount;
import entity.customerAcc;
import entity.order;
import servicess.customerServic;

import java.util.ArrayList;
import java.util.Scanner;

import static serviceImpl.ResServiceImpl.dList;

public class customerServicesImpl implements customerServic {
    Scanner sc=new Scanner(System.in);
    private static int cId=11111;
    public static ArrayList<customerAcc> cl =new ArrayList<customerAcc>();
   private static ArrayList<order> orderList=new ArrayList<>();

    @Override
    public void updateMyAccount(customerAcc cac) {
        System.out.println("Enter What you Want to update");
        System.out.println("1.Update Customer name\n2.Update Email id");
        System.out.println("3.Update Phone number\n4.Update Age");
        System.out.println("5.Update Gender\n6.Update Password");
        System.out.println("8.Exit From Here");
        int chose=sc.nextInt();

        if (cac !=null){
            switch (chose){
                case 1:
                    System.out.println("Recent name is "+cac.getcName());
                    System.out.println("Enter your new name");
                    String name=sc.next();
                    cac.setcName(name);
                    System.out.println("Name update successful.........");
                    System.out.println("New name is "+ cac.getcName());
                    break;
                case 2:
                    System.out.println("Recent email id  is "+cac.getEmailId());
                    System.out.println("Enter your new email id");
                    String email=sc.next();
                    cac.setEmailId(email);
                    System.out.println("Email update successful.........");
                    System.out.println("New Email is "+ cac.getEmailId());
                    break;
                case 3:
                    System.out.println("Recent phone number is "+cac.getPhoneNo());
                    System.out.println("Enter your new phone number");
                    long pn=sc.nextLong();
                    cac.setPhoneNo(pn);
                    System.out.println("Phone number update successful.........");
                    System.out.println("New Phone number is "+ cac.getPhoneNo());
                    break;
                case 4:
                    System.out.println("Recent age is "+cac.getcAge());
                    System.out.println("Enter your new age");
                    int ag=sc.nextInt();
                    cac.setcAge(ag);
                    System.out.println("age update successful.........");
                    System.out.println("New age is "+ cac.getcAge());
                    break;
                case 5:
                    System.out.println("Recent Gender is "+cac.getGender());
                    System.out.println("Enter your Gender");
                    char g =sc.next().charAt(0);
                    cac.setGender(g);
                    System.out.println("Gender update successful.........");
                    System.out.println("Gender is "+ cac.getGender());
                    break;
                case 6:
                    System.out.println("Recent password is "+cac.getcPassword());
                    System.out.println("Enter your new Password");
                    int pass =sc.nextInt();
                    cac.setcPassword(pass);
                    System.out.println("Password update successful.........");
                    System.out.println("New password is ****"+ cac.getcPassword()%10);
                    break;
                case 7:
                    System.out.println("going to home page.....");
                    break;
                default:
                    System.out.println("Invalid choice........");
            }
        }else {
            System.out.println("Try Again.........");
        }

    }

    @Override
    public void viewMyAccount(customerAcc cac) {
        System.out.println(cac);
    }

    @Override
    public void orderDish(customerAcc cac) {
        ResServiceImpl l=new ResServiceImpl();
        double totalAmount=0;
        int dishNo=1;
        System.out.println("Enter What uou want to order..");
        for (FoodItems f1: dList){
            System.out.println((dishNo++) +" "+ f1);
        }
        System.out.println("Enter the number of Dish you want to order....");
        int nod=sc.nextInt();
        System.out.println("Enter Dish number Which you want to order.....");

        int i=1;
        while (i<=nod){
            System.out.println(">>");
            int dn=sc.nextInt();
            totalAmount=totalAmount+dList.get(dn-1).getdPrice();
            orderList.add(new order(dList.get(dn-1),cac.getcId()));
            i++;
        }
        if (i>1) {
            System.out.println("Order Successful....");
            System.out.println("Your total amount of order is " + totalAmount);
        }else {
            System.out.println("You never order anything.....");
        }
    }

    @Override
    public void viewMyOrder(customerAcc op) {
        double total=0;
        boolean flag=false;
        for (order f1:orderList){
           if (f1.getcId()==op.getcId()){
               flag=true;
               System.out.println(f1);
               total=total+f1.getDish().getdPrice();
               System.out.println("---------------------------------------------------------");
           }
        }
        System.out.println("total amount of order is "+total);
        if (flag==false){
            System.out.println("Your order list is empty");
            System.out.println("Let's order something....");
        }

    }

    @Override
    public void cancelOrder(customerAcc cac) {
        System.out.println("You want to cancel your order");
        System.out.println("1.Yes\n2.No");
        int op=sc.nextInt();
        switch (op){
            case 1:
                for (order o1:orderList) {
                    if (o1.getcId()==cac.getcId()) {
                        orderList.remove(o1);
                        System.out.println("Your All order will be canceled");
                    }
                }
                break;
            case 2:
                System.out.println("Enjoy your food...");
                break;
            default:
                System.out.println("you chose invalid item....");

        }
    }

    @Override
    public void deleteAccount(customerAcc cac) {
        System.out.println("Delete your account \n1.Yes\n2.No");
        int op=sc.nextInt();
        switch (op){
            case 1:
                cl.remove(cac);
                System.out.println("Your account deleted successfully.....");
                break;
            case 2:
                System.out.println("Enjoy the services....");
                System.out.println("Thank you.......");
                break;
            default:
                System.out.println("invalid choice.......");
        }

    }

    @Override
    public void removeCustomer() {
        System.out.println("enter the customer id");
        int id=sc.nextInt();
        System.out.println("Enter customer phone");
        long pn=sc.nextLong();
        System.out.println("Enter the password..");
        int ps=sc.nextInt();
        boolean flag=false;
        for (customerAcc a1:cl){
            if (a1.getcId()==id && a1.getPhoneNo()==pn && a1.getcPassword()==ps){
                cl.remove(a1);
                flag=true;
                System.out.println("Account removed Successful.....");
            }
        }
        if (flag==false){
            System.out.println("Not fiend Any account with this details......");
        }

    }

    @Override
    public void viewFoodList() {
        System.out.println("What you want......");
        System.out.println("1.All items..");
        System.out.println("2.Only veg items...");
        System.out.println("3.Only non-veg items...");
        int op=sc.nextInt();
        ResServiceImpl l=new ResServiceImpl();
        boolean flag=false;
        switch (op){
            case 1:
                for (FoodItems a1: dList){
                    flag=true;
                    System.out.println(a1);
                    System.out.println("-----------------------------------------------------------------");
                }
                if (flag==false){
                    System.out.println("Not any food fiend in the list");
                }
                break;
            case 2:
                for (FoodItems a1: dList) {
                    if (a1.getdType().equalsIgnoreCase("veg")){
                        flag=true;
                        System.out.println(a1);
                        System.out.println("-------------------------------------------------------------");
                    }
                }
                if (flag==false){
                    System.out.println("Not any non-veg food fiend in the list");
                }
                break;
            case 3:
                for (FoodItems a1: dList) {
                    if (a1.getdType().equalsIgnoreCase("non-veg")){
                        flag=true;
                        System.out.println(a1);
                        System.out.println("-------------------------------------------------------------");
                    }
                }
                if (flag==false){
                    System.out.println("Not any veg food fiend in the list");
                }
                break;
            default:
                System.out.println("Invalid chose.....");
        }


    }

    @Override
    public void customerCreateAccount() {
        Scanner sc=new Scanner(System.in);
        System.out.println("please provide the details");
        System.out.println("Provided Customer id is "+cId);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your Email id");
        String email=sc.next();
        System.out.println("Enter your phone number");
        long pn=sc.nextLong();
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        System.out.println("Enter your gender");
        char gen=sc.next().charAt(0);
        System.out.println("Enter Your password");
        int pass =sc.nextInt();

        boolean flag=false;
        for (customerAcc a1:cl){
            if (a1.getEmailId().equalsIgnoreCase(email) || a1.getPhoneNo()==pn){
                flag=true;
                System.err.println("Email id or phone number is Already Exist");
            }
        }
        if (flag==false){
            cl.add(new customerAcc(name,email,pn,age,gen,cId++,pass));
            System.out.println("Your Account Created Successfully.....");
        }else {
            System.out.println("Please try Again.....");
        }


    }
}
