import java.util.Arrays;

public class Question {

    private int quesNo;
    private String questionDesc;
    private String[] options = new String[4];
    private int answer;

    public Question() {
    }

    public Question(int quesNo, String questionDesc, String[] options, int answer) {
        this.quesNo = quesNo;
        this.questionDesc = questionDesc;
        this.options = options;
        this.answer = answer;
    }

    public int getQuesNo() {
        return quesNo;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }




    public String[] getOptions(){
        return options;
    }
    public int getAnswer() {
        return answer;
    }

    public void setQuesNo(int quesNo) {
        this.quesNo = quesNo;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }


    public void setOptions(String[] options) {
        this.options = options;
    }


    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "quesNo=" + quesNo +
                ", questionDesc='" + questionDesc + '\'' +
                ", options=" + Arrays.toString(options) +
                ", answer='" + answer + '\'' +
                '}';
    }
}
