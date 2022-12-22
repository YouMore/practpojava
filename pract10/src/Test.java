import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Student> arr = new ArrayList<Student>(0);
        arr.add(new Student("AIDAR", "ALINBEKOV", 2, 20, 4));
        arr.add(new Student("AIDAR", "ALINBEKOV", 3, 40, 3));
        arr.add(new Student("AIDAR", "ALINBEKOV", 1, 20, 3.5));
        arr.add(new Student("AIDAR", "ALINBEKOV", 3, 10, 5));
        arr.add(new Student("AIDAR", "ALINBEKOV", 2, 60, 3.2));
        arr.add(new Student("AIDAR", "ALINBEKOV", 1, 30, 2.2));
        SortingStudents obj = new SortingStudents(arr);
        // Устанавливаем компаратор на сравнение балла
        ScoreComparator comparator = new ScoreComparator();
        obj.setComparator(comparator);
        obj.outArray();
        obj.sort();
        System.out.println();
        obj.outArray();
        System.out.println();

        // устанавливаем компаратор на сравнение номера группы
        GroupComparator groupComparator = new GroupComparator();
        obj.setComparator(groupComparator);
        obj.sort();
        obj.outArray();

        //test
    }
}
