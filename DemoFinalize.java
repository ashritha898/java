class DemoFinalize {
    int id;

    DemoFinalize(int id) {
        this.id = id;
        System.out.println("Object " + id + " created");
    }

    // finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object " + id);
    }
public static void main(String[] args) {
        DemoFinalize obj1 = new DemoFinalize(1);
        DemoFinalize obj2 = new DemoFinalize(2);

        obj1 = null;
        obj2 = null;

        // Suggest JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method");
    }
}

    
