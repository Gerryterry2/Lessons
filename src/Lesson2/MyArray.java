package Lesson2;

public class MyArray {

    String[][] myArrayStr;

    public void getNumbers() {
        int myArrayInt[][];
        for (int i = 0; i < myArrayStr.length; i++) {
            for (int j = 0; j < myArrayStr.length; j++) {
                int myArrayInt [= Integer.parseInt(String.valueOf(myArrayStr));
            }
            System.out.println("Массив стал числовым");
        }

        public void sumArray(int myArrayInt[][]){
            int sum = 0;
            for (int i = 0; i < myArrayStr.length; i++) {
                for (int j = 0; j < myArrayStr.length; j++) {
                    sum += myArrayInt[i][j];
                }
            }
            System.out.println("Общая сумма всех элементова массива равна: " + sum);

        }
    }
}