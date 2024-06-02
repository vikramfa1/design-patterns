package designPatterns.SingletonDesignPattern;

public class SingletonClass {

    private static volatile SingletonClass instance;
    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if(instance == null) {
            synchronized (SingletonClass.class) {
                if(instance == null) {
                    return new SingletonClass();
                }
            }
        }
        return instance;
    }

    private void printData() {
        System.out.println("printing data");
    }

    public static void main(String args[]) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.printData();
    }
}
