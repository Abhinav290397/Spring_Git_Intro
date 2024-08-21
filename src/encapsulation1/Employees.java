package encapsulation1;

public class Employees {
    //variables/properties/attributes are same.

    private int empId;
    private int age;
    private String name;
    private String email;
    private String mobileNum;
    private String designation;


    //getters - function used to get/fetch the value of private members.
    //setters - function used to set the value of a private member.

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getMobileNum(){
        return mobileNum;
    }
    public void setMobileNum(String mobileNum){
        this.mobileNum = mobileNum;
    }

    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
}
