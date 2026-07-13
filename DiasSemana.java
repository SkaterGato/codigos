public class DiasSemana {
    public static void main(String[] args) {
        var dias = new String[]{"LUN", "MAR", "MIE", "JUE", "VIE", "SAB", "DOM"};
        var i = 0;

        // Iteración mediante bucle while
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }
    }
}