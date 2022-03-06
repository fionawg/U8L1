import java.util.*;
public class Seating {
    public static void main(String[] args) {
        String[][] originalChart = {{"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao", "Nicole", "Jennifer", "Michelle"},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "", "Rely"},
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justine Liu", "Jeffery", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}};
        String[][] newChart = {{null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}};
        ArrayList<String> usedNames = new ArrayList<String>();
        //populates newChart with new seats
        int ranRow = 0;
        int ranCol = 0;
        for (int i = 0; i < newChart.length; i++) {
            for (int j = 0; j < newChart[i].length; j++) {
                ranRow = (int) (Math.random() * 3);
                if (ranRow == 0) {
                    ranCol = (int) (Math.random() * originalChart[0].length);
                } else {
                    ranCol = (int) (Math.random() * newChart[i].length);
                }
                while (usedNames.contains(originalChart[ranRow][ranCol])){
                    ranRow = (int) (Math.random() * 3);
                    if (ranRow == 0) {
                        ranCol = (int) (Math.random() * originalChart[0].length);
                    } else {
                        ranCol = (int) (Math.random() * newChart[i].length);
                    }
                }
                newChart[i][j] = originalChart[ranRow][ranCol];
                usedNames.add(originalChart[ranRow][ranCol]);
            }
        }
        //moves the empty seat to the end
        for (int r = 0; r < newChart.length; r++){
            for (int c = 0; c < newChart[r].length; c++){
                if (newChart[r][c].equals("")){
                    String name = newChart[2][11];
                    newChart[2][11] = "empty";
                    newChart[r][c] = name;
                }
            }
        }
        //makes sure people are not in same seat
        for (int rx = 0; rx < newChart.length; rx++){
            for (int cx = 0; cx < newChart[rx].length; cx++){
                if (newChart[rx][cx].equals(originalChart[rx][cx])){
                    ranRow = (int) (Math.random() * 3);
                    while (rx == ranRow) {
                        ranRow = (int) (Math.random() * 3);
                    }
                    if (ranRow == 0) {
                        ranCol = (int) (Math.random() * originalChart[0].length);
                        while (ranCol == cx){
                            ranCol = (int) (Math.random() * originalChart[0].length);
                        }
                    } else {
                        ranCol = (int) (Math.random() * newChart[rx].length);
                        while (ranCol == cx){
                            ranCol = (int) (Math.random() * originalChart[0].length);
                        }
                    }
                    String tempTwo = newChart[rx][cx];
                    newChart[rx][cx] = newChart[ranRow][ranCol];
                    newChart[ranRow][ranCol] = tempTwo;
                }
            }
        }

        for (int s = 0; s < newChart.length; s++){
            for (int p = 0; p < newChart[s].length; p++){
                System.out.print(newChart[s][p] + ". ");
            }
            System.out.println();
        }
    }
}