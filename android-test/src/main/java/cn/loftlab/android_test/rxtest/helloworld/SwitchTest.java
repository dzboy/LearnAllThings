package cn.loftlab.android_test.rxtest.helloworld;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.observables.AsyncOnSubscribe;
import rx.observables.SyncOnSubscribe;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/9/12.
 */

public class SwitchTest {

    void test1() {
        Observable.just("xiaoming")
                .map(new Func1<String, Integer>() {
                    @Override
                    public Integer call(String s) {
                        return s.length();
                    }
                })
                .subscribeOn(Schedulers.immediate())
                .observeOn(Schedulers.immediate())
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println(integer);
                    }
                });
    }

    void test2() {
        class Course {
            String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        class Student{
            String name;
            List<Course> courses;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<Course> getCourses() {
                return courses;
            }

            public void setCourses(List<Course> courses) {
                this.courses = courses;
            }
        }

        final List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            String name = "student " + i;
            List<Course> courses = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                Course course = new Course();
                course.setName(name + "'s course"+j);
                courses.add(course);
            }
            student.setName(name);
            student.setCourses(courses);
            students.add(student);
        }
        Observable.from(students)
                .flatMap(new Func1<Student, Observable<Course>>() {
                    @Override
                    public Observable<Course> call(Student student) {
                        System.out.println(student.getName());
                        return Observable.from(student.getCourses());
                    }
                })
                .subscribe(new Subscriber<Course>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Course course) {
                        System.out.println(course.getName());
                    }
                });
    }

    void test3() {
        Observable.just("heeellooo", "world").lift(new Observable.Operator<Integer, String>() {
            @Override
            public Subscriber<? super String> call(final Subscriber<? super Integer> subscriber) {
                return new Subscriber<String>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(String s) {
                        subscriber.onNext(s.length());
                    }
                };
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        });
    }

    void test4() {

//        public <R> Observable<R> lift(Operator<? extends R, ? super T> operator) {
//            return Observable.create(new OnSubscribe<R>() {
//                @Override
//                public void call(Subscriber subscriber) {
//                    Subscriber newSubscriber = operator.call(subscriber);
//                    newSubscriber.onStart();
//                    onSubscribe.call(newSubscriber);
//                }
//            });
//        }

        Subscriber subscriber = new Subscriber<Integer>() {
            public void onCompleted() {}
            public void onError(Throwable throwable) {}
            public void onNext(Integer o) {
                System.out.println(o);
            }
        };

        final Observable.OnSubscribe onSubscribe = new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber subscriber) {
                subscriber.onNext("aaa");
                subscriber.onNext("bbbbb");
            }
        };

        Observable.create(onSubscribe).create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(final Subscriber subscriber) {
                Subscriber newSubscriber = new Subscriber<String>() {
                    public void onCompleted() {}
                    public void onError(Throwable throwable) {}
                    public void onNext(String s) {subscriber.onNext(s.length());}
                };
                newSubscriber.onStart();
                onSubscribe.call(newSubscriber);
            }
        }).subscribe(subscriber);

//        Observable.just("aa","bbbbb").lift(new Observable.Operator<Integer, String>() {
//            public Subscriber<? super String> call(final Subscriber<? super Integer> subscriber) {
//                return new Subscriber<String>() {
//                    public void onCompleted() {}
//                    public void onError(Throwable throwable) {}
//                    public void onNext(String s) {subscriber.onNext(s.length());}
//                };
//            }
//        }).subscribe(new Action1<Integer>() {
//            public void call(Integer aInt) {
//                System.out.print(aInt);
//            }
//        });
    }
    public static void main(String[] args) {
        new SwitchTest().test4();
    }
}
