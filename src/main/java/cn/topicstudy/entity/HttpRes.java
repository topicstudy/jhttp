package cn.topicstudy.entity;

import java.util.Map;

public class HttpRes {
    // 响应码（属于响应行）
    private String responseCode;
    // 响应头
    private Map<String, String> responseHeadMap;
    // 响应体-文本
    private String textResponseBody;
    // 响应体-二进制
    private byte[] binaryResponseBody;
    // 错误信息
    private String textErrorResponseBody;

    public HttpRes() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Map<String, String> getResponseHeadMap() {
        return responseHeadMap;
    }

    public void setResponseHeadMap(Map<String, String> responseHeadMap) {
        this.responseHeadMap = responseHeadMap;
    }

    public String getTextResponseBody() {
        return textResponseBody;
    }

    public void setTextResponseBody(String textResponseBody) {
        this.textResponseBody = textResponseBody;
    }

    public byte[] getBinaryResponseBody() {
        return binaryResponseBody;
    }

    public void setBinaryResponseBody(byte[] binaryResponseBody) {
        this.binaryResponseBody = binaryResponseBody;
    }

    public String getTextErrorResponseBody() {
        return textErrorResponseBody;
    }

    public void setTextErrorResponseBody(String textErrorResponseBody) {
        this.textErrorResponseBody = textErrorResponseBody;
    }

    @Override
    public String toString() {
        String s = "";
        if (binaryResponseBody != null) {
            for (int i = 0; i < Math.min(10, binaryResponseBody.length); i++) {
                s += ((int) binaryResponseBody[i] + ",");
            }
            s += "...total byte array length is " + binaryResponseBody.length;
        }

        return "HttpRes{" +
                "responseCode='" + responseCode + '\'' +
                ", responseHeadMap=" + responseHeadMap +
                ", textResponseBody='" + textResponseBody + '\'' +
                ", binaryResponseBody=" + s +
                ", textErrorResponseBody='" + textErrorResponseBody + '\'' +
                '}';
    }
}
