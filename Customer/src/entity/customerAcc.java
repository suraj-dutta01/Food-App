package entity;

public class customerAcc {
    private String cName;
    private String emailId;
    private long phoneNo;
    private int cAge;
    private char gender;
    private int cPassword;
    private int cId;

    public customerAcc(String cName, String emailId, long phoneNo, int cAge, char gender,int cId,int cPassword) {
        this.cName = cName;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        this.cAge = cAge;
        this.gender = gender;
        this.cId=cId;
        this.cPassword=cPassword;
    }

    public int getcPassword() {
        return cPassword;
    }

    public void setcPassword(int cPassword) {
        this.cPassword = cPassword;
    }

    public int getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public String getEmailId() {
        return emailId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public int getcAge() {
        return cAge;
    }

    public char getGender() {
        return gender;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setcAge(int cAge) {
        this.cAge = cAge;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "customerAcc{" +
                "cName='" + cName + " " +
                ", emailId='" + emailId + " " +
                ", phoneNo=" + phoneNo +
                ", cAge=" + cAge +
                ", gender=" + gender +
                ", cPassword=" + cPassword +
                ", cId=" + cId +
                '}';
    }
}
