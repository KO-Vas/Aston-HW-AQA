import java.util.Arrays;

public class Product {
      private String name;
      private String productionDate;
      private String manufacturer;
      private String countryOfOrigin;
      private double price;
      private boolean reservationStatusIsBooked;


      public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price,
                     boolean reservationStatusIsBooked) {
          this.name = name;
          this.productionDate = productionDate;
          this.manufacturer = manufacturer;
          this.countryOfOrigin = countryOfOrigin;
          this.price = price;
          this.reservationStatusIsBooked = reservationStatusIsBooked;
      }
      public void printInfo() {
          System.out.println("Product Name: " + name);
          System.out.println("Production Date: " + productionDate);
          System.out.println("Manufacturer: " + manufacturer);
          System.out.println("Countre Of Origin: " + countryOfOrigin);
          System.out.println("Price: " + price);
          System.out.println("Reservation Status: " + (reservationStatusIsBooked ? "Occupied" : "Available"));

           }
}

class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Xiaomi Poco C75", "24.11.2024", "Xiaomi Corp.",
                "China", 11490, true);
        productsArray[1] = new Product("Honor Magic 7 Pro", "17.08.2024",
                "Huawei Technologies Co. Ltd.", "China", 129990, false);
        productsArray[2] = new Product("Samsung Galaxy S25 Ultra", "12.10.2024", "Samsung Corp.",
                "Republic Of Korea", 179990, true);
        productsArray[3] = new Product("Xiaomi Redmi Note 14 Pro", "02.01.2025", "Xiaomi Corp.",
                "China", 37990, false);
        productsArray[4] = new Product("Samsung Galaxy S25+", "10.02.2025", "Samsung Corp.",
                "Republic of Korea", 139990, true);

        System.out.println("\nСмартфорны:");
        Arrays.stream(productsArray).forEach(Product::printInfo);

        Park park = new Park(3);
        park.addAttraction("Батут", "09:00-18:00", 300);
        park.addAttraction("Колесо обозрения", "09:00-22:00", 500);
        park.addAttraction("Автодром", "09:00-18:00", 700);

        park.printAttractionsInfo();
    }
}
class Park {
    private Attraction[] attractions;
    private int count;

    class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
    }

    public Park(int capacity) {
        attractions = new Attraction[capacity];
        count = 0;
    }

    public void addAttraction(String name, String hours, double price) {
        if (count < attractions.length) {
            attractions[count++] = new Attraction(name, hours, price);
        }
    }

    public void printAttractionsInfo() {
        System.out.println("Аттракционы:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + attractions[i].name +
                    "\n   Время работы: " + attractions[i].workingHours +
                    "\n   Цена: " + attractions[i].price);
        }

    }
}

