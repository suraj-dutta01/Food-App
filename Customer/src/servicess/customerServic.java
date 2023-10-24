package servicess;

import entity.customerAcc;

public interface customerServic {
    void customerCreateAccount();
    void updateMyAccount(customerAcc op);
    void viewMyAccount(customerAcc op);
    void orderDish(customerAcc op);
    void cancelOrder(customerAcc op);
    void deleteAccount(customerAcc op);
    void viewFoodList();
    void viewMyOrder(customerAcc op);
    void removeCustomer();

}
