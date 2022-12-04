package Shape;

public class Main {
    public static void main(String[] args) {
        for(int  i=0; i<5; i++) {
            for (int j=0; j<=i; j++) { //sütun sayısı
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a=1; a<=5; a++){
            for(int s=1; s<=5-a; s++){ //boşluğu hesapladığımız döngü
                System.out.print(" ");
            }
            for (int b=1; b<=a; b++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
