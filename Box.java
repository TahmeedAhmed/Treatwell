public class Box {

    // calling the method with parameters (test cases)
    public static void main(String []args){
        System.out.println("\n2x5"); draw(2,5);
        System.out.println("\n5x5"); draw(5,5);
        System.out.println("\n4x3"); draw(4,3);
        System.out.println("\n5x5"); draw(5,5);
        System.out.println("\n6x2"); draw(6,2);
        System.out.println("\n2x2"); draw(2,6);
        System.out.println("\n1x2"); draw(1,2);
        System.out.println("\n2x1"); draw(2,1);
    }


    static void draw(int w, int h){

        // validation to ensure numbers entered are greater than 1
        if (w <= 1 || h <= 1) {
            System.out.println("Grid needs to be at least 2x2");
            return;
        }

        // char box to represent the box
        char[][] box = new char[w][h];

        for (int i = 0; i < h; i++) {
            // Top left and bottom left corners
            if (i == 0) {
                box[0][i] = '┌';
                box[w - 1][i] = '└';
            }

            // Top right and bottom right corners
            else if (i == h - 1) {
                box[0][i] = '┐';
                box[w - 1][i] = '┘';
            }

            // Top and bottom
            else {
                box[0][i] = '-';
                box[w-1][i] = '-';
            }
        }

        // left and right (but not top and bottom)
        for (int i = 1; i < w - 1; i++) {
            box[i][0] = '|';
            box[i][h - 1] = '|';
            //box[i][i] = ' ';
        }

        // Printing the table
        for(int k = 0; k < w; k++){
            for(int l = 0; l < h; l++)  System.out.print(box[k][l] + " ");
            System.out.println();
        }
    }

}
