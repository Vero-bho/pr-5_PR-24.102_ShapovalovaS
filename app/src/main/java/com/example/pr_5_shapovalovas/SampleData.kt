package com.example.pr_5_shapovalovas

import com.example.pr_5_shapovalovas.Message
object SampleData {
    val conversationSample = listOf(
        Message(
            author = "Тренер Алексей",
            body = "Привет! Готов к сегодняшней тренировке? ",
            isTrainer = true
        ),
        Message(
            author = "Вы",
            body = "Привет! Да, но немного болит спина после вчерашней становой.",
            isTrainer = false
        ),
        Message(
            author = "Тренер Алексей",
            body = "Это нормально. Сегодня сделаем лёгкую растяжку и упражнения на пресс, чтобы не перегружать поясницу.",
            isTrainer = true
        ),
        Message(
            author = "Вы",
            body = "Хорошо. А сколько подходов на пресс?",
            isTrainer = false
        ),
        Message(
            author = "Тренер Алексей",
            body = "3 подхода по 15 повторений: скручивания, планка 40 секунд и подъём ног. Между подходами отдых 60 секунд.",
            isTrainer = true
        ),
        Message(
            author = "Вы",
            body = "Понял. А что по питанию после тренировки?",
            isTrainer = false
        ),
        Message(
            author = "Тренер Алексей",
            body = "В течение часа — белковый коктейль или творог с бананом. И не забудь выпить 500 мл воды во время тренировки.",
            isTrainer = true
        ),
        Message(
            author = "Вы",
            body = "Спасибо! Тогда до вечера ",
            isTrainer = false
        ),
        Message(
            author = "Тренер Алексей",
            body = "До встречи! Разомнись перед началом, и всё пройдёт отлично ",
            isTrainer = true
        )
    )
}