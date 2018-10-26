package mcdc.quizwiz;

public class QuestionLibrary {

    private String mTopic[] = {
            "Agile Scrum",
            "Lean Start-up",
            "Design Thinking"
    };

    private String mQuestions[] = {
            // Agile Scrum 1-5
            "Q1/5: What is the desired final outcome when undertaking an Agile Scrum?",
            "Q2/5: What kind of sprint meeting focuses on what the team achieved during a sprint? ",
            "Q3/5: Agile Development differs from Waterfall as it focuses on: ",
            "Q4/5: What questions do User stories focus on? ",
            "Q5/5: How do sprint members keep track of their work/progress?",
            // Lean Start-up 6-10
            "Q1/5: Lean start-up methodology focuses on creating a _______ and iterating/learning from it. ",
            "Q2/5: In Lean Start-up methodology, what do you 'Measure'? ",
            "Q3/5: What might you do if one of your assumptions are proven wrong? ",
            "Q4/5: What is the feedback loop called in Lean Start-up Methodology? ",
            "Q5/5: Lean Start-up methodology tells us that start-up success can be ________. ",
            // Design Thinking 11-15
            "Q1/5: What should you not do while 'empathising? ",
            "Q2/5: Which step focuses on 'Converging on potential solutions'?",
            "Q3/5: Which step focuses on creating a visual representation of your idea that your users can interact with? ",
            "Q4/5: What should the 'Test' stage aim to achieve? ",
            "Q5/5: What are good tools to use for the 'Empathy' stage? "


    };

    private String mChoices [][] = {
            // Agile Scrum
            {"Minimum Viable Product (MVP)", "Prototype", "Potentially shippable product", "Blueprint"},
            {"Daily Scrum","Sprint Retrospective","Sprint Planning","Sprint Review"},
            {"Processes","Planning","Incremental Iteration","Documentation"},
            {"Who, What, Why","What, How, When","When, Where, Why","Who, How, Why"},
            {"Sprint Planning", "Product Backlog", "User Stories", "Burndown Chart"},
            // Lean Start-up
            {"Company", "Finished product", "MVP", "Start-up"},
            {"Functionality", "Customers' Reactions", "Profitability", "Quality"},
            {"Prototype", "Perservere", "Pivot", "Performance Review"},
            {"Build, Measure, Learn", "Build, Iterate, Deliver", "Prototype, Discover, Ideate", "Develop, Measure, Deliver"},
            {"Fast", "Discovered", "Easy", "Taught"},
            // Design Thinking
            {"Observing", "Judging", "Engaging", "Listening"},
            {"Ideate", "Empathise", "Prototype", "Define"},
            {"Define", "Ideate", "Empathise", "Prototype"},
            {"Gather feedback from users", "Create a final product", "Get feedback from developers", "Develop a MVP"},
            {"Empathy maps", "Agile Scrum", "Google", "Personal Experiences"},


    };

    private String mCorrectAnswers[] = {"Potentially shippable product", "Sprint Review", "Incremental iteration", "Who, What, Why", "Burndown Chart", "MVP", "Customers' Reactions", "Pivot", "Build, Measure, Learn", "Taught", "Judging", "Ideate", "Prototype", "Gather feedback from users", "Empathy maps"};

    public String getTopic(int a) {
        String topic = mTopic[a];
        return topic;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }
//  Choices are in an array - array starts at 0 therefore choice 1 is array index 0.
    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
