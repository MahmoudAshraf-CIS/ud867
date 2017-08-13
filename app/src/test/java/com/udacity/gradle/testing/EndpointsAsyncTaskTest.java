package com.udacity.gradle.testing;

/**
 * Created by Mannas on 8/13/2017.
 */

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

public class EndpointsAsyncTaskTest {

    @Test
    public void verifyEndpointsResponse() {

        try {
            String joke = (new EndpointsAsyncTask(null)).get();

            assert (!joke.equals(null));
        } catch (Exception e) {
            e.fillInStackTrace();
        }


    }
}
