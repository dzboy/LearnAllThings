package com.loftlab.javatest;

import javax.xml.crypto.Data;

/**
 * Created by Administrator on 2017/8/18.
 */

public class MvpTest {
    interface BasePresenter{
        void start();
    }
    interface BaseView<T extends BasePresenter> {
        void setPresenter(T presenter);
    }
    interface TestContract {
        interface Presenter extends BasePresenter{
            void initData();
            void getSomething();
        }
        interface View extends BaseView<Presenter> {
            void showSomething();
            void showGetSuccess();
        }
    }

    static class Fragment implements TestContract.View {

        TestContract.Presenter presenter;
        @Override
        public void setPresenter(TestContract.Presenter presenter) {
            this.presenter = presenter;
            presenter.start();
        }

        @Override
        public void showSomething() {
            presenter.getSomething();
            System.out.println("show something");
        }

        @Override
        public void showGetSuccess() {
            System.out.println("show get success");
        }
    }

    static class TestPresenter implements TestContract.Presenter {

        private TestContract.View view;
        private DataService service;

        public TestPresenter(TestContract.View view, DataService service) {
            this.view = view;
            this.service = service;
            view.setPresenter(this);
        }

        @Override
        public void start() {
            System.out.println("start");
            initData();
        }

        @Override
        public void initData() {
            System.out.println("init data");
            service.initAllData();
            view.showGetSuccess();
        }

        @Override
        public void getSomething() {
            System.out.println("get something");
            service.getData(1);
            view.showGetSuccess();
        }
    }

    static class DataService {
        public void initAllData() {
            System.out.println("initAllData ");
        }
        public void getData(int i) {
            System.out.println("get something " + i);
        }
    }

    static class Activity {
        public Activity() {
            Fragment fragment = new Fragment();
            DataService service = new DataService();
            TestContract.Presenter presenter = new TestPresenter(fragment,service);
            System.out.println("------------");
            presenter.getSomething();
        }
    }

    public static void main(String[] args) {
        new Activity();
    }
}
