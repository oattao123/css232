public class StringsTest {
    public static void main(String[] args) {
        String question = "Sabay Dee Mai?";
        String answars = "Sabay Dee Kha!";

        int k = question.length();
        System.out.println("Total length of questions = " + k);

        String upQuestions = question.toUpperCase();
        String lowQuestions = question.toLowerCase();
        System.out.println("Uppercase of question = " + upQuestions);
        System.out.println("LOwercase of question = " + lowQuestions);

        int index_a = question.indexOf('a');
        System.out.println("index of a = " + index_a);

        String combines = question.concat(answars);
        System.out.println("Concatenate strings = " + combines);

        String example1 = "\'a'\' is a char.";
        String example2 = "Are you hubgry? \nYes, I am.";
        System.out.println("Add quote in string : "  + example1);
        System.out.println("Add enter in string : \n" + example2);

        } 
}
