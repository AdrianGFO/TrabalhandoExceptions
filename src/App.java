
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.Entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

System.out.print("Room number: ");
Integer roomNumber = sc.nextInt();
System.out.print("Check-in date (dd/MM/yyyy): ");
Date checkin  = sdf.parse(sc.next());
System.out.print("Check-out date (dd/MM/yyyy): ");
Date checkout = sdf.parse(sc.next());

if(!checkin.after(checkout)){
        Reservation reserva = new Reservation(roomNumber, checkin, checkout);
        System.out.println(reserva.toString());
} else{
    System.out.println("o check-out não pode ser antes do check-in!");
}
        
    }
}
