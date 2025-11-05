
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
<img width="1807" height="747" alt="Main Menu" src="https://github.com/user-attachments/assets/e8689ce9-b428-4562-bf57-eca38c4da5c7" />
<img width="1906" height="643" alt="inventory file " src="https://github.com/user-attachments/assets/c5f8109c-dfde-44fb-aed1-ab932ed2c65d" />
<img width="1734" height="101" alt="formatting error on csv file" src="https://github.com/user-attachments/assets/86a6b2d8-6ca7-47e6-b050-cce6eb32c910" />
<img width="1801" height="538" alt="error" src="https://github.com/user-attachments/assets/9f884a9d-7b37-40ed-b278-e1ce5b886d9b" />
<img width="981" height="614" alt="error in new contract" src="https://github.com/user-attachments/assets/a721a6a6-603a-4313-b174-df6d1938c632" />



