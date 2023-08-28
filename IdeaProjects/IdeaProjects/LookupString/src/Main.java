public class Main {
    public static void main(String[] args) {
        printInformation("Hello world");
        printInformation("");
        printInformation("\t  \n");

        String helloWord = "Hello World";
        System.out.printf("index r is %d %n", helloWord.indexOf('r'));
        System.out.printf("index world is %d %n", helloWord.indexOf("world"));

        System.out.printf("index l is %d %n", helloWord.indexOf('l'));
        System.out.printf("index l is %d %n", helloWord.lastIndexOf('l'));

        System.out.printf("index l is %d %n", helloWord.indexOf('l',3));
        System.out.printf("index l is %d %n", helloWord.lastIndexOf('l', 8));

        String helloWorldLower = helloWord.toLowerCase();
        if(helloWorldLower.equals(helloWord)){
            System.out.println("Match lowercase exactly");
        }

        if(helloWorldLower.equalsIgnoreCase(helloWord)){
            System.out.println("ignore compare lowercase");
        }

        if(helloWord.startsWith("Hello")){
            System.out.println("String start with Hello");
        }

        if(helloWord.endsWith("World")){
            System.out.println("String end with World");
        }

        if(helloWord.contains("World")){
            System.out.println("String contains world");
        }

        if(helloWord.contentEquals("Hello World")){
            System.out.println("Value Match exactly");
        }

    }


    public static void printInformation(String string){
        int stringLength = string.length();
        System.out.printf("String length %d %n",stringLength);

        if(string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("String is blank");
        }

        System.out.printf("First char %c %n", string.charAt(0));

        System.out.printf("last char %c %n", string.charAt(string.length() - 1));
    }
}