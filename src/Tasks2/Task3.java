package Tasks2;

import java.util.StringJoiner;

/**
 * Created by elve on 11/8/2016.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Own", "Lane"};

        String ownerName = "Own";
        double with = 490;

        withdr(balances, ownerNames, ownerName, with);
    }


    public static void withdr(int array1[], String array2[], String ownerName, double with) {
        double balance = 0;
        double twith = 1.05 * with;
        String user = "";

        // let's find user balance
        for (int i = 0; i <= 4; i++) {
            if (array2[i] == ownerName) {
                balance = array1[i];
                user = array2[i];
                break;
            }
        }
        // let's calculate withdraw with commission
        if (balance >= twith) {
            double new_balance = balance - twith;
            System.out.println(user + " " + with + " " + new_balance);
        } else {
            System.out.println(user + " NO");
        }
    }
}

