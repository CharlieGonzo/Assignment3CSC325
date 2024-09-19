Employee Payroll System
Overview
This project simulates a payroll system for an agency, containing various types of employees such as executives, staff employees, and interns. The system uses a class hierarchy, with StaffMember as the abstract base class. Each employee subclass implements the pay() method, which determines how much they should be paid.

Class Structure
StaffMember (Abstract Class):
The base class for all employees. Stores common employee information such as name, address, and phone number. Cannot be instantiated directly.

Executive, StaffEmployee, Intern, etc.:
These are subclasses of StaffMember representing different employee types. Each class has its own implementation of the pay() method. For example, interns receive no pay, while executives get a salary with an additional bonus.

How It Works
The Staff class manages an array of StaffMember objects, filled with instances of different employee subclasses. The payday() method iterates over the array, printing each employee's details and calculating their pay. This is done using polymorphism, as each employee type has its own pay() method.

