package com.udacity.gradle.testing;

/**
 * Created by Mannas on 8/13/2017.
 */

import com.udacity.gradle.builditbigger.BuildConfig;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.concurrent.ExecutionException;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class EndpointsAsyncTaskTest    {
    private String mJoke = null;

    @Test
    public void test() {
        mJoke = null;

        //create task
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(null);
        //start task
        try {
            mJoke =  asyncTask.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Assert.assertNotNull(mJoke); //joke = null
        Assert.assertTrue(!mJoke.startsWith(EndpointsAsyncTask.TAG));
        //IOException raised by calling the BackEnd  :- make sure the backend is running
        Assert.assertTrue(!mJoke.equals("")); // empty joke
    }
}