//Ocean Lu
//CS141
//Assignment 2
//10.23.17

public class ParkingTicketDemo {

    public static void main(String[] args) {
        System.out.println("\n... set minutes purchased to 60, and");
        System.out.println(" parked for 125 minutes...");
        // Create a ParkedCar object.
        // The car was parked for 125 minutes.
        ParkedCar car = new ParkedCar("Volkswagen", "2002", "Red", "3RHZ147", 125);

        // Create a ParkingMeter object. 60 minutes were purchased.
        ParkingMeter meter = new ParkingMeter(60);

        // Create a PoliceOfficer object.
        PoliceOfficer officer = new PoliceOfficer("Joe Friday", "4788");

        // Let the officer patrol.
        ParkingTicket ticket = officer.patrol(car, meter);

        // Did the officer issue a ticket?
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }
        //...
        // Test case 2: change minutes to 60
        System.out.println("\n... change minutes parked to 60, and");
        car.setMinutesParked(60);
        ticket = officer.patrol(car, meter);
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }

        //Test case 3: change minutes to 61
        System.out.println("\n... change minutes parked to 61, and");
        car.setMinutesParked(61);
        ticket = officer.patrol(car, meter);
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }

        //Test case 4: change car model to 2010
        System.out.println("\n... change car model to 2010, and");
        car.setModel("2010");
        ticket = officer.patrol(car, meter);
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }

        //Test case 5: change minutes purchased to 70
        System.out.println("\n... change minutes purchased to 70, and");
        meter.setMinutes(70);
        ticket = officer.patrol(car, meter);
        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("No crimes committed!");
        }
    }
}

