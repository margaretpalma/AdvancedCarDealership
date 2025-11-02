package com.pluralsight;

public class SalesContract extends Contract{

    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean finance;


    public SalesContract(String date, String name, String email, Vehicle vehicleSold, double salesTax, double recordingFee,
                         double processingFee, boolean finance) {
        super(date, name, email, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
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

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
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
