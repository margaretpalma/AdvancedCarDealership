package com.pluralsight;
import java.io.IOException;
import java.io.FileWriter;

public class ContractFileManager {

    //todo: add method to save the contract by appending it to contracts file

        public static void saveContract(Contract contract) {
            if (contract == null) return;

            try (FileWriter writer = new FileWriter("DealershipContracts.csv", true)) {

                if (contract instanceof SalesContract sc) {

                    writer.write(String.format(
                            "Sale|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%s|%.2f|%.2f%n",
                            sc.getDate(),
                            sc.getName(),
                            sc.getEmail(),
                            sc.getVehicleSold().getVehicleVin(),
                            sc.getVehicleSold().getVehicleYear(),
                            sc.getVehicleSold().getVehicleMake(),
                            sc.getVehicleSold().getVehicleModel(),
                            sc.getVehicleSold().getVehicleType(),
                            sc.getVehicleSold().getVehicleColor(),
                            sc.getVehicleSold().getOdometer(),
                            sc.getVehicleSold().getPrice(),
                            sc.getSalesTax(), sc.getRecordingFee(),
                            sc.getProcessingFee(),
                            sc.isFinanced() ? "Yes" : "No",
                            sc.getTotalPrice(),
                            sc.getmonthlyPayment()
                    ));
                } else if (contract instanceof LeaseContract lc) {
                    writer.write(String.format(
                            "Lease|%s|%s|%s|%d|%d|%s|%s|%s|%s|%d|%.2f|%.2f|%.2f|%.2f|%s|%.2f|%.2f%n",
                            lc.getDate(),
                            lc.getName(),
                            lc.getEmail(),
                            lc.getVehicleSold().getVehicleVin(),
                            lc.getVehicleSold().getVehicleYear(),
                            lc.getVehicleSold().getVehicleMake(),
                            lc.getVehicleSold().getVehicleModel(),
                            lc.getVehicleSold().getVehicleType(),
                            lc.getVehicleSold().getVehicleColor(),
                            lc.getVehicleSold().getOdometer(),
                            lc.getVehicleSold().getPrice(),
                            lc.getExpectedEndingValue(),
                            lc.getLeaseFee(),
                            lc.getmonthlyPayment()
                    ));
                }

            } catch (IOException e){
                System.out.println("Error saving contract" + e.getMessage());

            }

        }
 }


