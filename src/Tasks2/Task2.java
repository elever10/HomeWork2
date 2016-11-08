package Tasks2;

/**
 * Created by elve on 11/8/2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int b = 100;
        int w = 10;
        double k = 0.05;
        op(b,w,k);
    }


    public static void op (int b, int w, double k){

        double nb = 0;

        // let's calculate commision
        double com = w*k;

        // let's calculate total withdraw with commission
        double tw = w + com;

        if (b >= tw) {
            nb = nb + (b-tw);
            System.out.println("OK " + com + " " + nb);
        }
         else {
             System.out.println("NO");
         }

    }
}
