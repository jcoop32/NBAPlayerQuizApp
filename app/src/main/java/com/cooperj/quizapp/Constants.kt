package com.cooperj.quizapp

import kotlin.random.Random as Random1

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    val playerNames = arrayListOf<String>("Kyrie Irving",
        "Trae Young", "Stephen Curry", "Damian Lillard","Russell Westbrook", "Steve Nash",
        "James Harden", "Chris Paul", "Patrick Beverly", "Ben Simmons",
        "Stephen Curry", "Seth Curry","Giannis Antetokounmpo", "Blake Griffin",
        "LeBron James","Dwight Howard", "Kevin Durant", "Jrue Holiday",
        "Deandre Jordan", "Tracy McGrady", "Russell Westbrook","Kawhi Leonard",
        "Anthony Davis", "Paul George", "LaMarcus Aldridge", "Jamal Crawford",
        "DeMarcus Cousins", "Draymond Green", "Kyle Lowry", "Vince Carter",
        "Paul Millsap", "Jimmy Butler", "John Wall", "Herb Jones", "Brandon Clarke",
        "Al Horford", "Klay Thompson", "Marc Gasol", "Brandon Ingram",
        "Karl-Anthony Towns", "Carmelo Anthony", "Gordon Hayward", "Dorian Finney-Smith",
        "Derrick Favors", "Andre Drummond", "Kevin Love", "Dirk Nowitzki",
        "Dwyane Wade", "Rudy Gobert", "Hassan Whiteside", "Kemba Walker", "Chris Bosh",
        "Brook Lopez", "Khris Middleton", "Steven Adams", "Pau Gasol",
        "Serge Ibaka", "Nicolas Batum", "Andre Iguodala", "Isaiah Thomas",
        "DeMar DeRozan", "Danilo Gallinari", "Eric Bledsoe", "CJ McCollum",
        "Chandler Parsons", "Tristan Thompson", "Jae Crowder", "Reggie Jackson",
        "George Hill", "Jeff Teague", "Bradley Beal", "JJ Redick", "Donovan Mitchell",
        "Goran Dragic", "Jonas Valanciunas", "Thaddeus Young", "Andrew Wiggins",
        "Kristaps Porzingis", "Danny Green", "Kyle Korver", "Ricky Rubio",
        "Avery Bradley", "Victor Oladipo", "Nikola Vucevic", "Tobias Harris",
        "Nikola Jokic", "Clint Capela", "Rudy Gay", "Trevor Ariza", "Robin Lopez",
        "Enes Kanter", "Bismack Biyombo", "Wesley Matthews", "Mason Plumlee",
        "Cody Zeller", "Evan Fournier", "JR Smith", "Aaron Gordon", "Devin Booker",
        "Tim Duncan", "Kobe Bryant", "Derrick Rose", "Joakim Noah", "Rajon Rondo", "OG Anunoby",
        "Jaren Jackson Jr.", "Jrue Holiday", "Tyrese Maxey", "Pascal Siakam", "Brandon Clarke",
        "Dorian Finney-Smith", "Khris Middleton", "Joel Embiid", "Gary Trent Jr.","Julius Randle",
        "Deandre Ayton", "Desmond Bane", "Cameron Payne", "Matisse Thybulle", "Ayo Dosunmu",
        "Onyeka Okongwu", "Lou Williams", "Clint Capela", "Obi Toppin", "Jordan Clarkson",
        "Fred VanVleet", "Chris Boucher", "Boban Marjanović", "Serge Ibaka", "Monte Morris",
        "Aaron Gordon", "Jeff Green", "Will Barton", "Malik Beasley", "Jarred Vanderbilt",
        "Malik Monk", "Kendrick Nunn", "Miles Bridges", "LaMelo Ball", "P.J. Washington",
        "Montrezl Harrell", "Zach LaVine", "Javonte Green", "Coby White", "Derrick Jones Jr.",
        "Alex Caruso", "Lonzo Ball", "Magic Johnson", "Shaquille O'Neal", "Karl Malone", "Cameron Johnson",
        "Deandre Ayton"
                
    )


    fun nameMap(): Map<String, Int> {
        val hashMap : HashMap<String, Int>
                = HashMap<String, Int> ()

        hashMap.put("Kevin Garnett" , R.drawable.garneke01)
        hashMap.put("Kyrie Irving", R.drawable.irvinky01)
        hashMap.put("Anthony Edwards", R.drawable.edwaran01)
        hashMap.put("Steph Curry", R.drawable.curryst01)
        hashMap.put("Clyde Drexler", R.drawable.drexlcl01)
         hashMap.put("Chris Paul" , R.drawable.paulch01)
         hashMap.put("LeBron James", R.drawable.jamesle01)
         hashMap.put("Ja Morant", R.drawable.moranja01)
         hashMap.put("Ayo Dosunmu", R.drawable.dosunay01)
         hashMap.put("Jonathan Kuminga", R.drawable.kuminjo01)
         hashMap.put("Scottie Barnes" , R.drawable.barnesc01)
         hashMap.put("Michael Jordan", R.drawable.jordami01)
         hashMap.put("Steve Nash", R.drawable.nashst01)
         hashMap.put("Giannis Antetokounmpo", R.drawable.antetgi01)
         hashMap.put("Kevin Durant", R.drawable.duranke01)
        hashMap.put("Bam Adebayo", R.drawable.adebaba01)
        hashMap.put("OG Anunoby", R.drawable.anunoog01)
        hashMap.put("Deandre Ayton", R.drawable.aytonde01)
        hashMap.put("Desmond Bane", R.drawable.banede01)
        hashMap.put("Devin Booker", R.drawable.bookede01)
        hashMap.put("Mikal Bridges", R.drawable.bridgmi01)
        hashMap.put("Brandon Clarke", R.drawable.clarkbr01)
        hashMap.put("Mike Conley", R.drawable.conlemi01)
        hashMap.put("DeMar DeRozan", R.drawable.derozde01)
        hashMap.put("Tim Duncan", R.drawable.duncati01)
        hashMap.put("Joel Embiid", R.drawable.embiijo01)
        hashMap.put("Dorian Finney-Smith", R.drawable.finnedo01)
        hashMap.put("Tobias Harris", R.drawable.harrito02)
        hashMap.put("Jrue Holiday", R.drawable.holidjr01)
        hashMap.put("Jaren Jackson Jr.", R.drawable.jacksja02)
        hashMap.put("Cameron Johnson", R.drawable.johnsca02)
        hashMap.put("Kawhi Leonard", R.drawable.leonaka01)
        hashMap.put("Tyrese Maxey", R.drawable.maxeyty01)
        hashMap.put("Khris Middleton", R.drawable.middlkh01)
        hashMap.put("Donovan Mitchell", R.drawable.mitchdo01)
        hashMap.put("Cameron Payne", R.drawable.payneca01)
        hashMap.put("Julius Randle", R.drawable.randlju01)
        hashMap.put("Derrick Rose", R.drawable.rosede01)
        hashMap.put("Pascal Siakam", R.drawable.siakapa01)
        hashMap.put("Matisse Thybulle", R.drawable.thybuma01)
        hashMap.put("Gary Trent Jr.", R.drawable.trentga02)
        hashMap.put("Trae Young", R.drawable.youngtr01)
        hashMap.put("Karl Malone", R.drawable.malonka01)
        hashMap.put("Magic Johnson", R.drawable.johnsma02)
        hashMap.put("Shaquille O'Neal", R.drawable.onealsh01)
        hashMap.put("Dirk Nowitzki", R.drawable.nowitdi01)

        return hashMap.map { it.key to it.value }.shuffled().toMap()
    }

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val hashName = nameMap()
        for (player in hashName.keys){
            val img = hashName.get(player)
            println(img)
            if (img != null) {
                questionsList.add(genQuestion(player, img ))
            }

        }

        return questionsList
    }

    fun genQuestion(name: String, image: Int ): Question {
      val correctAnswer = (0..3).random()

        val playlength = playerNames.size - 1
        val options = ArrayList<String>()
        while (options.size < 4) {
            val optionName = playerNames[(0..playlength).random()]
            if (! options.contains(optionName) && optionName != name) {
                options.add(optionName)
            }
        }

        options[correctAnswer] = name
        println(correctAnswer)
        println(options[correctAnswer])
        println(options)
        val que = Question(
          //  id,
            "Who is This NBA Player?",
            image,
            options[0] ,options[1],
            options[2], options[3],
            correctAnswer + 1
        )
        println(que)

        return que
    }


}



