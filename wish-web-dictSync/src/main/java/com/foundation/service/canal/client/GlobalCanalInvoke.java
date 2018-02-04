package com.foundation.service.canal.client;

import com.alibaba.otter.canal.protocol.CanalEntry;
import com.foundation.canal.invoke.ICanalInvoke;

import java.util.List;

/**
 * @author fqh
 * @version 1.0  2016/9/25
 */
public class GlobalCanalInvoke implements ICanalInvoke {
    @Override
    public void onInsert(CanalEntry.RowData rowData) {
        printColumn(rowData.getAfterColumnsList());
    }

    @Override
    public void onDelete(CanalEntry.RowData rowData) {
        printColumn(rowData.getBeforeColumnsList());
    }

    @Override
    public void onUpdate(CanalEntry.RowData rowData) {
        System.out.println("-------> before");
        printColumn(rowData.getBeforeColumnsList());
        System.out.println("-------> after");

        printColumn(rowData.getAfterColumnsList());
    }

    private static void printColumn(List<CanalEntry.Column> columns) {
        for (CanalEntry.Column column : columns) {
            System.out.println(column.getName() + " : " + column.getValue() + "    update=" + column.getUpdated());
        }
    }
}
