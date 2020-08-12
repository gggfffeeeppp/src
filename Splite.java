public class Splite {
    public static void main(String[] args) {
        String s = "序号 \\t\\s学院\\t\\s班级\\t\\s学号\\t\\s姓名\\t\\n";
        String[] ss = new String[5];
        ss =s.split("");
        ss[4]=ss[4].trim();
        System.out.println(ss);

        // public String toString(){
        //     return ss;
        // }
    }
}