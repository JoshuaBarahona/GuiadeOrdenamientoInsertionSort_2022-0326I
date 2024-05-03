public class App {
    public static void insertionSort (int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                
            }
            arr[j + 1] = key;
        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, metodo de ordenamiento por inserción");
        int[] arr = { 12, 11, 13, 5, 6};
        
        System.out.println("Arreglo original: ");
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
        System.out.println("===============================");
        insertionSort(arr);

        System.out.println("Arreglo ordenado: ");
        for (int num : arr){
            System.out.println(num + " ");
        } 
        
    }
}
