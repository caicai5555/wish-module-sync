package com.foundation.service.canal.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 监听事件，用于监听canal事件变更
 * Created by fqh on 2016/10/12.
 */
public class CanalBusiDbListener implements ServletContextListener{


    private BusiAnscWatcherThread watcherConfigThread;

    /**
     * 程序关闭，监听线程就关闭
     * @param contextEvent
     */
    public void contextDestroyed(ServletContextEvent contextEvent) {
        if (watcherConfigThread != null && watcherConfigThread.isInterrupted()) {
            watcherConfigThread.interrupt();
        }
    }

    /**
     * 监听出事化
     *  servlet 上下文初始化时启动 监听zk的线程
     * @param contextEvent
     */
    public void contextInitialized(ServletContextEvent contextEvent) {
        String str = null;
        if (str == null && watcherConfigThread == null) {
            watcherConfigThread = new BusiAnscWatcherThread();
            watcherConfigThread.start(); //
        }
    }



}  