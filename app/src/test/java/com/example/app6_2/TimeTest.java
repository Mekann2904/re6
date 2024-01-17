package com.example.app6_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TimeTest {

    @Test
    void startClock_ShouldStartClock() {
        // セットアップ
        MainActivity mainActivity = new MainActivity();
        Time time = new Time(mainActivity);

        // メソッド実行
        time.startClock();
    }

    @Test
    void stopClock_ShouldStopClock() {
        // セットアップ
        MainActivity mainActivity = new MainActivity();
        Time time = new Time(mainActivity);

        // メソッド実行
        time.stopClock();

    }

    @Test
    void displayCurrentTime_ShouldDisplayCurrentTime() {
        // セットアップ
        MainActivity mainActivity = new MainActivity();
        Time time = new Time(mainActivity);

        // メソッド実行
        time.displayCurrentTime();

    }
}
