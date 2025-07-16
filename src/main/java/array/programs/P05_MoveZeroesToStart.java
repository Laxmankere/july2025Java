package array.programs;

import java.util.Arrays;

public class P05_MoveZeroesToStart {
    // Q. Move all zeros to the end of it while maintaining the relative order of non-zero element
        public static void main(String[] args) {
            int[] num = {0, 1, 0, 3, 12};

            int[] result = moveZeroesToStart(num);

            for (int n : result) {
                System.out.print(n + " ");
            }
            System.out.println(Arrays.toString(result));
        }
        public static int[] moveZeroesToStart(int[] num) {
            int index = num.length - 1; // Start from end

            // Step 1: Move non-zero elements to the end
            for (int i = num.length - 1; i >= 0; i--) {
                if (num[i] != 0) {
                    num[index] = num[i];
                    index--;
                }
            }
            // Step 2: Fill the remaining front part with 0s
            while (index >= 0) {
                num[index] = 0;
                index--;
            }

            return num;
        }
    }

