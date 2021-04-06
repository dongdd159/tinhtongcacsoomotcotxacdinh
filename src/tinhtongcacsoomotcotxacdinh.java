import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class tinhtongcacsoomotcotxacdinh {
    public static void main(String[] args) {
        double[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row:");
        int n = scanner.nextInt();
        System.out.print("Enter column:");
        int m = scanner.nextInt();
        array = new double[n][m];
        for (int i=0;i<n;i++){
            for (int j=0; j<m;j++){
                System.out.println("array[" + i + "][" + j + "] = " + ":");
                array[i][j]=scanner.nextFloat();
            }
        }
        System.out.println("nhập thứ tự cột muốn tính: ");
        int index =scanner.nextInt();
        System.out.print("tổng các phần tử của cột là:"+ sumcolumn(array,index));
    }
    public static double sumcolumn(double[][] arr,int n){
        double sum =0;
        for (int i=0;i< arr.length;i++){
            sum += arr[i][n];
        }
        return sum;
    }
}
