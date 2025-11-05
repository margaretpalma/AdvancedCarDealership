
⚡ Advanced Car DealerShip Contract Application ⚡    
```
🔧Features
-Add, Remove, List all Vehicles in dealership inventory
-Filter inventory by: 
  -Price Range 
  -Make/Model
  -Year Range
  -Color
  -Mielage Range
  -Vehicle Type(Car, Truck, Van)
```
```
📃 Contract Creation  📃                
  -Sales Contract
      -5% Sales Tax, $100 Recording Fee, Processing Fee, Optional Financing        
  -Lease Contract
      -Expected Ending Value, Lease Fee, Month Calculation  


-Every contract is appened to DealershipCOntracts.csv
-Each entry includes full vehicle details       
📃                    📃
```

```
📁 Class Breakdown 📁
  -Contract Class- Abstract Parent Class defines shared contract fields and abstact methods
  -Sales Contract Class- Extends "Contract" class - handles sales specific rules and financing login
  -Lease Contract - Extends "Contract" class - Lease values and monthly payments
  -ContractFileManager - Handles saving contracts to file and CSV formatting
  -Dealership Class - Manages Inventory and Vehicle search logic
  -Vehicle Class - Defines a single vehicle object with Year, Make, Model, Type
  -User Interface - Main Program Menu and User Interaction Login
  -DealershipFileManager - Loads Dealership Data from CSV

             
```                            
```
╔══════════════════════════╗
║   ⚡  KEY CONCEPTS  ⚡  ║      
╚══════════════════════════╝
⛓️━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━⛓️
Object Oriented Programming
    -Inheritance
    -Polymorphism
    -Encapsulatoin

Computation and Login
    -Sales and Lease Price calculations

File I/O
  -File Writer and String.format to cleanly format and append contract data
  -Contracts saved persistnetly
```
```
Menus: 
INVENTORY FILE 
<img width="1906" height="643" alt="inventory file " src="https://github.com/user-attachments/assets/74dbfb83-6276-4333-8d43-11f587e6bf27" />

ADD LEASE CONTRACT
<img width="1834" height="1010" alt="working add lease contract" src="https://github.com/user-attachments/assets/8eab53c1-77a3-4595-a82c-fb86c5927b32" />

ERROR - VEHICLE NOT FOUND 
<img width="981" height="614" alt="error in new contract" src="https://github.com/user-attachments/assets/5a28fe50-e679-41a1-b7d9-1e4beb99cc19" />



