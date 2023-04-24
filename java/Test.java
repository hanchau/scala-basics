public class Test {
    private int id;
    private int age;

    public Test(int id, int age){
        this.id = id;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public void printState(){
        System.out.println(this.id);
        System.out.println(this.age);
    }

    public static void main(String[] args){

        System.out.println("Inside Main method");
        return;
    }

}
