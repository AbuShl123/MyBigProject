package MyOwn.tasks.AscendingConsecutive;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AscendingConsecutiveNumbers {
    public static boolean ascending (String str) {
        int a, b;
        for (int j = 1; j <= str.length() / 2; j++) {
            int c = 0;
            for (int i = 0; i < str.length()-j; i+=j) {
                try {
                    a = Integer.parseInt(str.substring(i,i+j));
                    b = Integer.parseInt(str.substring(i+j, i+j*2));
                    if (a != b-1){
                        c += 1;
                        break;
                    }
                } catch (Exception e) {
                    c += 1;
                    break;
                }
            }
            if (c == 0) return true;
        }
        return false;
    }
}