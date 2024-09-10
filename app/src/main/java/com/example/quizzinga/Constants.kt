package com.example.quizzinga

import android.view.inputmethod.CorrectionInfo

object Constants {
    const val USER_NAME: String = "usr_name"
    const val Total_Questions: String="total_questions"
    const val Correct_Answer: String = "correct_answers"
    fun getquestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1 , "What country does this flag belongs to?",
            R.drawable.germany,"Argentina","Germany","India","America",2
        )
        questionsList.add(que1)


        val que2 = Question(
            2 , "What animal is this?",
            R.drawable.tiger,"Cat","Dog","Tiger","Zebra",3
        )
        questionsList.add(que2)

        val que3 = Question(
            3 , "What country does this flag belongs to?",
            R.drawable.india,"India","Germany","Australia","America",1
        )
        questionsList.add(que3)

        val que4 = Question(
            4 , "What country does this flag belongs to?",
            R.drawable.pakistan,"Argentina","Germany","India","pakistan",4
        )
        questionsList.add(que4)

        val que5 = Question(
            5 , "What is the name of this cricketer?",
            R.drawable.switz,"Hungary","India","Switzerland","Pakistan",3
        )
        questionsList.add(que5)

        val que6 = Question(
            6 , "Which fish is this?",
            R.drawable.shark,"Whale","Shark","Piranha","Dolphin",2
        )
        questionsList.add(que6)

        val que7 = Question(
            7 , "What is the name of this cricketer?",
            R.drawable.hungary,"Hungary","India","Switzerland","Pakistan",1
        )
        questionsList.add(que7)

        val que8 = Question(
            8 , "Which car is this?",
            R.drawable.lambo,"Audi","Nano","Lamborghini","BMW",3
        )
        questionsList.add(que8)

        val que9 = Question(
            9 , "Name the cartoon character?",
            R.drawable.jerry,"Tom","Doraemon","Nobita","Jerry",4
        )
        questionsList.add(que9)
        return questionsList
    }
}