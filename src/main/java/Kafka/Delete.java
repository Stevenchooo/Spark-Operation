package Kafka;

public class Delete {
    int binary_search(int arr[], int n, int key) {
        assert (arr != null && n > 0);//注意断言的作用
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);//不直接用(left+right)/2是防止越界和提高效率
            if (arr[mid] < key)
                left = mid + 1;
            else if (arr[mid] > key)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }


    void QSort(int arr[], int low, int high) {
        int pivot;
        while (low < high)//优化了递归操作
        {
            pivot = Partition(arr, low, high);
            QSort(arr, low, pivot - 1);
            low = pivot + 1;
        }
    }

    int Partition(int arr[], int low, int high) {
        assert (arr != null && low < high);
        int pivotkey = arr[low];//对于关键字的选取我们可以采取3数取中法或9数取中法，还可以随机取数来保证关键字正好是数组的接近中间位置。
        while (low < high) {
            while (low < high && arr[high] >= pivotkey)
                high--;
            arr[low] = arr[high];//采用替换而不是交换的操作（优化不必要的交换）
            while (low < high && arr[low] <= pivotkey)
                low++;
            arr[high] = arr[low];//采用替换而不是交换的操作
        }
        arr[low] = pivotkey;
        return low;
    }

    public static int partition(int [] array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
}
