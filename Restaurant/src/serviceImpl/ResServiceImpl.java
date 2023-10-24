package serviceImpl;

import entity.FoodItems;
import entity.RestaurantAddAccount;
import servicess.ResServicess;
import java.util.ArrayList;
import java.util.Scanner;

public class ResServiceImpl implements ResServicess {
private static int rId=10001;
public static ArrayList<RestaurantAddAccount> l1= new ArrayList<>();
public static ArrayList<FoodItems> dList =new ArrayList<>();
Scanner sc=new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.println("Please provide the details....");
        System.out.println("Provided Restaurant id is "+rId);
        System.out.println("Enter the the name of the Restaurant");
        String rName=sc.next();
        System.out.println("Enter the city name ");
        String city=sc.next();
        System.out.println("Enter pin code ");
        int pinCo=sc.nextInt();
        System.out.println("Enter Owner name");
        String oName=sc.next();
        System.out.println("Enter the Owner phone number");
        long pn=sc.nextLong();
        System.out.println("Enter the aadhaar number");
        long adh=sc.nextLong();
        System.out.println("Enter Owner Age");
        int age=sc.nextInt();
        System.out.println("Enter the password");
        int pas=sc.nextInt();
        boolean fl=false;
        for (RestaurantAddAccount a1:l1){
            if(a1.getoAadhaarNo()==adh){
            fl=true;
            break;
            }
        }
        if (fl==false){
            l1.add(new RestaurantAddAccount(rName,rId++,city,pinCo,oName,pn,adh,age,pas));
            System.out.println("Restaurant add successful.....");
        }else {
            System.err.println("The Aadhaar number already exist");
            System.out.println("Please try with different Aadhaar number");
        }

    }

    @Override
    public void updateAccount(RestaurantAddAccount rs) {
        System.out.println("Enter What you Want to update");
        System.out.println("1.Update restaurant name\n2.Update City");
        System.out.println("3.Update PinCode\n4.Update Owner Name");
        System.out.println("5.Update Owner Phone Number\n6.Update Owner Age\n7.Update password");
        System.out.println("8.Exit From Here");
        int chose=sc.nextInt();

        if (rs != null){
            switch (chose){
                case 1:
                    System.out.println("Recent Restaurant Name is "+rs.getrName());
                    System.out.println("Enter the new Restaurant name");
                    String rn=sc.next();
                    rs.setrName(rn);
                    System.out.println("New Restaurant name is "+rs.getrName());
                    break;
                case 2:
                    System.out.println("Recent City is "+rs.getCity());
                    System.out.println("Enter the new City name");
                    String ct=sc.next();
                    rs.setCity(ct);
                    System.out.println("New City name is "+rs.getCity());
                    break;
                case 3:
                    System.out.println("Recent PinCode is "+rs.getrName());
                    System.out.println("Enter the new PinCode");
                    int pc=sc.nextInt();
                    rs.setPinCode(pc);
                    System.out.println("New PinCode is "+rs.getPinCode());
                    break;
                case 4:
                    System.out.println("Recent Owner Name is "+rs.getoName());
                    System.out.println("Enter the new Owner name");
                    String on=sc.next();
                    rs.setoName(on);
                    System.out.println("New Owner name is "+rs.getoName());
                    break;
                case 5:
                    System.out.println("Recent Phone Number is "+rs.getoPho());
                    System.out.println("Enter the new Phone Number");
                    long pn=sc.nextLong();
                    rs.setoPho(pn);
                    System.out.println("New Phone number is "+rs.getoPho());
                    break;
                case 6:
                    System.out.println("Recent Owner age is "+rs.getoAge());
                    System.out.println("Enter the new Age");
                    int ag=sc.nextInt();
                    rs.setoAge(ag);
                    System.out.println("New Age is "+rs.getoAge());
                    break;
                case 7:
                    System.out.println("Recent Password is ****"+rs.getoPasswoed()%10);
                    System.out.println("Enter the new New password");
                    int ps=sc.nextInt();
                    rs.setoPasswoed(ps);
                    System.out.println("New Password is "+rs.getrName());
                    break;
                case 8:
                    System.out.println("Going back to home page....");
                    break;
                default:
                    System.out.println("Invalid chose......");

            }
        }
    }

    @Override
    public void removeRes() {
        System.out.println("Enter the Restaurant name");
        String rName=sc.next();
        System.out.println("Enter Restaurant id");
        int id=sc.nextInt();
        System.out.println("enter Restaurant password ");
        int pas=sc.nextInt();
        boolean flag=false;
        for (RestaurantAddAccount a1:l1){
            if (a1.getrName().equalsIgnoreCase(rName) && a1.getrId()==id && a1.getoPasswoed()==pas){
                l1.remove(a1);
                flag=true;
                System.out.println("Restaurant Removed Successful.....");
            }
        }
        if (flag==false){
            System.out.println("Not found this restaurant....");
            System.out.println("Please enter valid details....");
        }
    }

    @Override
    public void viewAllAccount() {
        if (l1.isEmpty()){
            System.out.println("Not found Any Restaurant");
        }else {
            for (RestaurantAddAccount r1:l1){
                System.out.println(r1.getrName()+"\t"+r1.getrId()+"\t"+r1.getCity()+"\t"+r1.getPinCode()+"\t"+r1.getoName()+"\t"+r1.getoPho());
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
            }
        }

    }

    @Override
    public void viewAccount(RestaurantAddAccount acc) {
        System.out.println("ID\t\tR NAME\tCITY\tPIN CODE\tOWNER NAME\t PHONE\t AADHAAR\t AGE \tPASSWORD");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(acc.getrId()+"\t"+acc.getrName()+"\t"+acc.getCity()+"\t"+acc.getPinCode()+"\t"+acc.getoName()+"\t"+acc.getoPho()+"\t"+acc.getoAadhaarNo()+"\t"+ acc.getoAge()+"\t"+acc.getoPasswoed());
    }

    @Override
    public void removeAccount(RestaurantAddAccount acc) {
        System.out.println("you want to delete your account");
        System.out.println("1.Yes\n2.No");
        int x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println("please conform your id");
                int id=sc.nextInt();
                System.out.println("please enter your password");
                int pas=sc.nextInt();
                boolean flag =false;
                for (RestaurantAddAccount a1:l1){
                    if (a1.getrId()==id && a1.getoPasswoed()==pas && a1.getrId()==acc.getrId()){
                        l1.remove(acc);
                        flag=true;
                        System.out.println("Account Delete Successful");
                    }
                }
                if (flag==false){
                    System.out.println("Your id And password not matched........");
                }
        }

    }

    @Override
    public void viewFoodList(RestaurantAddAccount acc) {
        if (dList.isEmpty()){
            System.out.println("Food list id empty");
        }else {
            for (FoodItems f1:dList){
                if(f1.getRid()==acc.getrId()) {
                    System.out.println(f1);
                    System.out.println("-------------------------------------------------------------------------------------------");
                }
            }
        }
    }

    @Override
    public void addFood(RestaurantAddAccount acc) {
        System.out.println("Enter the Dish name ");
        String dish=sc.next();
        System.out.println("Enter the dish type");
        String type=sc.next();
        System.out.println("Enter price of the dish");
        double price=sc.nextDouble();

        dList.add(new FoodItems(dish,type,price,acc.getrId()));

    }

    @Override
    public void removeFood(RestaurantAddAccount acc) {
        System.out.println("enter thr Dish name");
        String fd=sc.next();
        for (FoodItems f1:dList){
            if (f1.getRid()==acc.getrId()){
                dList.remove(f1);
                System.out.println("The dish Will be removed.....");
            }
        }
    }
}
