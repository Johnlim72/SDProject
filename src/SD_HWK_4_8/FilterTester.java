package SD_HWK_4_8;

import java.util.*;

/**
 *
 * @author John
 */
public class FilterTester {
    /*
     that returns an array containing all elements of a that are accepted by the ﬁlter. 
     Test your class by ﬁltering an array of strings and accepting all strings that contain at most three characters. */

    public static String[] filter(String[] a, Filter f) {

        int length = a.length;
        String[] newArray = new String[length];

        String current;
        boolean currentFilter;

        int i;
        int j = 0;
        for (i = 0; i < length; i++) {
            current = a[i];
            currentFilter = f.accept(current);
            if (currentFilter == true) {
                newArray[j] = current;
                j++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int count = 10;
        Random g = new Random();

        String[] test = new String[count];
        String a1 = "a";
        String a2 = "aa";
        String a3 = "aaa";
        String a4 = "aaaa";
        String a5 = "aaaaa";

        int i;
        int j;
        int rand;
        System.out.print("Tests: ");
        for (i = 0; i < count; i++) {
            rand = g.nextInt(5) + 1;
            if (rand == 1) {
                test[i] = a1;
            } else if (rand == 2) {
                test[i] = a2;
            } else if (rand == 3) {
                test[i] = a3;
            } else if (rand == 4) {
                test[i] = a4;
            } else if (rand == 5) {
                test[i] = a5;
            }
            System.out.print(test[i] + " ");
        }

        Filter filt = new Filter() {
            public boolean accept(String x) {
                String str = (String) x;
                int length = str.length();
                if (length <= 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        System.out.println("\n");
        
        String[] result = filter(test, filt);

        int resultLength = result.length;
        int k;
        for (k = 0; k < resultLength; k++) {
            if (result[k] != null) {
                System.out.println(result[k]);
            }
        }
    }
}
