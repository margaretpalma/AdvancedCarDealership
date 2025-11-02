package com.pluralsight;

public class LeaseContract extends Contract {

    private double endingValue;
    private double leaseFee;

    public double getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    /* Expected ending value 50% of original price
    Lease fee 7% of original price
    Monthly payment based on Lease Finanaced at 4.0% for 36 months
     */

    //todo: overrides for getTotalPrice(); and getMonthlyPayment
}
