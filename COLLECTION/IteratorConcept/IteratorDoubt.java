package COLLECTION.IteratorConcept;

public class IteratorDoubt {
    static void main(String[] args) {
        FruitSeller fs = new FruitSeller();
        Fruit ap = fs.getApple();
        ap.taste();
        System.out.println(ap.color());
    }
}
