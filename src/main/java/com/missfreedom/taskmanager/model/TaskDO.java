package com.missfreedom.taskmanager.model;

import org.springframework.core.task.TaskExecutor;

/**
 * author: JinBingBing
 * description: 定时任务接口
 * time: 2017/1/22 16:42.
 */
public interface TaskDO extends TaskExecutor {

    void executor(Runnable runnable);

}
