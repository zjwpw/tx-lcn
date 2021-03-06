package com.lorne.tx.db;

import com.lorne.core.framework.utils.task.Task;
import com.lorne.tx.compensate.model.TransactionRecover;

/**
 * create by lorne on 2017/8/22
 */
public interface Resource<T> {

    void close() throws Exception;

    Task getWaitTask();

    String getGroupId();

    void transaction() throws Exception;

    void setHasIsGroup(boolean isGroup);

    void addCompensate(TransactionRecover recover);

    T get();
}
