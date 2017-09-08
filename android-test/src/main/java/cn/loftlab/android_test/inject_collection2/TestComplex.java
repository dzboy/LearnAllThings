package cn.loftlab.android_test.inject_collection2;

import com.google.auto.value.AutoAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import dagger.Component;
import dagger.MapKey;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

/**
 * Created by Administrator on 2017/9/8.
 */

public class TestComplex {
//    @Documented
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target(ElementType.METHOD)
//    @MapKey(unwrapValue = false)
//    @interface ComplexKey {
//        String name();
//        Class<?> implementingClass();
//        int[] thresholds();
//    }
//
//    @Module
//    class MyModule {
//        @Provides
//        @IntoMap
//        @ComplexKey(name = "abc", implementingClass = Abc.class, thresholds = {1, 5, 10})
//        String provideAbc1510Value() {
//            return "foo";
//        }
//    }
//
//    class Abc{
//
//    }
//
//    @Component(modules = MyModule.class)
//    interface MyComponent {
//        Map<ComplexKey, String> myKeyStringMap();
//    }
//
//
//
//    class MyComponentTest {
//        void testMyComponent() {
////            MyComponent myComponent = DaggerMyComponent.create();
////            myComponent.myKeyStringMap()
////                    .get(createMyKey("abc", Abc.class, new int[] {1, 5, 10}))
////                    .isEqualTo("foo");
//        }
//
////        @AutoAnnotation
////        MyKey createMyKey(String name, Class<?> implementingClass, int[] thresholds) {
////            return new AutoAnnotation_MyComponentTest_createMyKey(name, implementingClass, thresholds);
////        }
//    }
}
