package CYDEO.days.day17_string;

public class SmsParts {
    public static void main(String[] args) {
        String s = "Sender: <James Bond>. From number: [112-454-232]. + Message: {\"I love programming\"}";

        String sender = s.substring(s.indexOf('<')+1, s.indexOf('>'));
        String number = s.substring(s.indexOf('[')+1, s.indexOf(']'));
        String text = s.substring(s.indexOf('{')+1);

        System.out.println(sender);
        System.out.println(number);
        System.out.println(text);
    }
}
