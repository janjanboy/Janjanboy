package chapter4;

public class CreatePolicies {
    public static void main(String[] args) {
        CarInsurancePolicy first=new CarInsurancePolicy(123);
        CarInsurancePolicy second=new CarInsurancePolicy(456,3);
        CarInsurancePolicy thrird=new CarInsurancePolicy(789,12,"New Castle ");
        first.display();
        second.display();
        thrird.display();
    }
}
