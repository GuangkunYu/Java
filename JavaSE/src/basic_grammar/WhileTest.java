package basic_grammar;

/*
    需求：世界最高峰是珠穆朗玛峰（8844.43米=8844430毫米），假如我有一张足够大的纸，它的厚度是0.1毫米，
         请问：我折叠多少次，可以折成珠穆朗玛峰的高度？
 */

public class WhileTest {
    public static void main(String[] args) {
        double mountQomolangma = 8844430;
        double thickness = 0.1;
        int count = 0;
        while (thickness <= mountQomolangma){
            thickness *= 2;
            count ++;
        }
        System.out.println("折叠" + count + "次，可以折成珠穆朗玛峰的高度");
    }
}
