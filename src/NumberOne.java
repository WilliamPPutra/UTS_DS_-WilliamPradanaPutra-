public class NumberOne {
    public static void main(String[] args) {
        int [] bil = {2, 3, 6, 12, 13, 25, 33, 35, 66, 80, 200, 321, 241, 444, 666};
        System.out.println("|          Bilangan Ganjil Genap          |");
        System.out.println("===========================================");
        System.out.print("Bilangan Genap  :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("========== William Pradana Putra ===========");
    }
}