public class Main {
    public static void main(String args[]){
        String str[] = {"Эта", "строка", "является","текстом." };
        System.out.println("Исходный массив:");
        for(String s: str){
            System.out.print(s +" ");
        }
        System.out.println("\n");
        str[2] = "так же является";
        str[3] = "текстом!";
        System.out.println("Измененный массив:");
        for(String s: str){
            System.out.print(s+" ");
        }

    }
}
