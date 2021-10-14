package com.example.mybatispractice.exception;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/11 15:06
 * @Description:
 */
public class PracticeException extends Throwable{


    public PracticeException() {
    }

    public PracticeException(String message) {
        super(message);
    }

    public PracticeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PracticeException(Throwable cause) {
        super(cause);
    }

    public PracticeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
