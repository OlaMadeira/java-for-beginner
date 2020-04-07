import lesson.ClassLesson;
import lesson.InstanceIntroLesson;

/**
 * Класс содержащий main метод.
 */
public class StartPoint
{
    /**
     * Начало выполнения программ.
     * <p>
     * В этом методе вызываются классы-уроки-примеры.
     * <p>
     * Вариант использования:
     * Выбираем интересующий класс, остальные комментируем.
     *
     * @param args массив входящих параметров.
     */
    public static void main(String[] args)
    {
        ClassLesson.startLessonExample(); //02.04.2020
        InstanceIntroLesson.startLessonExample(); //07.04.2020
        //ПримерЗакоментированогоУрокаЧтоБыОнНеВыполнялся.startLessonExample()
    }
}