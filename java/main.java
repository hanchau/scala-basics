import Test;

public class main {
    public static void main(){
        test person1 = new test(1, 24);
        System.out.println(person1.getId(), person1.getAge());
        person1.printState();
    }
}