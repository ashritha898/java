class Test {
    Test getObj() {
        return this;
    }

    void show() {
        System.out.println("this keyword example");
    }
}

public class currentobject {
    public static void main(String[] args) {
        Test t = new Test();
        t.getObj().show();  // method chaining using this
    }
}
