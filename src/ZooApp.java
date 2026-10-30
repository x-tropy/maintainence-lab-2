public class ZooApp {
    public static void main(String[] args) {
        Zoo zL = new Zoo("London", 10);
        Zoo zT = new Zoo("Tokyo", 20);
        Zoo zN = new Zoo("New York", 35);
        Zoo zP = new Zoo("Paris", 40);
        Zoo zB = new Zoo("Beeston", 42);
        System.out.println("numZoos: " + Zoo.numZoos);
    }
}
