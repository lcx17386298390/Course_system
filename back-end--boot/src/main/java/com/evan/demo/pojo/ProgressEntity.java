package com.evan.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class ProgressEntity {
    // 读取的文件的比特数
    private long pBytesRead = 0L;
    // 文件的总大小
    private long pContentLength = 0L;
    // 目前正在读取第几个文件
    private int pItems;

    private long startTime = System.currentTimeMillis();

    public ProgressEntity() {
        pBytesRead = 0L;
        pContentLength = 0L;
    }

    public long getPBytesRead() {
        return pBytesRead;
    }

    public void setPBytesRead(long bytesRead) {
        pBytesRead = bytesRead;
    }

    public long getPContentLength() {
        return pContentLength;
    }

    public void setPContentLength(long contentLength) {
        pContentLength = contentLength;
    }

    public int getPItems() {
        return pItems;
    }

    public void setPItems(int items) {
        pItems = items;
    }

    @Override
    public String toString() {
        float tmp = (float) pBytesRead;
        float result = tmp / pContentLength * 100;
        return "ProgressEntity [pBytesRead=" + pBytesRead + ", pContentLength="
                + pContentLength + ", percentage=" + result + "% , pItems=" + pItems + "]";
    }
}
