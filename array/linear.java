package array;

public class linear {
    public static int search(String[] food, String key) {
        for (int i = 0; i < food.length; i++) {
            if (food[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] food = {"dosa", "rice", "sambar"};
        String key = "rice"; // Change the key to a valid food item
        int index = search(food, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
