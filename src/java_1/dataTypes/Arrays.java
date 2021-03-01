package java_1.dataTypes;

class Arrays {

    static void printNums() {
//        Programmatically print the nums array to the console.  Print each number on a new line.  The nums array is defined on this class.
        System.out.println("printNums() Method: ");
        int[] nums = new int[]{10,23,3,4,5,2,1};
        for(Integer i : nums) {
            System.out.println(i);
        }
    };

    static void greet(String name) {
//        Randomly greet the person with a random greeting found in the greetings array.
//        For every greeting in the greetings array :
/*        ex : craig => greet() => "Hello Craig"
               "ABRAM" => greet() => "Hola Abram"
               "maTT => greet() => "أهلا و سهلا Matt"
 */
        System.out.println("greet() Method: ");
        String[] greetings = new String[]{"Hello","Howdy","Hallo","Hola","Bonjour","Ciao","أهلا و سهلا"};
        for(String s : greetings) {
            System.out.println(s + name);
        }
    };

    static boolean[] bitsToBinaries() {
//        Programmatically convert the bit array of 1's and 0's into a binary array of true and false. return the 'converted' array.
//        ex : bitsToBinaries() => [false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false]
        System.out.println("bitsToBinaries() Method: ");
        int[] bits = new int[]{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
        for(Integer i : bits) {
            if(i == 0){
                System.out.println("false");
            }
            else if(i == 1){
                System.out.println("true");
            }
            else{
                System.out.println("Value is not 0 or 1...");
            }
        }
        return null;
    };

    String[] keepColors() {
//        In this class is an array called "colors".  Programmatically remove the elements that do NOT have a color associated with it.  Return the filtered color array of elements that have a color associated with it.
//        ex : keepColors() => ["bluebird","yellow bumblebee","black spider", "green monkey","pink","black bird","Great White Lakes","white bible","green quran", "red herring", "Black Sea"]
        System.out.println("keepColors() Method: ");
        String[] colors = new String[]{"bluebird","yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","Matterhorn","Great White Lakes","torah","white bible","green quran", "red herring", "Black Sea"};
//        Create a filteredColorsArr
        return null;
    }

    public static void main(String[] args) {
        printNums();
        greet(" Christopher");
        bitsToBinaries();
    }

}







