package org.facengineer.PublicTools;

public class BaseResponse<T> {

    private int code;

    private String msg;

    private T data;

    public BaseResponse(RespCode rcode, T data){
        this.setCode(rcode.getCode());
        this.setMsg(rcode.getMsg());
        this.setData(data);
    }

    public BaseResponse(int code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static BaseResponse ErrorPage() {
        return new BaseResponse(RespCode.ERROR, "ERROR PAGE");
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
