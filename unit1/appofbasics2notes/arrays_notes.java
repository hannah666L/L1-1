package unit1.appofbasics2notes;

public class arrays_notes {
    
    public static void main(String[] args){
       
        // Define an array named food that contains 4 elements
        
        // To define all elements in array: Type[] name = {item1, ..., item4};
        String[] food = {"chocolate", "ice cream", "donut", "pasta"};
        /* To define elements in array one at a time: 
        Type[] name = new Type[#ofelements];
        name[0] = value;
        ...
        name[i] = value;
        */
        

        // Use a for loop to iterate over every element in food and print the value of each element
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }

    }
}
