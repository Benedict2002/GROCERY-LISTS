package ArrayLists;

import java.util.Scanner;

public class main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList grocerylist = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println(" Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocerylist.printGroceryItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;


            }
        }

    }
    public static void printInstructions(){
        System.out.println("\n Press");
        System.out.println("\t 0 - to print choice option");
        System.out.println("\t 1 - to print list of grocery items");
        System.out.println("\t 2 - to add items to the list");
        System.out.println("\t 3 - to modify item to the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item from the  list");
        System.out.println("\t 6 - to to quit application");
    }
    public static void addItem(){
        System.out.print(" Enter item on grocery list : ");
        grocerylist.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter item number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item : ");
        String newItem = scanner.nextLine();
        grocerylist.modifyGroceryItem(itemNumber-1,newItem);
    }
    public static void removeItem(){
        System.out.print("Enter item number : ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        grocerylist.removeGroceryItem(itemNumber-1);
    }
    public static void searchForItem(){
        System.out.print("Item for search : ");
        String searchItem = scanner.nextLine();
        if (grocerylist.findItem(searchItem)!=null){
            System.out.println("Found "+searchItem+" item in the grocery list");
        }else{
            System.out.println(searchItem+" not found");
        }
    }
}
