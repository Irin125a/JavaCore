package JavaCore.HomeWork9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Course> listCourses1 = new ArrayList<>();
        listCourses1.add( new Courses( "Course-A11" ) );
        listCourses1.add( new Courses( "Course-A48" ) );
        listCourses1.add( new Courses( "Course-Б52" ) );
        listCourses1.add( new Courses( "Course-Д09" ) );

        List<Course> listCourses2 = new ArrayList<>();
        listCourses2.add( new Courses( "Course-A11" ) );
        listCourses2.add( new Courses( "Course-Д09" ) );
        listCourses2.add( new Courses( "Course-И44" ) );

        List<Course> listCourses3 = new ArrayList<>();
        listCourses3.add( new Courses( "Course-З38" ) );
        listCourses3.add( new Courses( "Course-Д14" ) );

        List<Course> listCourses4 = new ArrayList<>();
        listCourses4.add( new Courses( "Course-З38" ) );

        List<Student> studentListArray = new ArrayList<>( Arrays.asList(
                new Persons( "Человечек Человечный", listCourses1 ),
                new Persons( "Какой-то чувак", listCourses2 ),
                new Persons( "Пацан Обыкновенный", listCourses3 ),
                new Persons( "Девочка Припевочка", listCourses4 )
        ) );
        System.out.println( "Все студены и их курсы:" );
        studentListArray.forEach( System.out::println );
        System.out.println( "***" );

        System.out.println( "Список уникальных курсов, на которые подписаны студенты:" );
        Main Functions = new Main();
        Functions.uniqueCourses( studentListArray ).forEach( System.out::println );
        System.out.println( "***" );

        System.out.println( "Список из трех самых любознательных (любознательность определяется количеством курсов) студентов:" );
        Functions.theMostActive( studentListArray ).forEach( System.out::println );
        System.out.println( "***" );

        System.out.println( "Студенты, которые посещают Course-З38:" );
        Courses courseFullStack = new Courses( "Course-З38" );
        Functions.atLeastOne( studentListArray, courseFullStack ).forEach( System.out::println );
        System.out.println( "***" );

    }

    public List<Course> uniqueCourses(List<Student> studentList) {
        return studentList.stream()
                .map( Student::getAllCourses )
                .flatMap( List::stream )
                .collect( Collectors.toList() );
    }

    public List<Student> theMostActive(List<Student> studentList) {
        return studentList.stream()
                .sorted( (b1, b2) -> b2.getAllCourses().size() - b1.getAllCourses().size() )
                .limit( 3 )
                .collect( Collectors.toList() );
    }

    public List<Student> atLeastOne(List<Student> studentList, Courses courseFullStack) {
        return studentList.stream()
                .filter( c -> c.getAllCourses().contains( courseFullStack ) )
                .collect( Collectors.toList() );
    }
}