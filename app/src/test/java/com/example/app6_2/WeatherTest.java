package com.example.app6_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class WeatherTest {

    @Test
    void executeAsyncTask_ShouldExecuteAsyncTask() throws InterruptedException, ExecutionException, TimeoutException {
        Weather weather = new Weather(127.7785, 26.2815, "0cc10e651c9d70f8fa70565a4a081246");
    }
}
