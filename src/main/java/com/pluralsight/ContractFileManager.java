package com.pluralsight;
import java.io.IOException;
import java.io.FileWriter;

public class ContractFileManager {

    //todo: add method to save the contract by appending it to contracts file

        public static void saveContract(Contract contract) {
            if (contract == null) return;

            try (FileWriter writer = new FileWriter("DealershipFile.csv", true)) {

                if (contract instanceof SalesContract sc) {

                    writer.write(String.format(
                            "Sale |%s|%s|%s|%s|%.2f|%.2f|%.2f|%s|%.2f|%.2f%",
                            sc.getDate(),
                            sc.getName(),
                            sc.getEmail(),
                            sc.getVehicleSold().getVehicleVin(),
                            sc.getSalesTax(),
                            sc.getProcessingFee(),
                            sc.isFinanced() ? "yes" : "no",
                            sc.getTotalPrice(),
                            sc.getmonthlyPayment()
                    ));
                } else if (contract instanceof LeaseContract lc) {
                    writer.write(String.format(
                            "LEASE|%s|%s|%s|%s|%.2f|%.2f|%.2f|%.2f%n",
                            lc.getDate(),
                            lc.getName(),
                            lc.getEmail(),
                            lc.getVehicleSold().getVehicleVin(),
                            lc.getExpectedEndingValue(),
                            lc.getLeaseFee(),
                            lc.getTotalPrice(),
                            lc.getmonthlyPayment()

                    ));
                }

            } catch (IOException e){
                System.out.println("Error saving contract" + e.getMessage());

            }

        }
 }


