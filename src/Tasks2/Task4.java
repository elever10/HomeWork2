package Tasks2;

/**
 * Created by elve on 11/8/2016.
 */
public class Task4 {

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Jane";
        double withdrawal = 250;

        income(balances, ownerNames, ownerName, withdrawal);

    }

    public static void income(int array1[], String array2[], String ownerName, double withdrawal){
        double balance = 0;
        String user = "";

        for (int i = 0; i <= 4; i++){
            if(array2[i] == ownerName){
                balance = array1[i];
                user = array2[i];
                break;
            }

        }

        if(user != ""){
            double n_balance = balance + withdrawal;
            System.out.println(user + " " + n_balance);
        }
        else {
            System.out.println("User with such name was not found");
        }
    }

}
