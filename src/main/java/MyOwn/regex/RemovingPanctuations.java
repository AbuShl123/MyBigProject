package MyOwn.regex;

public class RemovingPanctuations {
    public static void main(String[] args) {
        String str = "Ja++va (i((s an -obj__#ect- or?><><ie>nt>ed la%!ng%!ua%!ge, #^%&@$!. DATA";
        System.out.println(str.replaceAll("\\p{Punct}", ""));

    }
}
