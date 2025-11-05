package MapExplain;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    static class MyImage {
        String name;
        MyImage(String name) { this.name = name; }
        @Override
        public String toString() { return name; }
    }

    public static void main(String[] args) {

        WeakHashMap<String, MyImage> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println("Before GC: " + imageCache);

        System.gc();
        simulateApplicationRunning();

        System.out.println("After GC (some entries may be cleared): " + imageCache);
    }

    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void loadCache(Map<String, MyImage> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new MyImage("Image 1"));
        imageCache.put(k2, new MyImage("Image 2"));
    }
}
