package MyOwn.stringBuffer_;

public class Buffering {
    public static void main(String[] args) {
        StringBuffer bf = new StringBuffer("Hello");
        bf.append(" Java");
        System.out.println(bf);
        bf.insert(2," is Po");
        System.out.println(bf);
        bf.replace(12,bf.length(), "Marco");
        System.out.println(bf);
        bf.delete(0,6);
        System.out.println(bf);
        bf.reverse();
        System.out.println(bf);

        // (oldCapacity * 2 ) + 2

        StringBuffer lol = new StringBuffer();
        System.out.println(lol.capacity()); // 16 by default
        lol.append("Good");
        System.out.println(lol.capacity()); // still is 16
        lol.append(" morning my dear friend."); // now (16*2)+2 = 34  e.g (oldCapacity * 2) + 2
        System.out.println(lol.capacity());
        lol.ensureCapacity(10);
        System.out.println("ensured by 10: " + lol.capacity());
        lol.ensureCapacity(50); // 34 + 16 = 50               .....
        System.out.println("ensured by 50: " + lol.capacity()); // (34*2)+2 = 70
    }
}
