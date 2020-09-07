package chapter4;

public class CreatePolicies {
    public static void main(String[] args) {
        CarInsurancePolicy first=new CarInsurancePolicy();
        CarInsurancePolicy second=new CarInsurancePolicy(456,3);
        CarInsurancePolicy thrird=new CarInsurancePolicy(789,12,"New Castle ");
        first.display();
        second.display();
        thrird.display();
    }
}
