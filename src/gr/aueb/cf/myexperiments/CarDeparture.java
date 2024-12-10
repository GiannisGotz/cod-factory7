package gr.aueb.cf.myexperiments;

public class CarDeparture {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1012, 1136}, {1317, 1417}, {1015, 1020}};

        int[][] preSortEvents = eventsArr(arr);
        int[][] events = bubbleSort2D(preSortEvents);

        // Print the events array
        for (int i = 0; i < events.length; i++) {
            System.out.println("Time: " + events[i][0] + ", Event: " + (events[i][1] == 1 ? "Arrival" : "Departure"));
        }

        System.out.println();
        System.out.println("Maximum number of cars parked at the same time: " + calculateMaxCars(events));
    }



    public static int[][] eventsArr(int[][] arr) {

        int[][] eventsArrFormed = new int[arr.length * 2][2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            eventsArrFormed[index][0] = arr[i][0];
            eventsArrFormed[index][1] = 1;
            index++;
            eventsArrFormed[index][0] = arr[i][1];
            eventsArrFormed[index][1] = 0;
            index++;
        }
        return eventsArrFormed;
    }

    public static int[][] bubbleSort2D(int[][] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[][] arr, int i, int j) {
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int calculateMaxCars(int[][] arr) {
        int parkedCars = 0;
        int maxParkedCars = 0;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i][1] == 1) {
                    parkedCars++;
                }
                else if (parkedCars < 0) {
                    parkedCars--;
                }
                if (parkedCars > maxParkedCars) {
                    maxParkedCars = parkedCars;
                }
            }
        return maxParkedCars;
    }
}

