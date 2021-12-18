public class BlocksnTower {
    static int[] reqBlocks(int[] arr, int h) {
        int[] reqArr = new int[3];
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == h) {
                        reqArr[0] = arr[i];
                        reqArr[1] = arr[j];
                        reqArr[2] = arr[k];
                    }
                }
            }
        }
        for (int m = 0; m < reqArr.length; m++) {
            for (int n = m + 1; n < reqArr.length; n++) {
                if (reqArr[m] < reqArr[n]) {
                    int temp = reqArr[m];
                    reqArr[m] = reqArr[n];
                    reqArr[n] = temp;
                }
            }
        }
        return reqArr;
    }

    public static void main(String[] args) {
        int[] blockHeight = { 45, 30, 12, 18, 10, 40 };
        int[] towerHeight = { 40, 115 };
        int[] arrOne = reqBlocks(blockHeight, towerHeight[0]);
        int[] arrTwo = reqBlocks(blockHeight, towerHeight[1]);
        for (int a : arrOne) {
            System.out.print(a + ",");
        }
        System.out.print("\b & ");
        for (int b : arrTwo) {
            System.out.print(b + ",");
        }
        System.out.print("\b ");

    }
}
