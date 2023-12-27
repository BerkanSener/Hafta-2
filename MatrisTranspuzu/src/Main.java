public class Main {
    public static void main(String[]args){
        int [][] matris = { {2,3,4},{5,6,4} };
        int[][] transpoz =  new int[matris.length+1][matris[0].length-1];

        for (int i = 0; i < matris.length ; i++) {
            for (int j = 0; j < matris.length; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

                System.out.println("Matris : ");
                for (int[] row : matris) {
                    for (int num : row) {
                        System.out.println(num + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nTranspoz : ");
                for (int[] row : transpoz) {
                    for (int num : row) {
                        System.out.println(num + " ");
                    }
                    System.out.println();
                }
            }
        }
