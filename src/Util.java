public class Util {

    public static void sort(Object [] arr, Comparator comparator) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if( comparator.compare(arr[j], arr[j+1]) == 1) {
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    /*public static void sort(int [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort(Emp [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j].getId() > arr[j+1].getId()) {
                    Emp temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sortBySal(Emp [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j].getSal() > arr[j+1].getSal()) {
                    Emp temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }*/
}
