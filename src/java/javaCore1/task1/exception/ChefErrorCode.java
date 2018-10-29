package javaCore1.task1.exception;

public enum ChefErrorCode {
    INAPPROPRIATE_SALAD_FOOD("The following product is not suitable for salad: "),
    SALAD_SAUCE_EXCEPTION("Inappropriate count sauce for salad! You need to choose one sauce");

    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }

    ChefErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
