public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {

            // reversing each array
            for(int i = 0; i < (image[0].length + 1)/2; i++){
                // swapping
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1];
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
               
    }
}
