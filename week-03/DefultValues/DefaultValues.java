public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bo;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default byte value: " + obj.b);
        System.out.println("Default short value: " + obj.s);
        System.out.println("Default int value: " + obj.i);
        System.out.println("Default long value: " + obj.l);
        System.out.println("Default float value: " + obj.f);
        System.out.println("Default double value: " + obj.d);
        System.out.println("Default char value: " + obj.c);
        System.out.println("Default boolean value: " + obj.bo);
    }

    //This would NOT work for local variables because Java does not assign default values to local variables inside methods.Local variables must be initialized before they are used,therwise the program will cause a compilation error.
     
}