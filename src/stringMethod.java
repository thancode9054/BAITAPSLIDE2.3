public class stringMethod {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CharAt();
        System.out.println(toLowerCase());
        System.out.println(toUpperCase());
        compareTo();
        compareToIgnoreCase();
        CharArray();
        System.out.println(concat());
        System.out.println(indexOf());
        System.out.println(replace());

    }

    public static void CharAt() {
        String s = "Lap trinh Java";
        System.out.println(s.charAt(5));
    }

    public static String toLowerCase() {
        String s = "Lap trinh Java";
        String s1 = s.toLowerCase();
        return s1;
    }

    public static String toUpperCase() {
        String s = "Lap trinh Java";
        String s1 = s.toUpperCase();
        return s1;
    }

    public static void compareTo() {
        String s1 = "Lap trinh Java";
        String s2 = "Huong doi tuong";
        String s3 = "lap trinh java";
        int n1 = s1.compareTo(s2);
        System.out.println(n1);
        int n2 = s1.compareTo(s2);
        System.out.println(n2);
        int n3 = s1.compareTo(s1);
        System.out.println(n3);
        int n4 = s1.compareTo(s3);
        System.out.println(n4);

    }

    public static void compareToIgnoreCase() {
        String s1 = "Lap trinh Java";
        String s2 = "lap trinh java";
        int n = s1.compareTo(s2);
        System.out.println(n);

    }

    public static void CharArray() {
        String s1 = "abcd";
        char[] arr = s1.toCharArray();
        System.out.println(arr);

    }

    public static String concat() {
        String s1 = "abcd";
        String s2 = "xyz";
        s1 = s1.concat(s2);

        return s1;
    }

    public static int indexOf() {
        String s1 = "Lap trinh OOP Java";
        char ch = 'a';
        int n = s1.indexOf(ch);
        return n;

    }

    public static String replace() {
        String s1 = "Lap trinh OOP Java";
        s1 = s1.replace('a', 'b');
        return s1;

    }

}
