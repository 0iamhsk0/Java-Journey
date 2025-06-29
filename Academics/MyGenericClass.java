public class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void displayType() {
        System.out.println("Type of data: " + data.getClass().getName());
    }

    public static void main(String[] args) {
        MyGenericClass<Integer> intObj = new MyGenericClass<>(123);
        System.out.println("Data: " + intObj.getData());
        intObj.displayType();

        MyGenericClass<String> strObj = new MyGenericClass<>("Hello, Generics!");
        System.out.println("Data: " + strObj.getData());
        strObj.displayType();
    }
}
