package com.cybozu.labs.langdetect;

import java.io.Serializable;

/**
 * @author Nakatani Shuyo
 */
enum ErrorCode {
    NoTextError, FormatError, FileLoadError, DuplicateLangError, NeedLoadProfileError, CantDetectError, CantOpenTrainData, TrainDataFormatError, InitParamError
}

/**
 * @author Nakatani Shuyo
 */
public class LangDetectException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;
    private ErrorCode code;

    public LangDetectException(ErrorCode code, String message) {
        super(message);
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }
}
