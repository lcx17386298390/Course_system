package com.evan.demo.fileListener;

import javax.servlet.http.HttpSession;

import com.evan.demo.pojo.ProgressEntity;
import org.apache.commons.fileupload.ProgressListener;
import org.springframework.stereotype.Component;

@Component
public class UploadProgressListener implements ProgressListener {
    private HttpSession session;

    public void setSession(HttpSession session){
        this.session=session;
        ProgressEntity status = new ProgressEntity();
        session.setAttribute("status", status);
    }

    /* pBytesRead  到目前为止读取文件的比特数
     * pContentLength 文件总大小
     * pItems 目前正在读取第几个文件
     */
    public void update(long pBytesRead, long pContentLength, int pItems) {
        ProgressEntity status = (ProgressEntity) session.getAttribute("status");
        status.setPBytesRead(pBytesRead);
        status.setPContentLength(pContentLength);
        status.setPItems(pItems);
        /*文件上传进度监听*/
//        System.out.println("UploadProgressListener update ProgressEntity:  "+status.toString());
    }
}
