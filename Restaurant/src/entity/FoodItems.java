package entity;

public class FoodItems {
    private String dName;
    private String dType;
    private double dPrice;
    private int rid;

    public FoodItems(String dName, String dType, double dPrice,int rid) {
        this.dName = dName;
        this.dType = dType;
        this.dPrice = dPrice;
        this.rid=rid;
    }

    public int getRid() {
        return rid;
    }

    public String getdName() {
        return dName;
    }

    public String getdType() {
        return dType;
    }

    public double getdPrice() {
        return dPrice;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    @Override
    public String toString() {
        return "FoodItems{" +
                "dName='" + dName + " " +
                ", dType='" + dType + " " +
                ", dPrice=" + dPrice +
                '}';
    }
}
