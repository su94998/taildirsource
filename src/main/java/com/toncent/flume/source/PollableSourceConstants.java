package com.toncent.flume.source;

/**
 * @author Administrator
 * @Title: PollableSourceConstants
 * @ProjectName taildirsource
 * @Description: TODO
 * @date 2019/4/24 002411:09
 */
public class PollableSourceConstants {
    public static final String BACKOFF_SLEEP_INCREMENT = "backoffSleepIncrement";
    public static final String MAX_BACKOFF_SLEEP = "maxBackoffSleep";
    public static final long DEFAULT_BACKOFF_SLEEP_INCREMENT = 1000;
    public static final long DEFAULT_MAX_BACKOFF_SLEEP = 5000;
}
