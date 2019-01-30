public class arraysExercise {
    public static void main(String[] args) {
        int [][] numbers= {
                {1,2,1,3,1,4},
                {3,4,3,4,3,4},
                {5,6,5,6,3,4},
                {4,9,7,9,7,9}
        };

//        for (int i = numbers.length-1; i <numbers.length ; i++) {
//            for (int j = 1; j <numbers[i].length-1 ; j++) {
////                System.out.print(numbers[0][j]);
//
//                System.out.print(numbers[numbers.length-1][j]);
//
//            }
//            System.out.println();

//        }



        for (int i = 1; i <numbers.length-1 ; i++) {

                System.out.print(numbers[i][0]);
//            System.out.print(numbers[i][numbers[i].length-1]);

            System.out.println();



        }


    }
}
