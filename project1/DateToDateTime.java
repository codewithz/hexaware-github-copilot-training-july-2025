

public class DateToDateTime {
   // Write a method to convert a LocalDate to LocalDateTime
   public static java.time.LocalDateTime convertToDateTime(java.time.LocalDate date) {
       return date.atStartOfDay();
   }    

    public static void main(String[] args) {
         java.time.LocalDate date = java.time.LocalDate.of(2023, 10, 1);
         java.time.LocalDateTime dateTime = convertToDateTime(date);
         System.out.println("Converted LocalDate to LocalDateTime: " + dateTime);
    }   
  
}
