package com.pluralsight;

public class SalesContract extends Contract{

    private double salesTax ;
    //never changes
    private double recordingFee = 100;
    private double processingFee;
    private boolean isFinanced;

    public SalesContract(String date, String name, String email, Vehicle vehicleSold,
                         double salesTax, double recordingFee, double processingFee, boolean isFinanced) {
        super(date, name, email, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice() + salesTax + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}




/* Sales tax amount 5%
        Recording Fee $100
        Processing Fee $295 for vehicle under 10,000 , $495 for all others
        Finance Yes/No
        Monthly Payment - All loans are 4.25% for 48 months if price is 10,000 or more
            if not 10,000 or more, 5.25% for 24 months
     */

    //todo: overrides for getTotalPrice and getMonthlyPayment();

}
