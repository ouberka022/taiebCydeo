public class Constructor {
    public String name;
    public int age;
    public Constructor(){
        System.out.println("A");
    }
    public Constructor(String name){
       this();
       System.out.println("B");
    }
    public Constructor(String name, int age){
        System.out.println("C");
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor("Taieb");
        System.out.println(c1);
    }

}
