package org.zhouyuanyuan.spring_first.prjo;

public class Result {
    private int code;
    private String msg;
    private Object data;

    // 私有构造函数，防止外部直接实例化
    private Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 成功时的静态方法
    public static Result success(Object data) {
        return new Result(200, "操作成功", data);
    }

    // 失败时的静态方法
    public static Result failure(int code, String msg) {
        return new Result(code, msg, null);
    }

    // Getter 方法
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }
}