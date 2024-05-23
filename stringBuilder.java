package day4;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Siddhant");
        System.out.println(sb);
        //char at index 0
        System.out.println(sb.charAt(0));
        //set char at index 0
        sb.setCharAt(0, 'B');
        System.out.println(sb);
        //inserting
        sb.insert(2, 'i');
        System.out.println(sb);
        //deleting that extra i
        sb.delete(2, 3);
        System.out.println(sb);
        //append
        sb.append(" ");
        sb.append("A");//str = str +"A"
        sb.append("c");
        sb.append("h");
        sb.append("a");
        sb.append("r");
        sb.append("y");
        sb.append("a");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
