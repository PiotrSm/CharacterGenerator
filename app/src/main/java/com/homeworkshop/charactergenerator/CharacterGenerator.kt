package com.homeworkshop.charactergenerator

fun <T> List<T>.rand() = shuffled().first()
fun Int.randInt() = (0..this).toList().shuffled().first()
private val nameList = listOf("Marchewa", "Wolf", "Pacyna")
private val rankList = listOf("wyga", "młody", "vice")
fun Int.roll() = (0 until this).map { (1..6).toList().rand() }.sum()


object CharacterGenerator {
    data class CharacterData(
            val name: String,
            val rank: String,
            val strong: Int,
            val age: Int
    )
    private fun getName() = nameList.rand()
    private fun getAge() = 4.roll()
    fun generateCharater() = CharacterData(
            //można ustawiać funkcją albo bezpośrednio
            name = getName(),
            rankList.rand(),
            6.roll(),
            age = getAge()
    )
}