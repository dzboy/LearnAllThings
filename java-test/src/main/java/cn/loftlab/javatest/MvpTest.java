package cn.loftlab.javatest;

import java.security.Permission;

/**
 * Created by Administrator on 2017/8/17.
 */

public class MvpTest {
    interface BasePresenter {
        void start();
    }
    interface BaseView<T> {
        void setPresenter(T presenter);
    }
    interface TestContract {
        interface Presenter extends BasePresenter{
            void initData();
        }
        interface View<T> extends BaseView<T> {
            void showSomething();
        }
    }

    static class Activity{
        public Activity(){
            Fragment fragment = new Fragment();
            InsPresenter presenter = new InsPresenter(fragment);
            fragment.setPresenter(presenter);
        }
    }

    static class InsPresenter implements TestContract.Presenter {
        private TestContract.View view;
        public InsPresenter(TestContract.View view) {
            this.view = view;
        }
        @Override
        public void start() {
            System.out.println("start");
            initData();
        }

        @Override
        public void initData() {
            System.out.println("load data...");
            view.showSomething();
        }
    }

    static class Fragment implements TestContract.View<InsPresenter> {

        @Override
        public void setPresenter(InsPresenter presenter) {
            presenter.start();
        }

        @Override
        public void showSomething() {
            System.out.println("show something...");
        }
    }

    public static void main(String[] args) {
        new Activity();
    }
}
