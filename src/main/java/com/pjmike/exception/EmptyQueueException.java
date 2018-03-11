package com.pjmike.exception;

/**
 * @author pjmike
 * @create 2018-03-11 10:48
 */
public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException() {
        super();
    }

    public EmptyQueueException(String message) {
        super(message);
    }
}
