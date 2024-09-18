public class linearSearch { 
    public static int linearSearchData(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menuItem[] = {"paneer tikka", "dal makhani", "chole bhature"};

        System.out.println( linearSearchData(menuItem, "dal makhani"));
    }
}
