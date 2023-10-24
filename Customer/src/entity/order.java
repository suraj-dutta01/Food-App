package entity;

public class order {
    private FoodItems dish;
    private int cId;

    public order(FoodItems dish, int cId) {
        this.dish = dish;
        this.cId = cId;
    }

    public FoodItems getDish() {
        return dish;
    }

    public void setDish(FoodItems dish) {
        this.dish = dish;
    }

    public int getcId() {
        return cId;
    }

    @Override
    public String toString() {
        return "order{" +
                "dish=" + dish +
                ", cId=" + cId +
                '}';
    }
}
