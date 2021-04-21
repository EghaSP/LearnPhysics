package com.eghasp.learnphysics

/**
 * Created by Asus on 13/06/2020.
 */
object Constant {

    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "corret_answer"

    fun getQuestions(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(1, "Pilihlah jawaban yang benar!", R.drawable.no1,"A","B","C","D",4)
        questionsList.add(que1)

        val que2 = Questions(2, "Pilihlah jawaban yang benar!", R.drawable.no2,"A","B","C","D",3)
        questionsList.add(que2)

        val que3 = Questions(3, "Pilihlah jawaban yang benar!", R.drawable.no3,"A","B","C","D",2)
        questionsList.add(que3)

        val que4 = Questions(4, "Pilihlah jawaban yang benar!", R.drawable.no4,"A","B","C","D",4)
        questionsList.add(que4)

        val que5 = Questions(5, "Pilihlah jawaban yang benar!", R.drawable.no5,"A","B","C","D",2)
        questionsList.add(que5)

        val que6 = Questions(6, "Pilihlah jawaban yang benar!", R.drawable.no6,"A","B","C","D",1)
        questionsList.add(que6)

        val que7 = Questions(7, "Pilihlah jawaban yang benar!", R.drawable.no7,"A","B","C","D",4)
        questionsList.add(que7)

        val que8 = Questions(8, "Pilihlah jawaban yang benar!", R.drawable.no8,"A","B","C","D",3)
        questionsList.add(que8)

        val que9 = Questions(9, "Pilihlah jawaban yang benar!", R.drawable.no9,"A","B","C","D",4)
        questionsList.add(que9)

        val que10 = Questions(10, "Pilihlah jawaban yang benar!", R.drawable.no10,"A","B","C","D",3)
        questionsList.add(que10)

        return questionsList
    }
}