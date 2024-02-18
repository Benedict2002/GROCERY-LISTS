package ArrayLists;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> grocerylist = new ArrayList<>();

   public  void addGroceryItem(String item){
       grocerylist.add(item);
   }
   public  void  printGroceryItems(){
       System.out.println("You have "+grocerylist.size()+" items in your grocery list");
       for (int i =0; i<grocerylist.size();i++){
           System.out.println((i+1)+" . "+ grocerylist.get(i));
       }

   }
   public  void modifyGroceryItem(int position , String newItem){
       grocerylist.set(position,newItem);
       System.out.println(" Grocery list "+ (position+1)+" has been modified");
   }

   public void  removeGroceryItem(int position){
       String theItem= grocerylist.get(position);
   }
   public String findItem(String searchItem){
      // boolean exists = grocerylist.contains(searchItem);
        int position = grocerylist.indexOf(searchItem);
        if (position >=0){
            return grocerylist.get(position);
        }
        return null;
   }
}
