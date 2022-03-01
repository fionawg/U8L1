public class Seating {
    private String[][] originalChart;
    private String[][] newChart;

    public String[][] changeSeating(){
        originalChart = new String[3][12];
        String[] row1 = {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao", "Nicole", "Jennifer", "Michelle", "no seat", "no seat"};
        String[] row2 = {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", "", "Rely"};
        String[] row3 = {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justine Liu", "Jeffery", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"};
        originalChart[0] = row1;
        originalChart[1] = row2;
        originalChart[2] = row3;
    }
}
