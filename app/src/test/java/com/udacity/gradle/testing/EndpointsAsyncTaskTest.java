package com.udacity.gradle.testing;

/**
 * Created by Mannas on 8/13/2017.
 */

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Assert;
import org.junit.Test;

public class EndpointsAsyncTaskTest {

    @Test
    public void verifyEndpointsResponse() {


        String joke=null;
        try {
            joke = (new EndpointsAsyncTask(null)).execute(null,null,null).get();
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        Assert.assertNotNull(joke);
        Assert.assertTrue(!joke.startsWith(EndpointsAsyncTask.TAG));
        Assert.assertTrue(!joke.equals(""));
    }
}