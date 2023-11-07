public class string {
    public static void main(String[] args) {
        String name="Bipan";
        String name1="Bipan";

        System.out.println(name.toLowerCase());// string into lowercase
        System.out.println(name.toUpperCase());// string into uppercase
        System.out.println(name.equals(name1));//checks  string if it is same
        System.out.println(name.equalsIgnoreCase(name1));//checks  compared string if it is the same ignoring the cases
        System.out.println(name.charAt(3));//prints  character at a position in the given string
        System.out.println(name.indexOf("b"));//prints the position of the given character
        System.out.println(name.contains("a"));//checks if the given character is in the given string
        System.out.println(name.length());//gives length of  string
    }
}
