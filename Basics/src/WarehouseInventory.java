public class WarehouseInventory {
    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        int totalA = 0;
        int totalB = 0;

        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 0;

        // Calculate total of Section A
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        // Calculate total of Section B
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        // Compare totals
        String status;
        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        System.out.println("Section A Total: " + totalA
                + " | Section B Total: " + totalB
                + " | Status: " + status
                + " | Highest Quantity: " + highest
                + " (" + highestSection
                + ", Item " + (highestIndex + 1) + ")");
    }
}