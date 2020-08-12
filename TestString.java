
public class TestString {

    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        char c = sentence.charAt(0);
        System.out.println(c);

        char[] ch = sentence.toCharArray();
        System.out.println(ch.length == sentence.length());

        String substring = sentence.substring(3);
        System.out.println(substring);

        String substring2 = sentence.substring(3,25);
        System.out.println(substring.equals(substring2));

        String[] sub = sentence.split(",");
        for (String su : sub){
            System.out.println(su);
        }

        String str = "Garen";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(sentence.lastIndexOf("了"));
        // 是否包含此字符串
        // System.out.println(sentence.contains("击杀"));

        String s = sentence.replaceFirst(",", "");
        System.out.println(s);
    }
}