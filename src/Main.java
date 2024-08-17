public class Main {
    public static void main(String[] args) {
        int min,a;
        int[] array = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        System.out.printf(" Array: ");
        printArray(array);

        for (int i=0;i<4;i++){
            min =i;
            for(int j=i+2;j<array.length;j++)
                if(array[j]<array[min])
                   min =array[j];


            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;

            System.out.print("Adım " + (i + 1) + ": ");
            printArray(array);
        }

    }
    public static void printArray(int[] array){
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}