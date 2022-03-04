import java.util.*;
public class Seating {
    public static void main(String[] args) {
        String[][] originalChart = {{"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao", "Nicole", "Jennifer", "Michelle", null, null},
                                    {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "", "Rely"},
                                    {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justine Liu", "Jeffery", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}};
        String[][] newChart = new String[3][12];
        ArrayList<String> usedNames = new ArrayList<String>();
        for (int i = 0; i < originalChart.length; i++) {
            for (int j = 0; j < originalChart[0].length; j++) {
                if (originalChart[i][j] == null) {
                    newChart[i][j] = null;
                } else {

                }
                System.out.print(newChart[i][j] + ". ");
            }
            System.out.println();
        }
    }
}
