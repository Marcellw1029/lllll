public class App {
    public static void quickSort(int [] arr, int low, int high) {
        if (low < high ) {
            int pi = partition(arr,low,high); //obtener el indice
            quickSort(arr, low, pi - 1); // ordenar recursivamente
            quickSort(arr, pi + 1, high); //ordenar recursivamente

             
        }
        
        
    }
    public static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                
            }
            
        }
        int temp =arr[i + 1];
        arr [i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
        
    }
    public static void main(String[] args) throws Exception {
        int [] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("arreglo ordenado");
        for (int  num : arr) {
            System.out.print(num + " ");
            
        }
        

            
        }
    }

