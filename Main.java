package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        Pyramid pattern =new Pyramid();
        pattern.Output();

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs MyStory = new Adlibs();
        System.out.println(MyStory.story("Riya Goyal", "17", "Blue"));
        
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        String m = "I MAKE BREAD";
        Replace Stringfortesting = new Replace();
        System.out.println(Stringfortesting.charReplace(m ,2, 'T'));
        

    }
}
