package entity;

public class RestaurantAddAccount {
    private String rName;
    private int rId;
    private String city;
    private int pinCode;
    private String oName;
    private long oPho;
    private final long oAadhaarNo;
    private int oAge;
    private int oPasswoed;


    public RestaurantAddAccount(String rName, int rId, String city, int pinCode, String oName, long oPho, long oAadhaarNo, int oAge, int oPasswoed) {
        this.rName = rName;
        this.rId = rId;
        this.city = city;
        this.pinCode = pinCode;
        this.oName = oName;
        this.oPho = oPho;
        this.oAadhaarNo = oAadhaarNo;
        this.oAge = oAge;
        this.oPasswoed = oPasswoed;
    }

    public String getrName() {
        return rName;
    }

    public int getrId() {
        return rId;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getoName() {
        return oName;
    }

    public long getoPho() {
        return oPho;
    }

    public long getoAadhaarNo() {
        return oAadhaarNo;
    }

    public int getoAge() {
        return oAge;
    }

    public int getoPasswoed() {
        return oPasswoed;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public void setoPho(long oPho) {
        this.oPho = oPho;
    }

//    public void setoAadhaarNo(long oAadhaarNo) {
//        this.oAadhaarNo = oAadhaarNo;
//    }

    public void setoAge(int oAge) {
        this.oAge = oAge;
    }

    public void setoPasswoed(int oPasswoed) {
        this.oPasswoed = oPasswoed;
    }

    @Override
    public String toString() {
        return "RestaurantAddAccount{" +
                "rName='" + rName + " " +
                ", rId=" + rId +
                ", city='" + city + " " +
                ", pinCode=" + pinCode +
                ", oName='" + oName + " " +
                ", oPho=" + oPho +
                ", oAadhaarNo='" + oAadhaarNo + " " +
                ", oAge=" + oAge +
                ", oPasswoed=" + oPasswoed +
                '}';
    }
}
