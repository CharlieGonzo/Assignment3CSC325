package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList

        staffList[0] = new Executive("Peter", "123 main street", "555-1245", "111-22-24",5000);
        staffList[1] = new StaffEmployee("John", "456 main street", "432-2345", "434-5323", 3000);
        staffList[2] = new StaffEmployee("Bob", "789 main street", "958-3785", "343-5323", 2800);
        staffList[3] = new TempEmploee("Chris", "846 lane", "864-2811", "422-5642", 20);
        staffList[4] = new StaffEmployee("Charlie", "484 lane", "434-5352", "322-5354", 3100);
        staffList[5] = new StaffEmployee("Brad", "432 lane", "987-3432", "342-8472", 2900);
    }

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
}

//-----------------------------------------------------------------
//  Pays all staff members.
//-----------------------------------------------------------------
public void payday ()
{
    double amount;

    for (int count=0; count < staffList.length; count++)
    {
        System.out.println(staffList[count]);

        amount = staffList[count].pay();  // polymorphic

        if (amount == 0.0)
            System.out.println("Thanks!");
        else
            System.out.println("Paid: " + amount);

        System.out.println("-----------------------------------");
    }
}