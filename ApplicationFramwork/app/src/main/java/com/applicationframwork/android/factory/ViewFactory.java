package com.applicationframwork.android.factory;

import com.applicationframwork.android.views.LoginScreen;
import com.applicationframwork.android.views.SplashScreen;

/**
 * Created by gauravkumar.singh on 7/19/2016.
 * Class using factory pattern to deliver the activity class reference to launch new screen
 */
public class ViewFactory {

    //instance of singleton task
    private static ViewFactory instance;

    // screen id to launch splash screen
    public static final int SPLASH_SCREEN = 0;
    public static final int LOGIN_SCREEN = 1;

    /**
     * To get reference of ViewFactory
     * @return
     */
    public static ViewFactory getInstance() {
        if (instance == null) {
            synchronized (ViewFactory.class) {
                if (instance == null) {
                    instance = new ViewFactory();
                }
            }
        }
        return instance;
    }

    /**
     * To return activity class name.
     * @param id
     * @return
     */
    public Class getActivityClass(int id) {
        switch (id) {
            case SPLASH_SCREEN: {
                return SplashScreen.class;
            }
            case LOGIN_SCREEN: {
                return LoginScreen.class;
            }
        }
        return null;
    }
}
