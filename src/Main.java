public class Main {
     public static void main(String[] args) {

         SUV Ford = new SUV("Ranger",false,"Black");
         Ford.move(40,0);
         Ford.accelerate(20);
         Ford.accelerate(-60);
         System.out.println("Current gear :" + Ford.getCurrentGear());
         System.out.println("Current gear :" + Ford.getCurrentSpeed());
    }
}
