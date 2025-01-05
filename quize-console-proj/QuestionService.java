import java.beans.JavaBean;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[]=new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What Language you loved?", "java", "Javascript", "Python", "C++", "java");
        questions[1] = new Question(1, "What Language you loved?", "java", "Javascript", "Python", "C++", "java");
        questions[2] = new Question(1, "What Language you loved?", "java", "Javascript", "Python", "C++", "java");
        questions[3] = new Question(1, "What Language you loved?", "java", "Javascript", "Python", "C++", "java");
        questions[4] = new Question(1, "What Language you loved?", "java", "Javascript", "Python", "C++", "java");
    }

    public void palyQuize() {

        int i=0;
        for(Question q:questions){
            System.out.println("Question Number :" +q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner input=new Scanner(System.in);
            selection[i]=input.nextLine();
            i++;

        }

        for(String s:selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score=0;

        for(int i=0;i<questions.length;i++){
            Question q=questions[i];
            String ans=q.getAnswer();

            String userAns=selection[i];

            if(ans.equals(userAns)){
                score++;
            }
        }
        System.out.println("You'r score is : "+score);
    }

}
