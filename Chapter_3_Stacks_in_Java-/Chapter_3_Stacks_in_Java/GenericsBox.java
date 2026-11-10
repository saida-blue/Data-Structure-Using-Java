public class GenericsBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        GenericsBox<Integer> numberBox = new GenericsBox<>();
        numberBox.set(25);
        System.out.println("Number: " + numberBox.get());

        GenericsBox<String> nameBox = new GenericsBox<>();
        nameBox.set("Ali");
        System.out.println("Name: " + nameBox.get());
    }
}
