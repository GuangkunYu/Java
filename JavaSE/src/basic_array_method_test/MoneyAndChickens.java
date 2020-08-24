package basic_array_method_test;

/*
    需求：
        我国古代数学家张邱建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，
        鸡雏三值钱一。百钱买百鸡。问鸡翁、鸡母、鸡雏各几何？
 */

public class MoneyAndChickens {
    public static void main(String[] args) {
        int monney = 100;
        buyCheickens(monney);
    }

    public static void buyCheickens(int monney) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if ((z % 3 == 0) && (5 * x + 3 * y + z / 3 == 100)) {
                    System.out.println("鸡翁" + x + "只");
                    System.out.println("鸡母" + y + "只");
                    System.out.println("鸡雏" + z + "只");
                    System.out.println("--------------");
                }
            }
        }
    }
}
