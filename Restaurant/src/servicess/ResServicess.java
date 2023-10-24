package servicess;

import entity.RestaurantAddAccount;

public interface ResServicess {
void createAccount();
void updateAccount(RestaurantAddAccount op);
void viewAllAccount();
void viewAccount(RestaurantAddAccount op);
void removeAccount(RestaurantAddAccount op);
void addFood(RestaurantAddAccount op);
void removeFood(RestaurantAddAccount op);
void viewFoodList(RestaurantAddAccount op);
void removeRes();

}
