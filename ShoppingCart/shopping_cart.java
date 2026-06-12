// //THERE ARE PREDEFINED ITEMS IN A SHOP AND THEIR QUANTITY ALONG WITH PRICE USER WILL INPUT HIS REQUIREMENT AND HE WILL GET THE PRICE IF WITHIN AVAILABLE QUANTITY ELSE ERROR
 import java.util.Scanner;
 class ShoppingCart 
 {
     public static void main(String args[]) 
     {

         Scanner sc = new Scanner(System.in);

         int applePrice = 50;
         int appleQuantity = 25;

         int bananaPrice = 15;
         int bananaQuantity = 68;

         int milkPrice = 55;
         int milkQuantity = 12;

         System.out.println("Menu:");
         System.out.println("1. Apple: ₹" + applePrice + " | Available: " + appleQuantity);
         System.out.println("2. Banana: ₹" + bananaPrice + " | Available: " + bananaQuantity);
         System.out.println("3. Milk: ₹" + milkPrice + " | Available: " + milkQuantity);

         System.out.print("Enter your choice: ");
         int choose = sc.nextInt();

         System.out.print("Enter quantity: ");
         int quantity = sc.nextInt();

         int stock;

         if (choose == 1) 
             {
             if (quantity <= appleQuantity) 
                 {
                 System.out.println("Price will be: " + (applePrice * quantity));
                 stock = appleQuantity - quantity;
                 System.out.println("New stock left: " + stock);
             } 
             else 
                 {
                 System.out.println("Not enough stock available");
             }
         } 
         else if (choose == 2) 
             {
             if (quantity <= bananaQuantity) 
                 {
                 System.out.println("Price will be: " + (bananaPrice * quantity));
                 stock = bananaQuantity - quantity;
                 System.out.println("New stock left: " + stock);
             } else 
                 {
                 System.out.println("Not enough stock available");
             }
         } 
         else if (choose == 3) 
             {
             if (quantity <= milkQuantity) 
                 {
                 System.out.println("Price will be: " + (milkPrice * quantity));
                 stock = milkQuantity - quantity;
                 System.out.println("New stock left: " + stock);
             } else 
                 {
                 System.out.println("Not enough stock available");
            }
         } 
         else 
             {
             System.out.println("Invalid choice");
         }

         sc.close();
    }
 }