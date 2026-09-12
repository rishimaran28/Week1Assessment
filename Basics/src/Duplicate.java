public class Duplicate {
    public static void main(String[] args){
        int[] seat = {101, 102, 103, 104, 105};
        boolean find = false;
        int found = 0;
        for(int i = 0; i<4;i++){
            for(int j=(i+1);j<5;j++){
                if (seat[i]==seat[j])
                    find = true;
                    found = seat[i];

            }

        }
        if (find)
            System.out.println("Duplicate Seat Number Found: "+found);
        else
            System.out.println("No Duplicate Seats Found ");

    }
}