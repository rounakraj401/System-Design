import Context.EVVehicle;
import Context.NormalVehicle;
import Context.SportsVehicle;
import Context.Vehicle;
import Strategy.DriveStrategy;
import Strategy.EVDrive;
import Strategy.NormalDrive;
import Strategy.SportsDrive;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Vehicle vehicle = new NormalVehicle(new NormalDrive());
         vehicle.drive();

         vehicle= new EVVehicle(new EVDrive());
         vehicle.drive();

         vehicle = new SportsVehicle(new SportsDrive());
         vehicle.drive();
    }
}