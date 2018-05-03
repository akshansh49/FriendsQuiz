package com.example.akshansh.secret;

public class Questions
{
    public static String mQuestions[]={
            "Who is the youngest friend?",
            "Who is the female paleontologist both Ross and Joey date?",
            "Where has Rachel NOT worked?",
            "You're over me? When were you under me?\" Who said it?",
            "Which volume of encyclopedia did Joey buy?",
            "What state did Chandler get sent to after falling asleep at work?",
            "What is the name of Rachel's hairless cat?",
            "What does Joey wear to Monica and Chandler's wedding?",
            "What does Monica receive from her father?"
    };

    private String mChoices[][]={
            {"Joey","Rachel","Phoebe","Monica"},
            {"Charlie","Cherie","Charlene","Charlotte"},
            {"Gucci","Fortuna Fashions","Ralph Lauren","Bloomingdale's"},
            {"Rachel","Monica","Chandler","Ross"},
            {"J","V","Z","X"},
            {"Montana","Alabama","Oklahoma","Kansas"},
            {"Baldy","Mittens","Mrs.Whiskerson","Lady Meow"},
            {"Police Uniform","Army Uniform","SwimSuit","Astronaut Uniform"},
            {"DollHous","Pot Brownie","Old Trophy","Porche"},
    };

    private String mCorrectAnswers[]={"Rachel","Charlie","Gucci","Ross","V","Oklahoma","Mrs.Whiskerson","Army Uniform","Porche"};

    public String getQuestion(int a)
    {
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a)
    {
        String choice=mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a)
    {
        String choice=mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice=mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice=mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a)
    {
        String answer=mCorrectAnswers[a];
        return answer;
    }
}
